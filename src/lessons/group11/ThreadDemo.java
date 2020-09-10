package lessons.group11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import multithreading.different.Synchronized1;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
//				while(true) {
					System.out.println("I'm new thread! My name is " + Thread.currentThread().getName());
//				}
			}
		});
		thread.start();
		
		var thread2 = new Thread(() -> System.out.println("I'm new thread! My name is " + Thread.currentThread().getName()));
		thread2.start();
		
//		while (true) {
			System.out.println("Main thread. My name is " + Thread.currentThread().getName());
//		}
			
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.setDaemon(true);
		
		CustomThread ct = new CustomThread();
		ct.start();
		
		// ====================== Interrupt 
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		es.execute(ThreadDemo::someAction);
		
		IntStream.range(0, 99)
       	     .forEach(i -> es.execute(ThreadDemo::someAction));

		
		
		
	}
	
	public static void someAction() {
		System.out.println("I'm new thread! My name is " + Thread.currentThread().getName());
	}

}

class CustomThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Child thread. My name is " + Thread.currentThread().getName());
	}
}
