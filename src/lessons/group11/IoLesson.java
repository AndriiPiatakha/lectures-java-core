package lessons.group11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class IoLesson {
	
	public static void main(String[] args) throws IOException {
		
//		try (Stream<String> lines 
//				= Files.lines(Paths
//						.get("asciireadDemo.txt"), 
//						StandardCharsets.UTF_8)) {
//			lines.forEach((string) -> System.out.println(string)); 
//		}
//		
//		Files.write(Paths
//						.get("asciireadDemo.txt"), 
//						"привет!".getBytes(), 
//						StandardOpenOption.APPEND);
		
		StringBuilder sb = new StringBuilder();
		String result = "";
		for (String string : new String[]{"apple", "orange", "banana"}) {
			sb.append(string);
		}
		
		System.out.println(result);
		System.out.println(sb.toString());
		
	}

}
