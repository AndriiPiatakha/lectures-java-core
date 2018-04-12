package labs.practice1;

/**
 * This class summarize only first and second arguments.
 * 
 * @author Andrey Pyatakha
 *
 */

public class SumArguments {
	
	/**
	 * Enter point.
	 * 
	 * If entered arguments are not numbers throws NumberFormatException
	 * If there are less than two arguments throws IndexOutOfBoundsException
	 * 
	 * @param args;
	 */
	

	public static void main(String[] args) {
		// check if input numbers double or integer
		if (args[0].contains(".") || args[1].contains(".")) {
			double paramDouble1 = Double.parseDouble(args[0]);
			double paramDouble2 = Double.parseDouble(args[1]);
			System.out.println(paramDouble1 + " + " + paramDouble2
								+ " = " + (paramDouble1 + paramDouble2));
		} else {
			int paramInt1 = Integer.parseInt(args[0]);
			int paramInt2 = Integer.parseInt(args[1]);
			System.out.println(paramInt1 + " + " + paramInt2
								+ " = " + (paramInt1 + paramInt2));
			}

	}

}
