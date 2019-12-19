package lessons.group9;

import java.util.concurrent.TimeUnit;

public class Lesson14_2 {

	private static Object a = new Object();
	private static Object b = new Object();
	
	public static void main(String[] args) {
		Thread t1 = new Thread(Lesson14_2::thread1);
		Thread t2 = new Thread(Lesson14_2::thread2);
		t1.start();
		t2.start();
	}

	public static void thread1() {
		try {
			synchronized (a) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println("Waiting till B is released...");
				synchronized (b) {
					System.out.println("You will never get here");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void thread2() {
		try {
			synchronized (b) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println("Waiting till A is released...");
				synchronized (a) {
					System.out.println("You will never get here");
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
