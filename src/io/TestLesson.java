package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * asdasd
 * 
 * @author Andrii_Piatakha
 *
 */

public final class TestLesson {
	
	private TestLesson() {
		
	}
	
	public static void main(String[] args) throws IOException  {
		Path p = Paths.get("folder1", "folder2", "text.txt");
		Charset forName = Charset.forName("UTF-8");
		List<String> lines = new ArrayList<>();
		Files.write(p, lines, forName);

	}
	

}
