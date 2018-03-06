package multithreading.examples1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


public class CompletableFuture1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = new CompletableFuture<>();
        
        CompletableFuture.supplyAsync(() -> {
        	System.out.println(Thread.currentThread().getName());
        	System.out.println(Thread.currentThread().isDaemon());
        	try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	System.out.println("HERE");
        	
        	// do get request
        	return null;
        });
        System.out.println("NEXT LINE");

        future.complete("42");

        future
                .thenAccept(System.out::println)
                .thenAccept(v -> System.out.println("done"));
        System.out.println("Finished");

    }

}
