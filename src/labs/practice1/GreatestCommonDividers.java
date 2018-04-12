package labs.practice1;

/**
 * This application define greatest common divider.
 * This class consists of static methods to define biggest 
 * common divider of two input numbers
 * 
 * @author Andrey Pyatakha
 *
 */

public class GreatestCommonDividers {
	
	/**
	 * Returns greatest common divider of two input numbers.
	 * 
	 * @param firstNumber integer number
	 * @param secondNumber integer number
	 * @return Greatest Common Divider
	 */
	
	public static int gcd(int firstNumber, int secondNumber) {
		while (secondNumber != 0) {
			int tmp = firstNumber % secondNumber;
			firstNumber = secondNumber;
			secondNumber = tmp;
		}
		return Math.abs(firstNumber); //for the case firstNumber is negative
	}
	
	/**
	 * Returns greatest common divider of two input numbers.
	 * This method uses recursive algorithm.
	 * 
	 * @param firstNumber integer number
	 * @param secondNumber integer number
	 * @return Greatest Common Divider
	 */
	
	public static int gcdRecursive(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			//for the case firstNumber is negative
			return Math.abs(firstNumber); 
		} else {
			return gcdRecursive(secondNumber, firstNumber % secondNumber);
		}
		
	}
	
	/**
	 * Enter point.
	 * Shows in the console greatest common divider for two input arguments. 
	 * 
	 * If there is no entered arguments throws IndexOutOfBoundsException.
	 * If entered arguments are not integers throws NumberFormatException
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int param1 = Integer.parseInt(args[0]);
		int param2 = Integer.parseInt(args[1]);
		System.out.println("Greatest common divider for " + param1 
								+ " and " + param2 + " is "+ gcd(param1, param2));

	}

}
