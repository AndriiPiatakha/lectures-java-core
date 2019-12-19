package lessons.group9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Lesson14 {
	
	private static final int TIMEOUT_BEFORE_CANCELLING_THREADS = 60;
	private static List<Future> futures;
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		futures = new ArrayList<>();
		ExecutorService maksim = Executors.newFixedThreadPool(2);
		Future<String> future = maksim.submit(() -> {
			// some calculations
			// e.g. finding max in row
			// int max
			return "some string is returned";
		});
		futures.add(future);
		System.out.println("something else is going...");
		
		processFutures();
		maksim.shutdown();
		if (maksim.awaitTermination(TIMEOUT_BEFORE_CANCELLING_THREADS, TimeUnit.SECONDS)) {
			maksim.shutdownNow();
		};
		
		Collection<Callable<Integer>> tasks = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			tasks.add(Lesson14::call);
		}
		List<Future<Integer>> features2 = maksim.invokeAll(tasks);
	
	}
	
	private static int call() {
		return 1;
	}

	private static void processFutures() throws InterruptedException, ExecutionException {
//		int max;
//		for (Future future : futures) {
//			int value = future.get();
//			if (value > max) {
//				max = value;
//			}
//			System.out.println(future.get());
//		}
//		return max;
	}
}
