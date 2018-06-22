package test;

import java.util.concurrent.locks.ReentrantLock;

public class SashsMultithreadHw {

	private static String str = "";
	private static int index;
	private static int regulator;
	private static volatile boolean stop = true;
	private static ReentrantLock lock = new ReentrantLock();

	private static class Writer implements Runnable {

		String[] arr = { "FIRST line", "SECOND line", "THIRD line" };

		// public WriterAndReaders_Writer(WriterAndReaders_Text str) {
		// this.str = str;
		// }

		@Override
		public void run() {
			while (true) {
//				System.out.println("========== " + stop);
				if (index == 3) {
					index = 0;
				} else if (stop) {
				try {
//					System.out.println("=========== STOP TRUE");
					lock.lock();
					str = arr[index];
					System.out.println("Writer wrote: " + str);
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					System.err.println("Writer is stoped");
				}
				index++;
				stop = false;
				lock.unlock();
				}
			}
		}

		// public String getStr() {
		// return str;
		// }
		//
		// public int getRegulator() {
		// return regulator;
		// }
		//
		// public void setRegulator() {
		// this.regulator += 1;
		// }
	}

	private static class Reader implements Runnable {
		private String previousStr = "";

		// public Reader(Writer writer) {
		// this.writer = writer;
		// }

		@Override
		public void run() {
			while (true) {
				if (!previousStr.equals(str)) {
					lock.lock();
					previousStr = str;
					System.out.println(Thread.currentThread().getName() + str);
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						System.err.println(Thread.currentThread().getName() + "is stoped");
					}
					regulator++;
					System.out.println(regulator);
					if (regulator == 3) {
						System.out.println("=======================================================");
						stop = true;
					}
					lock.unlock();
				} else if(regulator == 3) {
					regulator = 0;
				}	
			}

		}
	}

	public static void main(String[] args) {

		Writer writer = new Writer();
		Thread threadWriter = new Thread(writer);
		Reader reader1 = new Reader();
		Thread threadReader1 = new Thread(reader1);
		threadReader1.setName("Reader-1 read:  ");
		Reader reader2 = new Reader();
		Thread threadReader2 = new Thread(reader2);
		threadReader2.setName("Reader-2 read:  ");
		Reader reader3 = new Reader();
		Thread threadReader3 = new Thread(reader3);
		threadReader3.setName("Reader-3 read:  ");

		threadWriter.start();
		threadReader1.start();
		threadReader2.start();
		threadReader3.start();

		try {
			Thread.currentThread().sleep(6000);
			System.out.println(threadWriter.getName() + threadWriter.isAlive());
			System.out.println(threadReader1.getName() + threadWriter.isAlive());
			System.out.println(threadReader2.getName() + threadWriter.isAlive());
			System.out.println(threadReader3.getName() + threadWriter.isAlive());
			// System.out.println(stop);
			// System.out.println(regulator);
			System.out.println("locked?  " + lock.isLocked());
			// threadWriter.interrupt();
			// threadReader1.interrupt();
			// threadReader2.interrupt();
			// threadReader3.interrupt();
			// Thread.currentThread().interrupt();
		} catch (InterruptedException e) {
		}
	}

}
