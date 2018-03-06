package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DemoIo {
	
	public static void main(String[] args) throws IOException {
		String pathToFile = "some3" + File.pathSeparator + "some2";
		File file = new File("../");
		
		File file2 = file;
		
		FileReader fr = new FileReader("test");
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		
		try (FileInputStream fis = new FileInputStream("test");
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			
		}
	}
	
	public static void test() {
		test();
	}

}
