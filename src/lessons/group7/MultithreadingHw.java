package lessons.group7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultithreadingHw {

	
	public static void main(String[] args) {
		int start = 1;
		int finish = 1000;
		int threads = 3;
		
		List<Integer> primeNumbers = new ArrayList<>();
		List<Integer> list = IntStream
				.range(1, 1000)
				.boxed()
				.collect(Collectors.toList());
		
//		for(int i = start; i <= 1000; i++) {
//			list.add(i);
//		}
		
//		System.out.println(list);
		
		
		int step = list.size() / threads;
		int i2 = 0;
		
		
		for (int i = 0; i < threads; i++) {
			List<Integer> numbersToProceed1 = list.subList(i2, i2 + step);
			i2 += step;
			Thread t = new Thread(new PrimeNumberSearcher(numbersToProceed1, primeNumbers));
			t.start();
		}
		
	}

}
