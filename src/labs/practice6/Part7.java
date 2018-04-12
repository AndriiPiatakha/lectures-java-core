package labs.practice6;

import java.util.Iterator;

/**
 * Demo of Part7.
 * 
 * @author Andrey Pyatakha
 *
 */

public class Part7 {

	/**
	 * Enter point to the Part7.
	 * 
	 * Demonstrates the work of to types of iterators: in ascending
	 * and descending order.
	 * 
	 * Creates to objects of Part7 type.
	 * 
	 * @param args input parameters.
	 */
	public static void main(String[] args) {
		Range obj = new Range(3, 10, true);

		Iterator<Integer> iter = obj.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();

		Range obj2 = new Range(3, 10, false);

		Iterator<Integer> iter2 = obj2.iterator();
		while (iter2.hasNext()) {
			System.out.print(iter2.next() + " ");
		}

	}

}
