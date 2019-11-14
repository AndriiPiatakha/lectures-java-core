package lessons.group9;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
//		double d = Math.PI;
//		int acdcHex = Integer.parseInt("ACDC", 16);
//		String hexString = Integer.toHexString(44252);
//		System.out.println(acdcHex);
//		System.out.println(hexString);
//		
//		for (String string : args) {
//			System.out.println(string);
//		}
//		
//		Priority.LOW.doSmth();
//		Priority.HIGH.doSmth();
//		switch (Priority.LOW) {
//			case LOW: System.out.println("1");
//			      	break;
//			case HIGH: System.out.println("2");
//					break;
//			default: System.out.println("Default");
//		}
//		
//		for (int i = 0; i < 10; i++) {
////			if (i % 2 != 0) {
////				continue;
////			} else {
////				System.out.println(i);
////			}
////			
////			c: for (int j = 0; j <10; j++) {
////				if (true) {
////					continue c;
////				}
////			}
//			int b = sum(i, 10);
//			System.out.println(b);
//		}
//		
//		int i = 0;
//		while (i < 128) {
//			System.out.println(i);
//			++i;
//		}
//		
//		do {
//			System.out.println(i);
//		} while (i < 128);
//		
//		
//		// Iterable
//		for (String string : args) {
//			System.out.println(string);
//		}
//		
//	}
//	
//	public static int sum(int i1, int i2) {
//		return i1 + i2;
//	}
//	
	
		
//		String[] arr = new String[30];
//		String[] arr2 = {"a", "b"};
//		String[] arr3 = {"c", "d"};
//		
//		arr2 = arr3;
//		arr3[0] = "New!!!";
		
//		System.out.println(arr2[0]);
		
//		for (String string : arr) {
//			System.out.println(string);
//		}
		
//		doSmth2(arr3);
//		System.out.println(arr3[0]);
		
//		int[][] matrix = {
//				{1, 2, 3},
//				{4, 5, 6, 7, 8},
//				{9},
//		};
//		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		
//		int sum = Arrays.stream(matrix[0]).sum();
//		System.out.println(sum);
		
		Integer[] arr = {100, 1, 34, 2};
		Arrays.sort(arr, (int1, int2) -> int2 - int1);
		Arrays.sort(arr, (int1, int2) -> {
			return int2 - int1;
		});
		
		String[] strArr = {"asdad", "a", "asdasd", "as"};
		Arrays.sort(strArr, (str1, str2) -> str2.length() - str1.length());
		System.out.println(Arrays.toString(strArr));// "asdasd", "asdad", "as", "a"  
		
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void doSmth2(final String[] arr) {
//		arr = null;
		arr[0] = "1";
	}
}

enum Priority {
	LOW(1),
	MEDIUM(2),
	HIGH(3);
	
	private int i;
	
	private Priority(int i) {
		this.i = i;
	}
	
	public void doSmth() {
		
	}
}