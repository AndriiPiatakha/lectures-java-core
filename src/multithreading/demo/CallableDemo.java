package multithreading.demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableDemo {
	

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		Callable<String> callable = new Callable<String>() {
		    @Override
		    public String call() throws Exception {
		        // Perform some computation
		        Thread.sleep(2000);
		        return "Return some result";
		    }
		};
		
		//Note that with Callable, you don’t need to surround 
		// Thread.sleep() by a try/catch block, because unlike Runnable, 
		// a Callable can throw a checked exception.
		
		Callable<String> callable2 = () -> {
		    // Perform some computation
		    Thread.sleep(2000);
		    return "Return some result";
		};
		
		// ===========================
		
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//        Callable<String> callable3 = () -> {
//            // Perform some computation
//            System.out.println("Entered Callable");
//            Thread.sleep(2000);
//            return "Hello from Callable";
//        };
//
//        System.out.println("Submitting Callable");
//        Future<String> future = executorService.submit(callable3);
//
//        // This line executes immediately
//        System.out.println("Do something else while callable is getting executed");
//
//        System.out.println("Retrieve the result of the future");
//        // Future.get() blocks until the result is available
//        String result = future.get();
//        System.out.println(result);
//
//        executorService.shutdown();

        
        // ==================================
        
//        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
//
//        Future<String> future4 = executorService2.submit(() -> {
//            Thread.sleep(2000);
//            return "Hello from Callable";
//        });
//
//        while(!future4.isDone()) {
//            System.out.println("Task is still not done...");
//            Thread.sleep(200);
//        }
//
//        System.out.println("Task completed! Retrieving the result");
//        String result2 = future4.get();
//        System.out.println(result2);
//
//        executorService2.shutdown();
        
        
        // ============================
        
//        ExecutorService executorService3 = Executors.newSingleThreadExecutor();
//
//        long startTime = System.nanoTime();
//        Future<String> future5 = executorService3.submit(() -> {
//            Thread.sleep(2000);
//            return "Hello from Callable";
//        });
//
//        while(!future5.isDone()) {
//            System.out.println("Task is still not done...");
//            Thread.sleep(200);
//            double elapsedTimeInSec = (System.nanoTime() - startTime)/1000000000.0;
//
//            if(elapsedTimeInSec > 1) {
//                future5.cancel(true);
//            }
//        }

//        System.out.println("Task completed! Retrieving the result");
//        String result3 = future5.get();
//        System.out.println(result3);

//        executorService3.shutdown();
//
//        if(!future5.isCancelled()) {
//            System.out.println("Task completed! Retrieving the result");
//            String result4 = future5.get();
//            System.out.println(result4);
//        } else {
//            System.out.println("Task was cancelled");
//        }
//
//        future5.get(1, TimeUnit.SECONDS);
        
        // ==========================
        
//        ExecutorService executorService6 = Executors.newFixedThreadPool(5);
//
//        Callable<String> task1 = () -> {
//            Thread.sleep(2000);
//            return "Result of Task1";
//        };
//
//        Callable<String> task2 = () -> {
//            Thread.sleep(1000);
//            return "Result of Task2";
//        };
//
//        Callable<String> task3 = () -> {
//            Thread.sleep(5000);
//            return "Result of Task3";
//        };
//
//        List<Callable<String>> taskList = Arrays.asList(task1, task2, task3);
//
//        List<Future<String>> futures = executorService6.invokeAll(taskList);
//        
//        String s = executorService6.invokeAny(taskList);
//        System.out.println(s);
//
//        for(Future<String> future2 : futures) {
//            // The result is printed only after all the futures are complete. (i.e. after 5 seconds)
//            System.out.println(future2.get());
//        }
//
//        executorService6.shutdown();
        
        //===================
        
//        String result7 = executorService.invokeAny(Arrays.asList(task1, task2, task3));
		
	}

}
