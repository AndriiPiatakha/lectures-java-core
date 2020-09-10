package io;

import java.io.File;

public class RecursiveTraining {
	
	private static int i = 0;
	
	private static int fileCount;
	
	public static void main(String[] args) {
//		recursiveMethod();
		int counter = 0;
		File file = new File("./");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isDirectory());
		searchRecursively(file);
		System.out.println(fileCount);
	}

	
	private static void searchRecursively(File file) {
		File[] listFiles = file.listFiles();
		if (listFiles != null) {
			for (File file2 : listFiles) {
				if (file2.isDirectory()) {
					searchRecursively(file2);
				} else {
					if (file2.getName().endsWith(".java")) {
						fileCount++;
					}
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
