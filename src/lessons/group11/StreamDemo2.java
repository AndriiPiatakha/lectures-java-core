package lessons.group11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
	
	
	public static void main(String[] args) throws IOException {
		List<String> atWords = Files.lines(Paths.get("esenin.txt"))
			.map(line -> line.split("\\s"))
			.flatMap(stringArray -> Arrays.stream(stringArray))
			.filter(word -> word.contains("@"))
			.collect(Collectors.toList());
		
		String[] stream = Files.lines(Paths.get("esenin.txt"))
										.map(line -> line.split("\\s"))
										.toArray(String[]::new);
		
		Stream<String[]> map = Files.lines(Paths.get("esenin.txt"))
					.map(line -> line.split("\\s"));
		
		Stream<String> flatMap = Files.lines(Paths.get("esenin.txt"))
				.map(line -> line.split("\\s"))
				.flatMap(stringArray -> Arrays.stream(stringArray));
				
		
		System.out.println(atWords);
	}

}
