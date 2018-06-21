package multithreading;

import java.util.concurrent.TimeUnit;

public class StartThread {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e1) {
			}
			System.out.println("Hello from other thread " + Thread.currentThread().getName());
		});
		t.setDaemon(true);
		t.start();
		Ex e = new Ex();
		e.setDaemon(true);
		e.start();
		e.join();
		System.out.println("Main thread " + Thread.currentThread().getName());
		TimeUnit.SECONDS.sleep(2);
		System.out.println("MAIN THREAD IS FINISHED");
	}
}

class Ex extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hello from other thread " + Thread.currentThread().getName());
	}
}

class Ex2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
