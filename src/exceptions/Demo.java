package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {
		// test();
//		 throw
//		 throws

//		 throw new IllegalArgumentException();
//		if (true) {
//			throw new IllegalArgumentException();
////			throw new RuntimeException(new FileNotFoundException());
//		}
//		System.out.println("You won't see me");
		
		try {
			System.out.println(5 / 0);
		} catch (NullPointerException t) {
			System.out.println("Error is happened");
			t.getCause();
			t.initCause(new FileNotFoundException());
			throw t;
//		} catch (ArithmeticException ae) {
//			System.out.println("Here are you");
//			System.exit(1);
//			throw ae;
//		} catch (ArithmeticException | NullPointerException ex) {
//			
//		}
		} finally {
			System.out.println("You will see me for sure");
			System.out.println(5 / 0);
			System.out.println("Hello");
		}
		
		// try-catch-finally
		// try-finally
		
//		try {
//			
//		} finally {
//			
//		}
//		
//		System.out.println("You will see me");
//		
		
		
		
		
//		try {
//			new Demo().doSmth();
//		} catch (FileNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
		
		Writer w;
		try {
			w = new FileWriter(new File(""));
			w.write("asdasd");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		throw new CustomException();
	
		 
		 
		 
		try {
			readFromFile("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// someOtherMethod();
		
		
		Demo d = new Demo2();
		try {
			d.doSmth();
		} catch (FileNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static String readFromFile(String filePath) throws IOException {
		return "content";
	}

	public static void test() {
		test();
	}
	
	public void doSmth() throws FileNotFoundException, SQLException {
		FileReader fr = new FileReader(new File(""));
	}
	
	public static void readCsv() throws FileNotFoundException, SQLException {
		FileReader fr = new FileReader(new File(""));
	}
	
	public static void sortCsv() {
		try {
			readCsv();
			// sorting
		} catch (FileNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}
	}

}

class Demo2 extends Demo {

	@Override
	public void doSmth() 
//			throws IOException 
	{
//		throw new RuntimeException(new IOException());
	}
	
}
