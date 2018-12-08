package lessons;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class Lesson14_2 {
	
	public static void main(String[] args) throws InterruptedException {
//		Thread t = new Thread(() -> System.out.println(Thread.currentThread().getName()));
//		t.start();
//		System.out.println(Thread.currentThread().getName());
//		
//		ThreadCustom tc = new ThreadCustom();
//		tc.start();
//		
//		
//		
//		
//		synchronized (t) {
//			
//		}
		
		Thread t = new Thread(new A133());
		t.start();
		
		TimeUnit.SECONDS.sleep(2);
		t.interrupt();
		
		
	}

}

class ThreadCustom<E> extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hello from new thread");
		System.out.println(Thread.currentThread().getName());
	}
}

class A132<E> extends ThreadCustom<E> implements Comparable<E> {

	@Override
	public int compareTo(E o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


class A133 implements Runnable {

	@Override
	public void run() {
		while (! Thread.currentThread().isInterrupted() ) {
			System.out.println("print");
			throw new RuntimeException(new FileNotFoundException());
		}
	}
	
}