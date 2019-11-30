package lessons.group9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson11 {

	public static final String EXIT_KEY_WORD = "exit";

	public static void main(String[] args) throws IOException {
//		Path p = Paths.get("./some");
//		File f = new File("./some");
////		Files.createDirectories(p);
//		
//		System.out.println(f.isFile());
//		f.mkdirs();

//		Path p = Paths.get("./some/textEditor.txt");
//		boolean isAlive = true;
//		Scanner sc = new Scanner(System.in);
//		while (isAlive) {
//			String nextLine = sc.nextLine();
//			if (!nextLine.equals(EXIT_KEY_WORD)) {
//				Files.write(p, nextLine.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//				Files.write(p, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
//			} else {
//				isAlive = false;
//			}
//		}
		
		A a = new A();
		
		for (A aElement : a) {
			
		}
	}
	
	public int fileFind2(String k) {
		List<String> result = Collections.EMPTY_LIST;
		try (Stream<Path> walk = Files.walk(Paths.get(k))) {
			result = walk
					.map(x -> x.toString())
					.filter(f -> f.endsWith(".java")) //Отбирает  файлы с расш.джава

				 	.collect(Collectors.toList());   //Собирает полученние елементи в список   	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.size();
	}

}

class A implements Iterable<A> {

	@Override
	public Iterator<A> iterator() {
		return null;
	}
	
}
