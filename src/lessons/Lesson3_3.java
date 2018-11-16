package lessons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Lesson3_3 {

	private static Boolean b;
	
	public static void main(String[] args) {
		// if (1 < 1)
		// System.out.println("TRUE");
		// else if (1 > 1) {
		// System.out.println("FALSE");
		// if (true) {
		// if (true) {
		//
		// }
		// }
		// }
		//
		//
		// else
		// System.out.println("Second else");
		//
		// String s = 1 < 1 ? "true" : "false";
		// System.out.println(s);

//		int l = 1;
//		char c = 'a';
//		boolean b = true;
//		// byte, short, int, char, String, Enum
//		switch (Seasons.SUMMER) {
//		case SUMMER:
//			System.out.println("T");
//			System.out.println("T");
////			break;
//		case FALL:
//			System.out.println("C");
//			break;
//		default: 
//			System.out.println("default");
//		}
		
//		while
//		for
//		do while
//		foreach 
		
//		byte b = 1;
//		while (b > 0) {
//			b++;
//			System.out.println(b);
//		}
		
//		do {
//			b++;
//			System.out.println(b);
//		} while (b > 0);
		
		
//		for (;;) {
//			label: for (;;) {
//				System.out.println(b);
//				if (b == 10) {
//					continue label;
//				}
//			}
//		}
//		System.out.println(i);
//		
//		for (int i = 0; i < 10; i++) {
//			if (i % 2 == 0) 
//				continue;
//			else 
//				System.out.println(i);
//		}
//		
//		int[] arr = {1, 2, 3};
//		A a = new A();
//		for (String s : a) {
//			System.out.println(s);
//		}
		
		
		
//		if (b) {
//			System.out.println(1);
//		}
//		
//		Integer[] arr = new Integer[10];
//		System.out.println(arr[0]);
//		int arr2[] = {1, 2, 3};
//		int[] arr3 = arr2;
//		System.out.println(arr3[2]);
//		arr2[2] = 10;
//		System.out.println(arr3[2]);
		
//		int[] arr3 = arr2;
//		arr3 = doSmth(arr2);
//		doSmth(arr2);
//		System.out.println(arr2[1]);
		
//		doSmth2(arr2);
//		System.out.println(arr2[1]);
//		System.out.println(arr3[1]);
		
		
//		int length = arr2.length;
//		arr2.equals(arr2);
//		
//		System.out.println(Arrays.toString(arr2));
		
		
		
//		int[][] matrix = new int[5][];
//		System.out.println(matrix[1]);
		
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9,10}
		};
		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < matrix.length; i++) {
//			System.out.println(Arrays.toString(matrix[i]));
//		}
		
//		System.out.println(Arrays.toString(matrix));
		
//		
//		Integer[] arr = {100, 5, 200};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr, Comparator.reverseOrder());
//		
//		
//		Arrays.sort(matrix, (arr1, arr2) -> {
//			int evenAmountArr1 = 0;
//			for (int i : arr1) {
//				if (i % 2 == 0) 
//					evenAmountArr1++;
//			}
//			
//			int evenAmountArr2 = 0;
//			for (int i : arr2) {
//				if (i % 2 == 0) 
//					evenAmountArr2++;
//			}
//			
//			return evenAmountArr2 - evenAmountArr1;
//		});
//		
//		Arrays.sort(matrix, Lesson3_3 :: compareArrays);
//		
//		printMatrix(matrix);
		
		
		String[] arr = {"acqwcq1", "asd", "as", "asdqwd"};
		Arrays.sort(arr, (str1, str2) -> {
			return str1.length() - str2.length();
		});
		System.out.println(Arrays.toString(arr));
	}
	
	public static int compareArrays(int[] arr1, int[] arr2) {
		int evenAmountArr1 = 0;
		for (int i : arr1) {
			if (i % 2 == 0) 
				evenAmountArr1++;
		}
		
		int evenAmountArr2 = 0;
		for (int i : arr2) {
			if (i % 2 == 0) 
				evenAmountArr2++;
		}
		
		return evenAmountArr2 - evenAmountArr1;
	}
	
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	
	
	
	public static void doSmth(int[] array) {
		array = null;
		System.out.println(array);
	}
	
	public static void doSmth2(int[] array) {
		array[1] = 100;
	}
	


}



class A implements Iterable<String> 
//, Comparable<A> 
{

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public int compareTo(A o) {
//		
//		
//		return 0;
//	}
	
}

enum Seasons {
	SUMMER(1), WINTER(2), SPRING(3), FALL(4);
	
	public int i;
	
	private Seasons(int i) {
		this.i = i;
	}
	
	private void doSmth() {
		
	}
}
