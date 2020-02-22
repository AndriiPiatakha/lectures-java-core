package lessons.group10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Lesson7 {
	
	public static void main(String[] args) throws IOException {
//		Parent p = new Child();
//		System.out.println(p.getI());
		
		
//		try {
//			int i = 5 / 0;
//			File f = new File("");
//			f.createNewFile();
//		} catch (NullPointerException | IOException e) {
//			System.out.println("Oooops....");
//		} finally {
//			System.out.println("No matter what happens I'm here :)");
//		}
//		
//		try {
//			int i = 5 / 0;
//			File f = new File("");
//			f.createNewFile();
//		} catch (NullPointerException e) {
//			System.out.println("Oooops....");
//		} catch (IOException e) {
//			
//		}
//		
//		
//		try {
//			
//		} finally {
//			
//		}
		
//		doSmth();
		
//		throw new NullPointerException();
		
//		System.out.println("I'm fine");
//		
//		try {
//			
//		} catch (RuntimeException e) {
//			Throwable cause = e.getCause();
//			String message = e.getMessage();
//		}
		
		File f = new File("./test11.txt");
		System.out.println(f.getAbsolutePath());
		f.createNewFile();
		
		System.out.println(File.separator);
		System.out.println(File.pathSeparator);
		
		Path p = Paths.get(".", "test12.txt");
		System.out.println(p.toAbsolutePath());
		Files.createFile(p);
		
		Stream<Path> list = Files.list(p);
		
	}
	
	public static void doSmth() throws IOException {
		File f = new File("");
		f.createNewFile();
	}

}


class Parent {
	private int i;
	
	public int getI() throws IOException {
		return this.i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public void noThrowingException() {
		
	}
	
}

class Child extends Parent {
	
	public Child() {
		super.setI(1);
	}
	
	@Override
	public int getI() throws IOException {
		return 0;
	}
	
	@Override
	public void noThrowingException() {
		File f = new File("");
//		throw new NotEnoughMoneyException();
		try {
			f.createNewFile();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}


class NotEnoughMoneyException extends RuntimeException {
	
}
