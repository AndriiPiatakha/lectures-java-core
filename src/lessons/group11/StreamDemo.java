package lessons.group11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> strings = 
				new ArrayList<>(Arrays.asList("apple", "orange", "banana", "apple"));
		
		int sum = strings.stream()
				.distinct()
				.mapToInt(str -> str.length())
				.sum();
		
		System.out.println(sum);
				
	
	}

}
