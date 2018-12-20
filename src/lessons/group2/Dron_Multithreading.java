package lessons.group2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Dron_Multithreading {

	private static ReentrantLock lock = new ReentrantLock();
	private static final StringBuilder BUFFER = new StringBuilder();
	private static boolean stop = false;

	private static class Stoper extends Thread {

		@Override
		public void run() {

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			stop = !stop;
		}
	}

	private static class Reader extends Thread {

		@Override
		public void run() {

			if (true) {
				lock.lock();
				try {
					read(getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		}
	}

	private static class Writer extends Thread {

		@Override
		public void run() {

			if (true) {
				lock.lock();
				try {
					write();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private static void read(String threadName) throws InterruptedException {

		System.out.printf("Reader %s:", threadName);
		for (int i = 0; i < 5; i++) {
			System.out.print(BUFFER.charAt(i));
		}
		System.out.println();
		Thread.sleep(5);
	}

	private static void write() throws InterruptedException {

		BUFFER.setLength(0);
		System.out.print("Writer: ");
		for (int i = 0; i < 5; i++) {
			char ch = (char) (65 + (int) (Math.random() * 100) % 26);
			BUFFER.append(ch);
			System.out.print(ch);
		}
		System.out.println();
		Thread.sleep(5);
	}

	public static void main(String[] args) throws InterruptedException {

		Stoper stoper = new Stoper();
		stoper.start();

		while (!stop) {

			Writer writer = new Writer();
			List<Thread> readers = new ArrayList<>();
			for (int i = 0; i < 3; i++)
				readers.add(new Reader());

			Thread.sleep(10);
			writer.start();
			Thread.sleep(10);
			for (Thread reader : readers) {
				reader.start();
			}
			writer.join();
			for (Thread reader : readers) {
				reader.join();
			}

		}
	}

}