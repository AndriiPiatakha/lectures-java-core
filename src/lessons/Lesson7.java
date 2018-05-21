package lessons;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Lesson7 {
	
	int z, a, b;
	
	private final int i;

	public Lesson7() {
		i = 1;
	}
	
	public void someMethod(final List<String> list) {
		
	}
	
	public static void main(String[] args) {
//		System.out.println(I.A);
//		try {
//			System.out.println(5 / 0);
//		} catch(Exception e) {
//			System.err.println("EXCEPTION IS CATCHED");
//			e.printStackTrace();
//			System.out.println(e.getCause());
//		}
//		System.out.println("After exception");
		
		
//		doSmth();
		
//		try {
//			Class.forName("");
//			Files.write(Paths.get("a"), "".getBytes());
//		} catch (ClassNotFoundException|IOException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			Class.forName("");
//			Files.write(Paths.get("a"), "".getBytes());
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("asdasd");
//		}
		
//		try {
////			System.out.println(5 / 0);
//		} catch (Exception e) {
//			System.out.println("Exception");
//		} finally {
//			System.out.println(5 / 0);
//			System.out.println("Finally");
//		}
		
		try {
			doSmth(1);
		} catch (RuntimeException e) {
			System.out.println(e.getCause().getMessage());
		}
		
		
		
		
	}
	
	
	public static void doSmth(int i) {
		if (i < 0)
			throw new IllegalArgumentException();
		System.out.println("Do smth");
		
		try {
			Files.lines(Paths.get("qqq"));
		} catch (IOException e) {
			IllegalArgumentException e2 = new IllegalArgumentException("error message");
			throw new RuntimeException(e2);
		}
	}

}

interface I {
	int A = 10;
	
	static void som() {
		
	}
}
