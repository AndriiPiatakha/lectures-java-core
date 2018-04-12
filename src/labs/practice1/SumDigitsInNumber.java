package labs.practice1;

/**
 * Application to define sum of digits of positive integers.
 * 
 * @author Andrey Pyatakha
 *
 */

public class SumDigitsInNumber {
	
	/**
	 * Method returns sum of digits in positive number.
	 * If number is negative then method throws IllegalArgumentException.
	 * 
	 * @param number;
	 * @return sum of digits of positive number;
	 * @exception IllegalArgumentException;
	 */
	
	public static int sumDigitsInPositiveNumber(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("Please, run application "
													+ "with positive integer");
		}
		int result = 0;
		while (number != 0) {
			result += number % 10;
			number /= 10;
		}
		return result;
	}
	
	
	/**
	 * Method returns sum of digits in positive number.
	 * If number is negative then method throws IllegalArgumentException.
	 * Methods works with number as with sequence of chars.
	 * 
	 * @param number;
	 * @return sum of digits of positive number;
	 * @exception IllegalArgumentException;
	 */
	
	public static int sumDigitsInPositiveNumber2(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("Please, run application "
												+ "with positive integer");
		}
		int result = 0;
		String stringNumber = Integer.toString(number);
		int index = 0;
		while (index < stringNumber.length()) {
			result += stringNumber.charAt(index) - '0';
			index++;
		}
		
		return result;
	}
	
	/**
	 * Enter point to SumDigitsInNumber application.
	 * 
	 * If there is no enter arguments throws IndexOutOfBoundsException
	 * If entered arguments are not integers throws NumberFormatException
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		int param1 = Integer.parseInt(args[0]);
		System.out.println("Sum of digits in number " + param1
								+ " is " + sumDigitsInPositiveNumber(param1));
	}

}
