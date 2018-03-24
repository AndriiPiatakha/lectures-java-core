package syntax;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo2 {
	
	public static void main(String[] args) {
		int[] arr = {5, 1, 6};
		
		int[] array = Arrays.stream(arr).filter((i) -> {return i == 5;}).toArray(); 
		System.out.println(Arrays.toString(array));
		
//		Arrays.stream(arr).map((i) -> Integer.toString(i)).toArray(String[]::new);
		
		String[] array2 = Arrays.stream(arr)
				.mapToObj(i -> Integer.toString(i))
				.sorted((a, b) -> b.compareTo(a))
				.toArray(String[]::new);
		System.out.println(Arrays.toString(array2));
		
		Integer[][] matrix = {
				{1,2,3},
				{4,5,6}
		};
		
		Arrays.stream(matrix)
				.flatMap(arr3 -> Arrays.stream(arr3))
				.filter(i -> i%2 == 0).toArray();
		
		
		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		
		Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x -> "a".equals(x.toString()));

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //Stream<String>, GOOD!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);
	}

}
