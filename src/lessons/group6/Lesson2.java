package lessons.group6;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson2 {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(() -> {
			System.out.println(Thread.currentThread());
			
			throw new RuntimeException(new IOException());
		});
		
		t.start();
		System.out.println(Thread.currentThread().getName());
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> System.out.println(Thread.currentThread()));
//		es.submit(task)
	}

}
