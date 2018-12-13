package lessons.group2;

import java.util.concurrent.TimeUnit;

import tests.A;

public class Lesson15_2 {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		Thread t = new Thread(new SmthRunnable(a, b));
		Thread t2 = new Thread(new SmthRunnable2(a, b));
		
		t.start();
		t2.start();
		
	}

}

class SmthRunnable implements Runnable {
	
	private A a;
	private B b;

	public SmthRunnable(A a2, B b2) {
		this.a = a2;
		this.b = b2;
	}

	@Override
	public void run() {
		synchronized (a) {
			System.out.println("A's monitor is captured");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (b) {
				System.out.println("You will never get here");
			}
		}
	}
}

class SmthRunnable2 implements Runnable {
	
	private A a;
	private B b;

	public SmthRunnable2(A a2, B b2) {
		this.a = a2;
		this.b = b2;
	}

	@Override
	public void run() {
		synchronized (b) {
			System.out.println("B's monitor is captured");
			synchronized (a) {
				System.out.println("You will never get here");
			}
		}
	}
}

class B {
	
}
