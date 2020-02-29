package generic;

import java.util.Formatter;

public class GenericDemo1 {

	// generic method printArray
	public static <E> E printArray(E[] inputArray) {
		// Display array elements
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
		return inputArray[0];
	}
	
	

	public static void main(String args[]) {
		// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		Integer printArray = printArray(intArray); // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		Double printArray2 = printArray(doubleArray); // pass a Double array

		System.out.println("\nArray characterArray contains:");
		Character printArray3 = printArray(charArray); // pass a Character array
	}

}

class SomeClass15 {
	
	public void doSmth() {
		
	}
}
