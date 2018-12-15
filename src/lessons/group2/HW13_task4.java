package lessons.group2;


import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
class CalcCallable implements Callable<Number> {
	int[] arr;
	int max;
	int n;
	CalcCallable(int[] arr, int n) {
		this.arr = arr;
		this.n = n;
	}
	@Override
	public Number call() throws Exception {
		max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max)
				max = arr[i];
//			System.out.println(Thread.currentThread().getName());
			TimeUnit.MILLISECONDS.sleep(1);
		}
		return max;
	}
}
public class HW13_task4 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int m = 4;
		int n = 100;
		int[][] array = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = (int) (new Random().nextGaussian() * 100);
			}
		}
		ArrayList<Future<Number>> list = new ArrayList<Future<Number>>();
		ExecutorService es = Executors.newFixedThreadPool(m);
		long time = System.currentTimeMillis();
		for (int i = 0; i < m; i++) {
			list.add(es.submit(new CalcCallable(array[i], n)));
		}
		es.shutdown();
		int maxNum = 0;
		for (Future<Number> future : list) {
			if ((int) future.get() > maxNum)
				maxNum = (int) future.get();
		}
		System.out.println("Max number is: " + maxNum);
		System.out.println("Threads runing time: " + (System.currentTimeMillis() - time) + " millis");
		time = System.currentTimeMillis();
		maxNum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] > maxNum)
					maxNum = array[i][j];
			}
		}
		System.out.println("Max number is: " + maxNum);
		System.out.println("Runing time: " + (System.currentTimeMillis() - time) + " millis");
	}
}