package lessons;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import multithreading.examples1.Atomic1;

public class Lesson9_2 {
	
	public static void main(String[] args) {
		
//		try {
//			int i = 5 / 0;
//		} finally {
//			System.out.println("Finally");
//		}
		
//		if (1 > 0) {
//			throw new MyOwnException("Exception description");
//		}
		
//		try {
//			
//		} catch (NullPointerException | ArrayIndexOutOfBoundsException t) {
//			
//		} 
		
		
		try {
			throw new RuntimeException(new FileNotFoundException());
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
	}

}

class ATest {
	public void run() {
		
	}
	
}

class BTest extends ATest {

	@Override
	public void run() {
		throw new RuntimeException(new FileNotFoundException());
	}
	
	
}

class MyOwnException extends RuntimeException {
	
	public MyOwnException() {
	}
	
	public MyOwnException(String msg) {
		super(msg);
	}
	
	public MyOwnException(Exception e) {
		super(e);
	}
	
}
