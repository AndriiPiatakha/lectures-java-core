package lessons.group11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExceptionsDemo {
	
	public static void main(String[] args) {
		
//		try {
//			Files.write(Paths.get("asd"), "hello".getBytes(), StandardOpenOption.CREATE_NEW);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		try {
//			System.out.println(5 / 0);
//			Files.write(Paths.get("asd"), "hello".getBytes(), StandardOpenOption.CREATE_NEW);
//		} catch (IOException | ArithmeticException e) {
//			e.printStackTrace();
//		}
		
//		try {
//			System.out.println(5 / 0);
//			Files.write(Paths.get("asd"), "hello".getBytes(), StandardOpenOption.CREATE_NEW);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("Finally block");
//		}
		
//		try {
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		} finally {
////			System.exit(0);
////			System.out.println(5 / 0);
//			
//			System.out.println("Finally block");
//		}
//		
//		System.err.println();
//		System.out.println("Program keeps executing");
		
		
		// ================== THROWS demo
		
//		try {
//			writeToFile("heello");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// =========== THROW DEMO
		
		throwSomeException();
		
	}
	
	public static void writeToFile(String str) throws IOException {
		Files.write(Paths.get("asd"), "hello".getBytes(), StandardOpenOption.CREATE_NEW);
	}
	
	public void doSomething() throws FileNotFoundException {
		
	}
	
	public static void throwSomeException() {
		throw new UnsupportedOperationException();
	}

}

class SomeOtherClass extends ExceptionsDemo {
	
//	@Override
//	public void doSomething() throws IOException {
//		
//	}
}
