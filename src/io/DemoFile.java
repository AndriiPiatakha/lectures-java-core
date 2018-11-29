package io;

import java.io.File;
import java.io.IOException;

public class DemoFile {
	
	public static void main(String[] args) throws IOException {
		File file = new File("fold2" + File.separator + "test");
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getCanonicalPath());
		file.mkdirs();
		
	
	}

}
