package lessons.group7;

import java.util.concurrent.TimeUnit;

public class DeadLockExample {
	
	private static Object a = new Object();
	private static Object b = new Object();
	
	public static void main(String[] args) {
		Thread t = new Thread(DeadLockExample::runThread1);
		Thread t2 = new Thread(DeadLockExample::runThread2);
		
		t.start();
		t2.start();
		
		
		
	}
	
	public static void runThread1() {
		synchronized (a) {
			System.out.println("A CAPTURED");
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (b) {
				System.out.println("B CAPTURED");
			}
			
		}
	}
	
	public static void runThread2() {
		synchronized (b) {
			System.out.println("ahahah - B captured");
			synchronized (a) {
				System.out.println("You will never get here");
				
			}
		}
	}
	
	

}
