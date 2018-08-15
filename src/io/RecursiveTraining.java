package io;

import java.io.File;

public class RecursiveTraining {
	
	private static int i = 0;
	
	public static void main(String[] args) {
		recursiveMethod();
		int counter = 0;
		searchRecursively(new File(""), counter);
	}

	
	private static void searchRecursively(File file, int counter) {
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			if (file2.isDirectory()) {
				searchRecursively(file2, counter);
			} else {
				if (file2.getName().endsWith(".java")) {
					counter++;
				}
			}
		}
	}
	
	private static void recursiveMethod() {
		System.out.println(i++);
		
		if (i < 1000) {
			recursiveMethod();
		} else {
			return;
		}
		
	}
}
