package lessons.group11;

import java.util.Arrays;
import java.util.Collections;

public class Lesson2Arrays {

	public static void main(String[] args) {
		String[] productNames = { "Banana", "Apple", "Tesla" };
		String[] productNames2 = new String[10];

		System.out.println(productNames[1]);
		System.out.println(productNames2[1]);

		productNames2[1] = "Apple 2";
		System.out.println(productNames2[1]);

		int[] integers = new int[10];
		System.out.println(integers[1]);

		int[][][] matrix = { { { 1, 2, 3 }, { 4, 5, 6 } },

				{ { 1, 2, 3 }, { 4, 5, 6 } } };

		System.out.println(matrix[0][0][1]);
		System.out.println(productNames[2]);

		// =========================

		Integer[] ints = { 101, 20001, 1, 5, -2, 5000 };
		System.out.println(Arrays.toString(ints));
		Arrays.sort(ints);
		System.out.println(Arrays.toString(ints));
		Arrays.sort(ints, (i1, i2) -> i2 - i1);
		System.out.println(Arrays.toString(ints));

	}

}
