package lessons.group6;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Lesson3 {
	
	private Object o;
	
	public Lesson3() {
		this.o = new Object();
	}
	
	public void testDirections() throws FileNotFoundException {
//		askDirection();
		
		System.setIn(new ByteArrayInputStream("n".getBytes()));
		
		PrintStream ps = new PrintStream(new File("someFile"));
		System.setOut(ps);
		String fileContent = "";
		
		assertEquals("north", fileContent);
	}

}
