package io;

import java.io.File;

public class DemoFile {
	
	public static void main(String[] args) {
		File file = new File("fold2" + File.separator + "test");
		
		System.out.println(file.getAbsolutePath());
		file.mkdirs();
	}

}
