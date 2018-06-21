package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class TestLesson2 {
	
	public static void main(String[] args) throws IOException {
		File f = new File("someDir");
		f.mkdir();
		
		File f2 = new File("someDir" + File.separator + "file.txt");
		f2.createNewFile();
		
		Path p = Paths.get("someDir2");
		Files.createDirectory(p);
	}

}
