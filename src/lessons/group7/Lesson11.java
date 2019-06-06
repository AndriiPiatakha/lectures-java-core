package lessons.group7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lesson11 implements Runnable {
	
	private static final int RANDOM_NUMERS_AMOUNT = 100;


	public static void main(String[] args) throws InterruptedException {
		List<Integer> list1 = getRandomList(RANDOM_NUMERS_AMOUNT);
		List<Integer> list2 = getRandomList(RANDOM_NUMERS_AMOUNT);
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		MyCallable task1 = new MyCallable(list1);
		MyCallable task2 = new MyCallable(list2);
		
		List<MyCallable> tasks = new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		
		List<Future<Integer>> futures = ex.invokeAll(tasks);
		
//		Future<Integer> future1 = ex.submit(task1);
//		Future<Integer> future2 = ex.submit(task2);
		
			
	}
	
	
	
	public static List<Integer> getRandomList(int amount) {
		Random r = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < amount; i++) {
			list.add(r.nextInt(10000));
		}
		return list;
	}
	

	@Override
	public void run() {
		File f = new File("");
		try {
			Files.write(Paths.get(""), "".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
