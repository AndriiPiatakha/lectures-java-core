package lessons;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

import jdk.jfr.events.FileWriteEvent;

public class LessonIo {
	
	public static void main(String[] args) throws IOException {
		File dir = null;
		File[] fileList = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith("");
			}
		});
		
		File[] fileList2 = dir.listFiles((dir2, fileName) -> fileName.endsWith(""));
		
		try (FileWriter fw = new FileWriter(new File("")); 
				FileWriter fw2 = new FileWriter(new File(""))) {
			
		}
	}

}
