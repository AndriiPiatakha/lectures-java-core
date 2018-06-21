package labs.practice5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
 
/**
 * Class synchronize work of writer and readers.
 * 
 * This class cooperate behavior of writer and readers. At first writer writes
 * to buffer, after that readers should read from buffer. Every reader uses its
 * own thread for reading.
 * 
 * After every reader has read from buffer writer erase buffer and write again.
 * 
 * This cycle repeats specified times in the constant field ITERATION_NMBER.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Part53 {

	/**
	 * Number of cycle repeats.
	 */
	private static final int ITERATION_NUMBER = 3;

	/**
	 * Number of readers.
	 */
	private static final int READERS_NUMBER = 3;

	/**
	 * Buffer to write and to read from.
	 */
	private static final StringBuilder BUFFER = new StringBuilder();

	/**
	 * Buffer length.
	 */
	private static final int BUFFER_LENGTH = 5;

	/**
	 * Speed parameter.
	 */
	private static final int PAUSE = 5;

	/**
	 * Boolean flag of stop signal.
	 */
	private static boolean stop;

	/**
	 * Lock object for synchronization of threads.
	 */
	private static ReentrantLock lock = new ReentrantLock();

	/**
	 * Shows amount of readers which haven't read from buffer yet. Reader
	 * counter.
	 */
	private static volatile int readersRead = READERS_NUMBER;

	/**
	 * Constant object for generating random int numbers for thread sleep.
	 */
	private static final Random RANDOM = new Random();

	/**
	 * Maximum available random int number.
	 */
	private static final int MAX_RANDOM = 1_000;

	/**
	 * Minimum available random int number.
	 */
	private static final int MIN_RANDOM = 100;

	/**
	 * Reader class which extends Thread and reads from buffer.
	 * 
	 * Overrides run method and synchronized all readers between each others.
	 * 
	 * @author Andrey Pyatakha
	 *
	 */
	private static class Reader extends Thread {

		/**
		 * In while loop calls read() method from the synchronized block.
		 * 
		 * Call of read() method is synchronized by Lock object so that it is
		 * impossible that two threads calls read at the same time.
		 * 
		 * Sleep for random time after had called read method.
		 * 
		 */
		@Override
		public void run() {
			while (!stop) {
				if (readersRead == 0) {
					try {
						lock.lock();
						// read from the buffer
						read(getName());
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						++readersRead;
						lock.unlock();
					}
				}
				try {
					TimeUnit.MICROSECONDS.sleep(getRand());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Writer class which extends Thread and writes to the buffer.
	 * 
	 * Overrides run method and synchronized all readers between each others.
	 * 
	 * @author Andrey Pyatakha
	 *
	 */
	private static class Writer extends Thread {

		/**
		 * In while loop calls write() method from the synchronized block.
		 * 
		 * Call of write() method is synchronized by Lock object so that it is
		 * impossible that readers runs before writer has written to buffer.
		 * 
		 */
		@Override
		public void run() {
			int tact = 0;
			while (!stop) {
				try {
					while (readersRead != READERS_NUMBER) {
						TimeUnit.MICROSECONDS.sleep(getRand());
					}
					lock.lock();
					// write to the buffer
					write();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					readersRead = 0;
					lock.unlock();
					if (++tact == ITERATION_NUMBER) {
						while (readersRead != READERS_NUMBER) {
							try {
								TimeUnit.MICROSECONDS.sleep(getRand());
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						stop = true;
					}
				}
			}
		}
	}

	/**
	 * Reads from buffer char by char.
	 * 
	 * Prints result to console. After work is done increased readersRead
	 * counter by one.
	 * 
	 * @param threadName
	 *            name of Thread which calls this method
	 * @throws InterruptedException
	 *             in case of interruption of thread
	 */
	private static void read(String threadName) throws InterruptedException {
		System.out.printf("Reader %s:", threadName);
		for (int j = 0; j < BUFFER_LENGTH; j++) {
			Thread.sleep(PAUSE);
			System.out.print(BUFFER.charAt(j));
		}
		System.out.println();
		Thread.sleep(5);
	}

	/**
	 * Writes to buffer char by char.
	 * 
	 * At the beginning reset buffer length to zero. Writes chars to buffer
	 * randomly choosing letter from English alphabet.
	 * 
	 * @param threadName
	 *            name of Thread which calls this method
	 * @throws InterruptedException
	 *             in case of interruption of thread
	 */
	private static void write() throws InterruptedException {
		// clear buffer
		BUFFER.setLength(0);
		// write to buffer
		System.err.print("Writer writes:");

		for (int j = 0; j < BUFFER_LENGTH; j++) {
			Thread.sleep(PAUSE);
			char ch = (char) ('A' + RANDOM.nextInt(26));
			System.err.print(ch);
			BUFFER.append(ch);
		}
		System.err.println();
		Thread.sleep(5);
	}

	/**
	 * Enter point to Part51 application.
	 * 
	 * Create and start readers threads.
	 * 
	 * Create and starts writer thread.
	 * 
	 * @param args
	 *            input parameters.
	 * @throws InterruptedException
	 *             in case of exception while sleeping.
	 */
	public static void main(String[] args) throws InterruptedException {
		// create writer
		Writer writer = new Writer();

		// create readers
		List<Thread> readers = new ArrayList<>();
		for (int j = 0; j < READERS_NUMBER; j++) {
			readers.add(new Reader());
		}

		// start readers
		Thread.sleep(10);
		for (Thread reader : readers) {
			reader.start();
		}

		// start writer
		Thread.sleep(10);
		writer.start();

		// main thread is waiting for the child threads
		writer.join();
		for (Thread reader : readers) {
			reader.join();
		}
	}

	/**
	 * Generate and returns random int number.
	 * 
	 * @return random int number
	 */
	
	private static int getRand() {
		return RANDOM.nextInt(MAX_RANDOM - MIN_RANDOM) + MIN_RANDOM;
	}

}
