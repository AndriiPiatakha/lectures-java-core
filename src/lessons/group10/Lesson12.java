package lessons.group10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Lesson12 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		Thread t = new Thread(() -> {
//			try {
//				while (true) {
//					System.out.println(Thread.currentThread().getName());
//
////					Thread.sleep(1000);
//					TimeUnit.SECONDS.sleep(1);
//
//				}
//			} catch (InterruptedException e) {
//				System.out.println("Thread is interrupted");
//			}
//		});
//
//		t.start();
//
//		TimeUnit.SECONDS.sleep(5);
//
//		t.interrupt();

		
		Callable<String> callable = () -> "result";
		
		ExecutorService es = Executors.newFixedThreadPool(4);
		Future<String> future = es.submit(callable);
		
		System.out.println(future.get());
		
		Collection<Callable<String>> tasks = Arrays.asList(
				callable,
				() -> "result2",
				() -> "result3");
		
		List<Future<String>> futures = es.invokeAll(tasks);
		for (Future<String> future2 : futures) {
			System.out.println(future2.get());
		}
		
	}

}
