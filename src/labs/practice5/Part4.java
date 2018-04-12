package labs.practice5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Part4 {
	
	private static final int COLUMNS = 100;
	private static final int ROWS = 4;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		int[][] matrix = SearchEngine.createRandomMatrix(ROWS, COLUMNS);
		
		SearchEngine se = new SearchEngine(matrix);
		
		System.out.println("=======  Demo of MultiThreading Search ========");
		System.out.println("Max element in matrix: " + 
					se.getMaxElementInMatrixMultiThreading());
		System.out.println("Time of multithreading search: " + 
					se.getTimeOfMultiThreadingSearch());
		
		System.out.println();
		System.out.println("======= Demo of SingleThreading Search ========");
		System.out.println("Max element in matrix: " + 
					se.getMaxElementInMatrixSingleThreading());
		System.out.println("Time of singlethreading search: " + 
					se.getTimeOfSingleThreadingSearch());
		
		
		System.out.println("\nPrinting the futureList: ");
		for (Future<Integer> future : se.getFutureList()) {
			System.out.println(future.get());
		}
		
		
	}

}
