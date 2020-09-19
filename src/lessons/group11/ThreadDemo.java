package lessons.group11;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import multithreading.different.Synchronized1;

public class ThreadDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
////				while(true) {
//					System.out.println("I'm new thread! My name is " + Thread.currentThread().getName());
////				}
//			}
//		});
//		thread.start();
//		
//		var thread2 = new Thread(() -> System.out.println("I'm new thread! My name is " + Thread.currentThread().getName()));
//		thread2.start();
//		
////		while (true) {
//			System.out.println("Main thread. My name is " + Thread.currentThread().getName());
////		}
//			
//		thread2.setPriority(Thread.MAX_PRIORITY);
////		thread2.setDaemon(true);
//		
//		CustomThread ct = new CustomThread();
//		ct.start();
		
		// ====================== Interrupt 
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
//		es.execute(ThreadDemo::someAction);
		
//		IntStream.range(0, 99)
//       	     .forEach(i -> es.execute(ThreadDemo::someAction));

		Callable<Integer> callable = () -> {
			TimeUnit.SECONDS.sleep(2);
			return 1;
		};
		
//		Future<Integer> futureResult = es.submit(() -> {
//			TimeUnit.SECONDS.sleep(2);
//			return 1;
//		});
//		System.out.println(futureResult.get());
		
		List<Future<Integer>> futures = es.invokeAll(new ArrayList<Callable<Integer>>(Arrays.asList(callable, 
				callable, callable)));
		
		int maxInt = Integer.MIN_VALUE;
		for (Future<Integer> future : futures) {
			int someInt = future.get();
			if (maxInt < someInt) {
				maxInt = someInt;
			}
		}
		System.out.println(maxInt);
		
		es.submit(callable);
		es.shutdown();
//		es.submit(callable);
		es.awaitTermination(1, TimeUnit.SECONDS);
		if (es.isTerminated()) {
			System.out.println("Terminated successfully");
		} else {
			List<Runnable> notFinishedTasks = es.shutdownNow();
			System.out.println("ES has uncompleted tasks");
		}
		
		
		
		
		
		// ============== throw exception from RUN
		
//		var thread3 = new Thread(() -> {
//			throw new RuntimeException(new FileNotFoundException());
//		});
//		
//		try {
//			thread3.start();
//		} catch (RuntimeException e) {
//			if (e != null) {
//				System.out.println("=======================");
//				e.getCause().printStackTrace();
//			}
//		}
//		
		
		
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
