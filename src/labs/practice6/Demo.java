package labs.practice6;


/**
 * Demonstrates work of all Parts from Practice6.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Demo {
	
	/**
	 * Enter point to the Demo.
	 * 
	 * Calls main methods of each Part from Practice6.
	 * 
	 * @param args input parameters.
	 * @throws Exception in case of exceptions in main methods of tasks.
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("~~~~~~~~~~~~Part1");
		Part1.main(args);
		
		System.out.println("~~~~~~~~~~~~Part2");
		Part2.main(args);

		System.out.println("~~~~~~~~~~~~Part3");
		Part3.main(args);
//		
//		System.out.println("~~~~~~~~~~~~Part4");
//		Part4.main(args);
//		
		System.out.println("~~~~~~~~~~~~Part5");
		Part5.main(args);		

		System.out.println("~~~~~~~~~~~~Part6");
		Part6.main(new String[]{"-i", "test.txt", "-t", "duplicates"});		

		System.out.println("~~~~~~~~~~~~Part7");
		Part7.main(args);		
	}

}
