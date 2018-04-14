package multithreading.examples1;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Executors2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
//        test1();
//        test2();
        test3();
    }

    private static void test3() throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Future<Integer> future = executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        });

        future.get(1, TimeUnit.SECONDS);
    }

    private static void test2() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Future<Integer> future = executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        });

        List<Runnable> shutdownNow = executor.shutdownNow();
        boolean awaitTermination = executor.awaitTermination(20, TimeUnit.SECONDS);
        
        if (executor.awaitTermination(20, TimeUnit.SECONDS)) {
        	executor.shutdownNow();
        }
        future.get();
    }

    private static void test1() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Future<Integer> future = executor.submit(() -> {
            try {
            	System.out.println(Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(2);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        });

        System.out.println("future done: " + future.isDone());
        System.out.println(Thread.currentThread().getName());
        Integer result = future.get();

        System.out.println("future done: " + future.isDone());
        System.out.print("result: " + result);

        executor.shutdownNow();
    }

}
