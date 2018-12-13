package lessons.group2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson10_2 {

	public static void main(String[] args) throws IOException {
//		File f = new File("a");
//		File[] listFiles = f.listFiles();
//		// for (File file : listFiles) {
//		// System.out.println(file);
//		// }
//		System.out.println(listFiles);
//
//		List<Character> chars = new ArrayList<>();
//		boolean contains = chars.contains('a');
//		System.out.println(contains);
//
//		Files.write(Paths.get(""), new ArrayList<String>(), StandardOpenOption.WRITE);
//		FileWriter fw = null;
//		try (
//				FileWriter fw2 = new FileWriter(new File("0"))) {
//			
//		} finally {
//			fw.close();
//		}
		
		Set set = new HashSet<>();
		set.add(null);
		set.add(null);
		System.out.println(set.size());
		
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("", "");
		
	}

	public static void printFiles(Path start, int maxDepth) throws IOException {

		try (Stream<Path> stream = Files.walk(start, maxDepth)) {
			String joined = stream
					.map(String::valueOf)
					.filter(path -> path.endsWith(".java"))
					.sorted()
					.collect(Collectors.joining("; "));
			System.out.println("walk(): " + joined);
		} catch (FileNotFoundException e) {
			System.err.println("error");
		}

	}

}
