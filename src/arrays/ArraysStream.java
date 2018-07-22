package arrays;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class ArraysStream {

	public static void main(String[] args) {

		Integer[] arr = { 1, 12, 90, 23, 75, 4 };
		
		int[] arr3 = { 1, 12, 90, 23, 75, 4 };
		
		Object[] array4 = Arrays.stream(arr3)
				.mapToObj(Integer::toString)
				.filter(str -> str.length() < 2)
				.toArray();
		String[] array5 = Arrays.stream(arr3)
				.mapToObj(Integer::toString)
				.filter(str -> str.length() < 2)
				.toArray(String[]::new);
		

		Integer[] array = Arrays.stream(arr)
				.filter(i -> i % 2 == 0)
				.map((i) -> Integer.toString(i))
				.map(string -> string.length())
				.toArray(Integer[]::new);
		
		int sum = Arrays.stream(arr)
				.filter(i -> i % 2 == 0)
				.map((i) -> Integer.toString(i))
				.mapToInt(String::length)
				.sum();
		
		System.out.println(Arrays.toString(array));
		System.out.println(sum);
		
		
		
		
//		int[] arr = {10215454, 254, 3};
//		Integer[] array = Arrays.stream(arr)
//			.mapToObj(Integer::toString)
//			.filter( str -> str.length() < 2)
//			.map(Integer::valueOf)
//			.toArray(Integer[]::new);
//		System.out.println(Arrays.toString(array));
//		
//		int sum = Arrays.stream(arr).sum();
//		System.out.println(sum);	
//		
//		Integer[][] matrix = {
//				{1, 2},
//				{3, 4}
//		};
//		
//		Integer[] array2 = Arrays.stream(matrix)
//			.flatMap(x -> Arrays.stream(x))
//			.toArray(Integer[]::new);
//		
//		System.out.println(Arrays.toString(array2));
//		
////			.map(Integer::toString)
////			.
		

	}

}
