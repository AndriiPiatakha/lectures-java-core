package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NioDemo {

	public static void main(String[] args) throws IOException {
		String pathToDirectory = "testDirectory" + File.separator + "tesSubDirectory";
		Path path = Paths.get(pathToDirectory);
		Paths.get("testDirectory", "tesSubDirectory", "tesSubDirectory2");

		Files.createDirectories(path);

		hm2();

		writeToFile();
		
		
		Path p = Paths.get("test", "test");
		Stream<Path> list = Files.list(p);
		Stream<String> lines = Files.lines(p);
		
		Files.walk(p).filter(file -> true);
		Files.find(p, 1, (path2, attr) -> true);
		
		List<String> readAllLines = Files.readAllLines(p);
		
		//try with resources
		Files.createDirectory(p);
		try (Stream<String> str = lines;
				Scanner sc = new Scanner(System.in);) {
			
		} finally {
//			str.close();
//			sc.close();
		}
		
		InputStream is = null;
		try {
			is = new FileInputStream(new File(""));
		} finally {
			is.close();
		}
	}

	private static void hm() throws IOException {
		Path start = Paths.get("");
		int maxDepth = 4;
		try (Stream<Path> stream = Files.find(start, maxDepth, (path, attr) -> String.valueOf(path).endsWith(".js"))) {
			String joined = stream.sorted().map(String::valueOf).collect(Collectors.joining("; "));
			System.out.println("Found: " + joined);
		}
	}

	private static void hm2() throws IOException {
		Path start = Paths.get("");
		int maxDepth = 3;
		try (Stream<Path> stream = Files.find(start, maxDepth, (path, attr) -> {
			return String.valueOf(path).endsWith(".java");
		})) 
		{
			String joined = stream.sorted()
					.map(String::valueOf)
					.collect(Collectors.joining("; "));
			System.out.println("Found: " + joined);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeToFile() throws IOException {
		List<String> lines = Arrays.asList("a", "s", "d");
		Files.write(Paths.get("niotest.txt"), lines);

		String test = "asdasd";
		Files.write(Paths.get("niotest2.txt"), test.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	}
	
	
//	Files.walk(Paths.get("/path/to/stuff/"))
//    .filter(p -> p.toString().endsWith(".ext"))
//    .map(p -> p.getParent().getParent())
//    .distinct()
//    .forEach(System.out::println);

}
