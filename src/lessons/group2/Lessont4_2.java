package lessons.group2;

import java.util.Arrays;

public class Lessont4_2 {
	
	public static void main(String[] args) {
		String[] arr = { "1", "asda", "as", "asd"};
		String[] arr2 = new String[10];
		Arrays.sort(arr);
		
		
		int sum = Arrays.stream(arr)
//			.forEach(System.out::println);
			.map( string -> string.length())
			.mapToInt(Integer::valueOf)
			.sum();
		
		String[] array = Arrays.stream(arr)
			.filter( string -> string.length() > 2)
			.toArray(String[]::new);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(array));
		
		System.out.println(sum);
		
	}
	
	public int doSmth(int... arr) {
		int i = arr[0];
		return 1;
	}

}
