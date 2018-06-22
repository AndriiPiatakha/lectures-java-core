package multithreading.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import solid.s.User;

public class CompletableFutureDemo {
	
//	Limitations of Future
//	It cannot be manually completed :
//
//	Let’s say that you’ve written a function to fetch the latest price of an 
//	e-commerce product from a remote API. Since this API call is time-consuming, 
//	you’re running it in a separate thread and returning a Future from your function.
//
//	Now, let’s say that If the remote API service is down, then you want 
//	to complete the Future manually by the last cached price of the product.
//
//	Can you do this with Future? No!
//
//	You cannot perform further action on a Future’s result without blocking:
//
//	Future does not notify you of its completion. It provides a get() method 
//	which blocks until the result is available.
//
//	You don’t have the ability to attach a callback function to the Future and 
//	have it get called automatically when the Future’s result is available.
//
//	Multiple Futures cannot be chained together :
//
//	Sometimes you need to execute a long-running computation and when the 
//	computation is done, you need to send its result to another 
//	long-running computation, and so on.
//
//	You can not create such asynchronous workflow with Futures.
//
//	You can not combine multiple Futures together :
//
//	Let’s say that you have 10 different Futures that you want to run in parallel 
//	and then run some function after all of them completes. 
//	You can’t do this as well with Future.
//
//	No Exception Handling :
//
//	Future API does not have any exception handling construct.
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		CompletableFuture<String> completableFuture = new CompletableFuture<String>();
////		String result = completableFuture.get();
//
//		boolean complete = completableFuture.complete("Future's Result");
//
//		System.out.println(complete);
		// ========================
//	//	  Running asynchronous computation using runAsync()
//	//	Thread t = new Thread();
//	//	t.setDaemon(true);
//		
//		System.out.println("Test");
//		CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
//		    @Override
//		    public void run() {
//		        // Simulate a long-running Job
//		        try {
//		        	System.out.println("I'll run in a separate thread than the main thread." + Thread.currentThread().getName());
//
//					TimeUnit.SECONDS.sleep(1);
//		        } catch (InterruptedException e) {
//		            throw new IllegalStateException(e);
//		        }
//		        System.out.println("I'll run in a separate thread than the main thread." + Thread.currentThread().getName());
//		    }
//		});
//
//		// Block and wait for the future to complete
//		System.out.println("This thread");
//		Void void1 = future.get();
//		
//		System.out.println(void1);
		//=====================
		
//		 Run a task specified by a Supplier object asynchronously
//		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(new Supplier<String>() {
//		    @Override
//		    public String get() {
//		        try {
//		            TimeUnit.SECONDS.sleep(1);
//		        } catch (InterruptedException e) {
//		            throw new IllegalStateException(e);
//		        }
//		        return "Result of the asynchronous computation" + Thread.currentThread().getName();
//		    }
//		});
//
//		// Block and get the result of the Future
//		String result = future2.get();
//		System.out.println(result);

//=================================================
		
		// Variations of runAsync() and supplyAsync() methods
//		static CompletableFuture<Void>  runAsync(Runnable runnable)
//		static CompletableFuture<Void>  runAsync(Runnable runnable, Executor executor)
//		static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier)
//		static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier, Executor executor)
		
		
		
//		Executor executor = Executors.newFixedThreadPool(10);
//		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
//		    try {
//		        TimeUnit.SECONDS.sleep(1);
//		    } catch (InterruptedException e) {
//		        throw new IllegalStateException(e);
//		    }
//		    return "Result of the asynchronous computation";
//		}, executor);
		
		
		// You can attach a callback to the CompletableFuture using 
		// thenApply(), thenAccept() and thenRun() methods
		
		// Create a CompletableFuture
//		CompletableFuture<String> whatsYourNameFuture = CompletableFuture.supplyAsync(() -> {
//		   try {
//		       TimeUnit.SECONDS.sleep(1);
//		   } catch (InterruptedException e) {
//		       throw new IllegalStateException(e);
//		   }
//		   return "Test";
//		});
//
//		// Attach a callback to the Future using thenApply()
//		CompletableFuture<String> greetingFuture = whatsYourNameFuture.thenApply(name -> {
//		   return "Hello " + name;
//		});
//
//		// Block and get the result of the future.
//		System.out.println(greetingFuture.get()); // Hello Rajeev
//
//		CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
//		    try {
//		        TimeUnit.SECONDS.sleep(1);
//		    } catch (InterruptedException e) {
//		       throw new IllegalStateException(e);
//		    }
//		    return "TestName";
//		}).thenApply(name -> {
//		    return "Hello " + name;
//		}).thenApply(greeting -> {
//		    return greeting + ", Welcome yeah )";
//		});
//
//		System.out.println(welcomeText.get());
//		
//

		// thenAccept() example
//		CompletableFuture.supplyAsync(() -> {
//			return "something";
//		}).thenAccept(result2 -> {
//			System.out.println("Got product detail from remote service " + result2);
//		});

//		// thenRun() example
//		CompletableFuture.supplyAsync(() -> {
//			return "";
//		    // Run some computation
//		}).thenRun(() -> {
//		    // Computation Finished.
//		});
//
//
//
//		// Combine two dependent futures using thenCompose()
//		CompletableFuture<CompletableFuture<Double>> result6 = getUsersDetail("")
//				.thenApply(user -> getCreditRating(user));
//
//		CompletableFuture<Double> result5 = getUsersDetail("1")
//				.thenCompose(user -> getCreditRating(user));

		
		
		
		// If an error occurs in the original supplyAsync() task, then none of the thenApply() callbacks will be called and future will be resolved with the exception occurred. If an error occurs in first thenApply() callback then 2nd and 3rd callbacks won’t be called and the future will be resolved with the exception occurred, and so on.
		// Handle exceptions using exceptionally() callback
		int age = -1;
//		CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> {
//		    if(age < 0) {
//		        throw new IllegalArgumentException("Age can not be negative");
//		    }
//		    if(age > 18) {
//		        return "Adult";
//		    } else {
//		        return "Child";
//		    }
//		}).exceptionally(ex -> {
//		    System.out.println("Oops! We have an exception - " + ex.getMessage());
//		    return "Unknown!";
//		});
//
//
//
//
//		CompletableFuture<String> maturityFuture2 = CompletableFuture.supplyAsync(() -> {
//		    if(age < 0) {
//		        throw new IllegalArgumentException("Age can not be negative");
//		    }
//		    if(age > 18) {
//		        return "Adult";
//		    } else {
//		        return "Child";
//		    }
//		}).handle((res, ex) -> {
//		    if(ex != null) {
//		        System.out.println("Oops! We have an exception - " + ex.getMessage());
//		        return "Unknown!";
//		    }
//		    return res;
//		});
//
//		System.out.println("Maturity : " + maturityFuture.get());
//
//
		
		
	}
	
	static CompletableFuture<User> getUsersDetail(String userId) {
		return CompletableFuture.supplyAsync(() -> {
			return UserService.getUserDetails(userId);
		});	
		
		
		
	}
	
	static CompletableFuture<Double> getCreditRating(User user) {
		return CompletableFuture.supplyAsync(() -> {
			return CreditRatingService.getCreditRating(user);
		});
	}

}
