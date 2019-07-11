package lessons.group8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Lesson5 {
	
	public static void main(String[] args) {
		String[] array = { "I ", "could ", "not ", "do", "it", "without", "list" };
		String[] filteredArray = Arrays.stream(array)
				.filter(x -> x.length() > 3)
//				.collect(Collectors.toList());
				.toArray(String[]::new);
		
	}

}
