package lessons.group10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lesson8 {
	
	private int counter;
	private int depth;
	private StringBuilder namesList = new StringBuilder();
	private List<String> parentFolders = new ArrayList<>();
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
//		try (var br = new BufferedReader(
//				new FileReader(new File(""))); 
//				var sc = new Scanner(System.in)) {
//			
//		}
//		
//		String result = String.join(";", new String[10]);
		
		
		Path p = Paths.get("eagles-group-io-demo2.txt");
//		if (!Files.exists(p)) {
//			Files.createFile(p);
//		}
		
		Files.write(p, "some input text".getBytes(), 
				StandardOpenOption.CREATE, 
				StandardOpenOption.APPEND);
		System.out.println(Files.readString(p));
		
	}
	
	
	public int councountExtensionsInDir2(String path, String extension, int depth) throws IOException {
		Path dir = Paths.get(path);
		Files.find(dir, depth, 
				(path2, fa) -> Files.isDirectory(path2))
		     .forEach(p -> {
		    	 File[] files = new File(p.toString()).listFiles();
		    	 for (File file : files) {
					if(file.isFile()) {
						if(file.getName().endsWith(extension)) {
							counter++;
							namesList.append(file.getName().split("\\.")[0] + "\n");

						}
					}
				}
		     });

		return counter;
	}
	
	public int countExtensionsInDir(String path, String extension, int depth) throws IOException {

		Path dir = Paths.get(path);
		Files.walk(dir, depth)
		     .filter(p -> Files.isDirectory(p))
		     .forEach(p -> {
		    	 File[] files = new File(p.toString()).listFiles();
		    	 for (File file : files) {
					if(file.isFile()) {
						if(file.getName().endsWith(extension)) {
							counter++;
							namesList.append(file.getName().split("\\.")[0] + "\n");

						}
					}
				}
		     });

		return counter;
	}

}
