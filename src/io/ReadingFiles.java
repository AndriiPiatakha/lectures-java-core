package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ReadingFiles {
	
	public static void main(String[] args) throws IOException {
		printFileToConsole("test");
		
	}

	
	public static void printFileToConsole(String path) throws IOException {
		try (Stream<String> fStream = Files.lines(Paths.get(path))) {
			fStream.forEach(System.out::println);
		}
	}
	
	public static void printFileToConsole2(String path) throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
	
	public void e(List<? extends Number> list) {
		
	}
}
