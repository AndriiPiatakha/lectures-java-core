package lessons.group9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Lesson10 {
	
	public static void main(String[] args) {
		
		ChildLesson10 c = new ChildLesson10();
		boolean isPaymentSuccess = false;
		while (!isPaymentSuccess) {
			try {
				c.transferMoney(new Account(), new Account(), -1);
				isPaymentSuccess = true;
			} catch (NotEnoughMoneyException e1) {
				System.out.println("Please, try one more time");
			}
		}
		System.out.println("Payment successfull");
		
//		
//		try {
//			Files.write(Paths.get(""), new ArrayList(), StandardOpenOption.APPEND, StandardOpenOption.CREATE_NEW);
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//		
		
		
//		String n = null;
//		
//		System.out.println(n.length());
//		
//		
//		try {
//			
//			try {
//				
//			} catch (RuntimeException e) {
//				
//			}
//			Files.write(Paths.get(""), new ArrayList(), StandardOpenOption.APPEND, StandardOpenOption.CREATE_NEW);
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (IOException | ClassNotFoundException e) {
//			e.printStackTrace();
//			throw new RuntimeException();
//		} finally {
//			System.out.println("Я буду выполнятся всегда... Ну... Почти всегда.");
//		}
//		
////		doSmth("");
//		
	}
	
	public void doSmth(String name, Integer... integers) throws IOException {
		
	}

}

class ChildLesson10 extends Lesson10 {

	@Override
	public void doSmth(String name, Integer... integers) 
			throws FileNotFoundException {
//		super.doSmth(name, integers);
	}
	
	public void transferMoney(Account from, Account to, int transferAmount) 
			throws NotEnoughMoneyException {
		if (from.getMoney() < transferAmount) {
			throw new NotEnoughMoneyException();
		}
	}
	
}

class Account {
	
	public int getMoney() {
		return 0;
	}
}


class NotEnoughMoneyException extends Exception {
	
	public NotEnoughMoneyException() {
		super();
	}
	
	public NotEnoughMoneyException(String message) {
		super(message);
	}
}
