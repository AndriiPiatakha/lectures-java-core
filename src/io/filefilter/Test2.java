package io.filefilter;

import java.io.File;
import java.io.FileFilter;

public class Test2 {
	private void test() {
		FileFilter ff = pathname -> pathname.isHidden();
	}
	
	public static void main(String[] args) {
		File file = new File("./src/com");
		File[] listFiles = file.listFiles();
		File[] listFiles2 = file.listFiles(pathname -> pathname.isHidden());
		
		System.out.println(file.getParent());
	}

}
