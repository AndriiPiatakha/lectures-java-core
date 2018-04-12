package labs.practice3;

import java.security.NoSuchAlgorithmException;

public class Demo {
	
	/**
	 * Text for demonstration of Part1
	 */
	
	public static final String TEXT_SUBTASK_01 = "Login;Name;Email\n" +
			"ivanov;Ivan Ivanov;ivanov@mail.ru\n" +
			"petrov;Petr Petrov;petrov@google.com\n" +
			"obama;Barack Obama;obama@google.com\n" +
			"bush;George Bush;bush@mail.ru";
	
	
	/**
	 * Text for demonstration of Part2
	 */
	
	public static final String TEXT_SUBTASK_02 = "When I was younger, so much younger than today\n" +
			  "I never needed anybody's help in any way\n" +
			  "But now these days are gone, I'm not so self-assured\n" +
			  "Now I find I've changed my mind\n" +
			  "I've opened up the doors";
	
	/**
	 * Text for demonstration of Part3
	 */
	
	public static final String TEXT_SUBTASK_03 = "When I was younger\n" +
											  "I never needed";
	
	/**
	 * Enter point.
	 * Demonstrates all of the subtasks. 
	 */

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		System.out.println("Demo of subtask 01.1: ");
		System.out.println(Part1.convert1(TEXT_SUBTASK_01) + "\n");
		
		System.out.println("Demo of subtask 01.2: ");
		System.out.println(Part1.convert2(TEXT_SUBTASK_01) + "\n");
		
		System.out.println("Demo of subtask 01.3: ");
		System.out.println(Part1.convert3(TEXT_SUBTASK_01) + "\n");
		
		System.out.println("Demo of subtask 01.4: ");
		System.out.println(Part1.convert4(TEXT_SUBTASK_01) + "\n");
		
		
		System.out.println("Demo of subtask 02: ");
		Part2.findAndPrintTheSortestAndLongest(TEXT_SUBTASK_02);
		System.out.println("\n");
		
		
		System.out.println("Demo of subtask 03: ");
		System.out.println(Part3.firstCharToTitleCase(TEXT_SUBTASK_03) + "\n");
		
		
		System.out.println("Demo of subtask 04: ");
		System.out.println(Part4.hash("password", "SHA-256"));
		System.out.println(Part4.hash("passwort", "SHA-256"));
		System.out.println("\n");
		
		System.out.println("Demo of subtask 05: ");
		
		for(int i = 1; i < 101; i++) {
			String str;
			System.out.print(i + " ====> " + (str = Part5.decimal2Roman(i)) +  
								 " ====> " + Part5.roman2Decimal(str) + "\n");
		}
		

	}

}
