package lessons.group8;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lesson14 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		Integer[] arr = {1, 2, 3};
//		Integer[] array = Arrays.stream(arr).filter(i -> i % 2 == 0).toArray(Integer[]::new);
//		System.out.println(Arrays.toString(array));
		
//		Thread t = new Thread(() -> {
//			System.out.println(Thread.currentThread().getName());
//			throw new RuntimeException(new FileNotFoundException());
//		}, "NEW THREAD");
//		t.start();
//		System.out.println(Thread.currentThread().getName());
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> future = es.submit(() -> {
			return 1 + 2;
		});
		
		System.out.println(future.get());
		
		
		
	}

}
