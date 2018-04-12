package labs.practice1;

/**
 * The class provides static methods for transformation 
 * name of the columns in Microsoft Excel to numbers and vise versa.
 *  
 * @author Andrey Pyatakha
 *
 */
public class ConvertStringIntegerRadix26 {
	
	/**
	 * Convert string name of column in Excel to the integer number.
	 * Column "A" means column number 1.
	 * 
	 * If string contains digits method throws NumberFormatException.
	 * 
	 * @param column
	 * @return integer value, column number
	 * @exception NumberFormatException in case arguments contains digits.
	 */
	public static int convertStringToInteger(String column) {
		 if (column == null) {
	         throw new NumberFormatException("null");
	        }
		 // check if input string contains any digit
		 if (column.length() == 0 || column.matches(".*\\d.*")) {
			 throw new NumberFormatException("Only letters allowed for"
					 						+ " method convertStringToInteger");
		 }
		 String columnInExcel = column.toUpperCase();
	     int result = 0;
	     for (int i = 0; i < columnInExcel.length(); i++) {
	          result *= 26;
	          result += columnInExcel.charAt(i) - 'A' + 1;
	        }
	     return result;
	   }

	/**
	 * Convert integer, column number in Excel to the string.
	 * Column number 1 means column "A".
	 * 
	 * If argument is negative integer or zero method 
	 * throws NumberFormatException.
	 * 
	 * @param number
	 * @return string column name
	 * @exception NumberFormatException in case negative or zero argument
	 */
	
	public static String convertIntegerToString(int number) {
		 	if (number <= 0) {
	            throw new NumberFormatException("Please, enter positive integer");
	        }
	        final StringBuilder sb = new StringBuilder();
	        int num = number - 1;
	        while (num >=  0) {
	            int numChar = (num % 26) + 65;
	            sb.append((char) numChar);
	            num = (num  / 26) - 1;
	        }
	        return sb.reverse().toString();
	    }
	
	/**
	 * Method returns string name of the next column.
	 * 
	 * @param column
	 * @return string, column name in Excel
	 */
	
	 public static String getNextColumnString(String column) {
		 int nextColumn = convertStringToInteger(column) + 1;
		 return convertIntegerToString(nextColumn);
	 }


	/**
	 * Enter point to SumDigitsInNumber application.
	 * 
	 * If entered arguments has incorrect types throws NumberFormatException.
	 * If there are less than three arguments throws IndexOutOfBoundsException.
	 * 
	 * @param args include at least three arguments: 1) letters; 2) number;
	 * 														3) letters.
	 
	 */
	 
	public static void main(String[] args) {
		int i = convertStringToInteger(args[0]);
		System.out.println("Convert string \"" 
								+ args[0] + "\" to integer: " + i);
		
		int columnNumber = Integer.parseInt(args[1]);
		String str = convertIntegerToString(columnNumber);
		System.out.println("Convert integer \"" 
								+ columnNumber + "\" to string: " + str);

		String str2 = getNextColumnString(args[2]);
		System.out.println("Get next column name after \"" + args[2] + "\""
								+ " to string: " + str2);
	
		 

	}

}
