package multithreading.demo;

import java.util.concurrent.TimeUnit;

public class FirstLessonMultithreading {
	
	private static int i = 0;
	private static int iterationNumber = 10000;
	
	private Object mutex;
	
	public FirstLessonMultithreading(Object mutex) {
		this.mutex = mutex;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Object mutex = new Object();
		FirstLessonMultithreading f = new FirstLessonMultithreading(mutex);
		FirstLessonMultithreading f2 = new FirstLessonMultithreading(mutex);
		var thread = new Thread( () 
				-> {
					for (int i1 = 0; i1 < iterationNumber; i1++) {
//						FirstLessonMultithreading.someStatic();
						f.someMethod();
//						System.out.println("*" + i1);
					}
				});
		
		var thread2 = new Thread( () 
				-> {
					for (int i1 = 0; i1 < iterationNumber; i1++) {
//						FirstLessonMultithreading.someStatic();
						f2.someMethod();
//						System.out.println("-" + i1);
					}
				});
		
		thread.start();
		thread2.start();
		
		thread.join();
		thread2.join();

		System.out.println(i);
		
		var t3 = new Thread(() -> {
			System.out.println("t3 is started");
			try {
//				Thread.sleep(1000);
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("Thread is stopped");
			}
		});
		
		t3.setDaemon(true);
		t3.start();
		
		TimeUnit.SECONDS.sleep(2);
		
//		t3.interrupt();
		
	}
	
	static void someStatic() {
		
		synchronized (FirstLessonMultithreading.class) {
			i = i + 1;
		}
		
	}
	
	void someMethod() {
		synchronized (mutex) {
			i = i + 1;
		}
		
	}

}
