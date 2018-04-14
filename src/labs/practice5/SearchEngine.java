package labs.practice5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


/**
 * 
 * Class allows to create random matrix and find max element in it.
 * 
 * There are two different ways to find max element: 1) run few threads; 
 * 2) run just single thread.
 * 
 * Also class measures time spending in searching element.
 * For this two different fields for measuring searching time 
 * running few threads, and running only one thread.
 * 
 * @author Andrey Pyatakha
 *
 */

public class SearchEngine {
	
	/**
	 * Matrix to search max element.
	 */
	private int[][] matrix;
	
	/**
	 * Field for storing max element in matrix.
	 */
	private int maxInMatrix;
	
	/**
	 * Stores time of multithreading search.
	 */
	private long timeOfMultiThreadingSearch;
	
	/**
	 * Stores time of singlethreading search.
	 */
	private long timeOfSingleThreadingSearch;
	
	/**
	 * Stores Future objects with results of each threads.
	 */
	private List<Future<Integer>> futureList;
	
	/**
	 * Public constructor of SearchEngine object.
	 * 
	 * @param matrix object
	 */
	public SearchEngine(int[][] matrix) {
		this.matrix = matrix;
		futureList = new ArrayList<>();
	}
	
	/**
	 * Returns value of the field which store result of time measuring.
	 * 
	 * Returns time measuring result for multithreaded search.
	 * 
	 * @return long type, result of time measuring of multithreaded search
	 */
	public long getTimeOfMultiThreadingSearch(){
		return timeOfMultiThreadingSearch;
	}
	
	/**
	 * Returns value of the field which store result of time measuring.
	 * 
	 * Returns time measuring result for singlethreaded search.
	 * 
	 * @return long type, result of time measuring of singlethreaded search
	 */
	public long getTimeOfSingleThreadingSearch(){
		return timeOfSingleThreadingSearch;
	}
	
	/**
	 * Returns object which store future results of threads.
	 * 
	 * @return list of Future<Integer> objects.
	 */
	public List<Future<Integer>> getFutureList() {
		return futureList;
	}
	
	/**
	 * Template method which set and return max element in matrix.
	 * 
	 * This method creates arrays of Callable objects and all calls 
	 * another method to execute each of it.
	 * 
	 * After method find general max element calling the method which
	 * compares result of work of each executed thread.
	 * 
	 * Method also measured time spent searching max element.
	 * 
	 * @return max element in the matrix
	 * @throws InterruptedException in case of exception 
	 * 			in method findMaxInRow();
	 * @throws ExecutionException in case of exception 
	 * 			in method findMaxOfAllThreads();
	 */
	public int getMaxElementInMatrixMultiThreading() 
			throws InterruptedException, ExecutionException {
		
		Callable<Integer>[] arrFinders = new Finder[matrix.length];
		long start = System.nanoTime();
		runFinders(arrFinders);
		maxInMatrix = findMaxOfAllThreads(futureList);
		long finish = System.nanoTime();
		timeOfMultiThreadingSearch = (finish - start) / 1_000_000;
		return maxInMatrix;
	}
	
	/**
	 * Execute each thread from array of Callable objects.
	 * 
	 * Takes an array of Callable objects as a parameter.
	 *  
	 * @param arrFinders array of objects of Callable type.
	 */
	private void runFinders(Callable<Integer>[] arrFinders) {
		ExecutorService es = Executors.newCachedThreadPool();
		for (int i = 0; i < arrFinders.length; i++) {
			arrFinders[i] = new Finder(i);
			futureList.add(es.submit(arrFinders[i]));
		}
		es.shutdown();
		//TODO avoid while loop!!! find out how to change this
//		while (!es.isTerminated()) {
//			;
//		}
	}
	
	/**
	 * Finds the max element in the row of matrix.
	 * 
	 * Takes int row number as a paramater. 
	 * Search only in one row of matrix which belongs to this object.
	 * 
	 * @param row int value of row.
	 * @return max int value in each row.
	 * @throws InterruptedException in case of interrupting of thread.
	 */
	private int findMaxInRow(int row) throws InterruptedException {
		int maxInRow = matrix[row][0];
		for (int j = 1; j < matrix[row].length; j++) {
			TimeUnit.MILLISECONDS.sleep(1);
			if (maxInRow < matrix[row][j]) {
				maxInRow = matrix[row][j];
			}
		}
		return maxInRow;
	}
	
	/**
	 * Find general max result of each thread result.
	 * 
	 * Takes list of Future objects as a parameter.
	 * In foreach loop extract result of each Future object and
	 * compares result to each other.
	 * 
	 * After each comparing methods set the max value and returns it.
	 * 
	 * @param futureList list of Future<Integer> objects.
	 * @return max value of comparing results of work of each thread.
	 * @throws InterruptedException may be caused by Future.get() method.
	 * @throws ExecutionException may be caused by Future.get() method.
	 */
	private int findMaxOfAllThreads(List<Future<Integer>> futureList) 
			throws ExecutionException, InterruptedException {
		int max = futureList.get(0).get();
		for (Future<Integer> future : futureList) {
			if (future.get() > max) {
				max = future.get();
			}
		}
		return max;
	}
	
	
	/**
	 * Returns max element in matrix using single-threaded search.
	 * 
	 * Calls method findMaxInRow() which implements algorithm
	 * of comparing elements in each row.
	 * 
	 * In for-loop looking through each row in matrix.
	 * 
	 * Method also measures time spent searching and set result
	 * to the corresponding field of this object.
	 * 
	 * @return max int value in matrix.
	 * @throws InterruptedException may be caused by maxInRow method.
	 */
	public int getMaxElementInMatrixSingleThreading() throws InterruptedException {
		long start = System.nanoTime();
		int maxInRow =  matrix[0][0];
		int max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			maxInRow = findMaxInRow(i);
			if (maxInRow > max) {
				max = maxInRow;
			}
		}
		long finish = System.nanoTime();
		timeOfSingleThreadingSearch = (finish - start) / 1_000_000;
		return max;
	}
	
	/**
	 * Creates 2d array with int elements.
	 * 
	 * Random numbers generated by Random type object.
	 * Takes number of rows and columns as a parameter.
	 * 
	 * Assign to each element random value.
	 * 
	 * @param rows numbers of rows in new matrix.
	 * @param cols numbers of columns in matrix.
	 * @return new 2d array of int types.
	 */
	
	public static int[][] createRandomMatrix(int rows, int cols) {
		Random random = new Random();
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = random.nextInt();
			}
		}
		return matrix;
	}
	
	/**
	 * Callable object that find max in the row of matrix.
	 * 
	 * @author Andrey Pyatakha
	 *
	 */
	private class Finder implements Callable<Integer> {
		
		/**
		 * Thread Id.
		 * Indicate in which row of matrix it will be searching.
		 */
		private int threadId;
		
		/**
		 * Store max value that this thread finds.
		 */
		private int maxOfThread;
		
		/**
		 * Constructor.
		 * Takes int value as a parameter.
		 * 
		 * @param threadId in value.
		 */
		public Finder(int threadId) {
			this.threadId = threadId;
		}

		/**
		 * Find max in row and returns the result.
		 */
		@Override
		public Integer call() throws Exception {
			maxOfThread = findMaxInRow(threadId);
			return maxOfThread;
		}
		
	}

}
