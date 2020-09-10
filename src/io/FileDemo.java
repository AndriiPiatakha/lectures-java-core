package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		File file = new File("test"); 
		file.mkdir();
		
		file = new File("test2/test");
		file.mkdirs();
		
		file = new File("test3" + File.separator + "test");	
		if (file.mkdirs()) {
			System.out.println("Success");
		} else {
			System.out.println("Files are exist");
		}
		
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		String toWrite = "asdasdasd" + System.lineSeparator() + "new line";
		System.lineSeparator();
		
		file = new File("result.csv");
		file.createNewFile();
		
		file.exists();
		file.isDirectory();
		
		file.getAbsolutePath();
		file.canExecute();
		
		file.isFile();
		
		file.isHidden();
		
		
		
		
		// int testMethod(File file) {
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			
			for (File file2 : listFiles) {
				if (file2.isDirectory()) {
					//call this method one more time    testMethod(file)
				}
				// increase counter
			}
			System.out.println(listFiles);
		}
		
		
		
		
		
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		
		File[] listFiles = file.listFiles(pathname -> pathname.getName().endsWith(".java"));
		
		Path path = Paths.get("test", "test2");
		Files.createDirectories(path);
		
		String.join(",", new String[]{""});
		
		String[] array = new String[] { "a", "b", "c" };
		String joined2 = String.join(",", array);
		
		System.out.println(joined2);
		
//		Files.readAllBytes("");

	}
	
	
	public void someDemoMethod(File file, int counter) {
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			
			for (File file2 : listFiles) {
				someDemoMethod(file2, counter);
			}
		} else {
			++counter;
		}
	}

}
