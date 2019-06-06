package lessons.group7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> future = es.submit(CallableDemo::doSmth);
		Future<Integer> future2 = es.submit(() -> 1);
//		TreeMap tM = new TreeMap((obj1, obj2) -> 1);

		System.out.println(future.get());
		
		
	}
	
	public static Integer doSmth() {
		return 1;
	}
	
	

}
