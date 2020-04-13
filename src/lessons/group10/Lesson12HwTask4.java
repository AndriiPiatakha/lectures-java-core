package lessons.group10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Lesson12HwTask4 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		int rows = 4;
		int columns = 100;
		int[][] matrix = generateRandomMatrix(rows , columns);
		
		System.out.println("====== Initial matrix ======");
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		
		List<Callable<Integer>> tasks = new ArrayList<>();
		for (int[] row : matrix) {
			tasks.add(new FinderTask(row));
		}
		
		ExecutorService es = Executors.newFixedThreadPool(4);
		List<Future<Integer>> taskResults = es.invokeAll(tasks);
		int maxInt = calculateMaxIntFromTasks(taskResults);
		
		System.out.println(maxInt);
		
	}

	private static int calculateMaxIntFromTasks(List<Future<Integer>> taskResults) throws InterruptedException, ExecutionException {
		Integer maxInt = Integer.MIN_VALUE;
		for (Future<Integer> future : taskResults) {
			Integer taskResult = future.get();
			if (maxInt < taskResult) {
				maxInt = taskResult;
			}
		}	
		return maxInt;
	}

	private static int[][] generateRandomMatrix(int rows, int columns) {
		int[][] matrix = new int[rows][columns];
		Random r = new Random();
		Arrays.stream(matrix).forEach((row) -> {
			for (int i = 0; i < row.length; i++) {
				row[i] = r.nextInt(100);
			}
		});
		
		return matrix;
	}

}

class FinderTask implements Callable<Integer> {
	private int[] row;
	
	public FinderTask(int[] row) {
		this.row = row;
	}

	@Override
	public Integer call() {
		
//		int max = row[0];
//		for (int i : row) {
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {}
//			if (i > max) {
//				max = i;
//			}
//		}
		
		return Arrays.stream(row).max().getAsInt();
	}
}
