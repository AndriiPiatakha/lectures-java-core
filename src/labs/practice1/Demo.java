package labs.practice1;

/**
 * Application Demo demonstrates all applications from task01.
 * Class Demo consists of one static main method which provides 
 * access to static main methods of each class in package ua.khpi.pyatakha.task01 
 * 
 * @author Andrey Pyatakha
 *
 */

public class Demo {
	
	/**
	 * Enter point to the Demo application.
	 * 
	 * Invokes main methods of each class in package ua.khpi.pyatakha.task01
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		HelloWorld.main(new String[] {});
		SumArguments.main(new String[] {"81", "36"});
		GreatestCommonDividers.main(new String[] {"12", "30"});
		SumDigitsInNumber.main(new String[] {"1123"});
		ConvertStringIntegerRadix26.main(new String[] {"ABZ", "754", "ABZ"});

	}

}
