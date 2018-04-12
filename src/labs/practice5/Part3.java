package labs.practice5;

import java.util.concurrent.TimeUnit;

/**
 * Demonstrates how synchronized access to the objects works.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Part3 implements Runnable {
	/**
	 * First counter.
	 */
	public int counter1 = 0;
	
	/**
	 * Second counter.
	 */
	public int counter2 = 0;
	

	/**
	 * Synchronized access to the counters.
	 * 
	 * Change state of each counter.
	 */
	@Override
	public void run() {
		try {
			synchronized (this) {
				while (true) {
					System.out.println(counter1 + " == " + counter2);
					counter1++;
					TimeUnit.MILLISECONDS.sleep(100);
					counter2++;
					TimeUnit.MILLISECONDS.sleep(100);
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted");
		}

	}

	/**
	 * Enter point to the Part3.
	 * 
	 * Starts two threads which change state of the counters 
	 * after each other.
	 * 
	 * @param args input parameters.
	 * @throws InterruptedException in case of interruption of the thread.
	 */
	public static void main(String[] args) throws InterruptedException {

		Part3 obj = new Part3();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);

		t1.start();
		t2.start();

		TimeUnit.SECONDS.sleep(3);
		t1.interrupt();
		t2.interrupt();
		

	}

}
