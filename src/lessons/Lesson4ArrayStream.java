package lessons;

import java.util.Arrays;
import java.util.stream.Stream;

public class Lesson4ArrayStream {
	
	public static void main(String[] args) {
		
		int[] arr = {10215454, 254, 3};
		Integer[] array = Arrays.stream(arr)
			.mapToObj(Integer::toString)
			.filter( str -> str.length() < 2)
			.map(Integer::valueOf)
			.toArray(Integer[]::new);
		System.out.println(Arrays.toString(array));
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);	
		
		Integer[][] matrix = {
				{1, 2},
				{3, 4}
		};
		
		Integer[] array2 = Arrays.stream(matrix)
			.flatMap(x -> Arrays.stream(x))
			.toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(array2));
		
//			.map(Integer::toString)
//			.
		
		
	}

}
