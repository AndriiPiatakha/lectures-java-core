package multithreading.examples1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class DeadLockExample {

	static A a = new A();
	static B b = new B();

	public static void doSmth1() {
		synchronized (a) {
			System.out.println("Caught A object");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (b) {
				System.out.println("You can never get here");
			}
		}
	}

	public static void doSmth2() {
		synchronized (b) {
			System.out.println("Caught B object");
			synchronized (a) {
				System.out.println("You can never get here");
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(DeadLockExample::doSmth1);
		Thread t2 = new Thread(DeadLockExample::doSmth2);

		t1.start();
		t2.start();

//		CompletableFuture.supplyAsync(() -> {
//				System.out.println("SMTH");
//				return null;
//		});


	}

}

class A {

}

class B {

}
