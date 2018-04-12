package labs.practice3;

/**
 * Provides possibility to convert Roman and decimal numbers.
 * 
 * Consists of static methods to converting Roman or decimal digits to
 * each other. 
 * 
 * Also contains method for validation of correct spelling of Roman
 * numbers.
 * 
 * @author Andrey Pyatakha
 *
 */

public class Part5 {

	/**
	 * Converts decimal numbers to Roman.
	 * 
	 * Takes int value as a parameter. 
	 * Works only with numbers from 1 to 100.
	 * 
	 * @param number to convert to Roman.
	 * @return string of Roman number.
	 */
	public static String decimal2Roman(int number) {
		String[] a = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C" };
		int[] b = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100 };
		StringBuilder s = new StringBuilder();
		for (int i = a.length - 1; i >= 0; i--) {
			while (number >= b[i]) {
				s.append(a[i]);
				number -= b[i];
			}
		}
		return s.toString();
	}
	
	/**
	 * Converts Roman numbers to decimal.
	 * 
	 * Takes string value with Roman number as a parameter.
	 * 
	 * At first method validates if input string could be Roman number.
	 * After method uses algorithm to convert Roman numeral to 
	 * decimal.
	 * 
	 * @param romanNumber
	 * @return
	 */
	
	public static int roman2Decimal(String romanNumber) {
		String romanNumeral = romanNumber.toUpperCase();
		
		if (!(validationOfRomanNumerals(romanNumber))) {
			throw new NumberFormatException("Incorrect spelling of Roman numeral");
		}
		
		int decimal = 0;
		int lastNumber = 0;
		
		for (int x = romanNumeral.length() - 1; x >=0; x--) {
			char convertToDecimal = romanNumeral.charAt(x);
			
			switch(convertToDecimal) {
			case 'C':
                decimal = processDecimal(100, lastNumber, decimal);
                lastNumber = 100;
                break;

            case 'L':
                decimal = processDecimal(50, lastNumber, decimal);
                lastNumber = 50;
                break;

            case 'X':
                decimal = processDecimal(10, lastNumber, decimal);
                lastNumber = 10;
                break;

            case 'V':
                decimal = processDecimal(5, lastNumber, decimal);
                lastNumber = 5;
                break;

            case 'I':
                decimal = processDecimal(1, lastNumber, decimal);
                lastNumber = 1;
                break;
					
			}
			
		}
		return decimal;
	
	}
			
	/**
	 * Utility method which is the part of algorithm that converts
	 * Roman numbers to decimal.
	 * 
	 * @param decimal
	 * @param lastNumber
	 * @param lastDecimal
	 * @return int value
	 */
	 private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
	        if (lastNumber > decimal) {
	            return lastDecimal - decimal;
	        } else {
	            return lastDecimal + decimal;
	        }
	    }
	 
	 /**
	  * Validation for Roman numbers.
	  * 
	  * Use regular expression which is checking if string really could be
	  * Roman number.
	  * @param romanNumber
	  * @return
	  */
	 public static boolean validationOfRomanNumerals(String romanNumber) {
		 return romanNumber.matches("^(?i)M{0,3}(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$");
	 }
	
	 

}
