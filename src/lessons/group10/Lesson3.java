package lessons.group10;

import java.util.Arrays;
import static lessons.group10.Seasons.*;

public class Lesson3 {

	public static void main(String[] args) {
//		String str = "asd";
//		String str2 = new String("asd");
//		String str3 = "asd";
//		System.out.println(str == str3);
//		System.out.println(str2 == str3);
//		System.out.println(str2.intern() == str3);
//		System.out.println(str2.equals(str3));

//		String str4 = "asasdasd asdasd asdasd \t  \r\n asdasd";
//		String[] strings = str4.split("\\s+");
//		System.out.println(Arrays.toString(strings));

//		loop1: for (int i = 0; i < 10; i++) {
//			loop2: for (int j = 0; j < 10; i=j++) {
//				if (j == 5) {
//					continue loop2;
//				}
//			}
//		}
//	
//		byte b = 0;
//		while (b >= 0) {
//			b++;
//			System.out.println(b);
//		}
//		
//		System.out.println(b);
//		do {
//			System.out.println("Я выполнюсь по-любому");		
//		} while (b > 0);
//		
//		int[] array = {1, 2, 3};
//		
//		for (int i : array) {
//			System.out.println(i);
//		}
//		
//		System.out.println("Loop is finished");

//		int[][] matrix = {
//				{1, 2, 3},
//				{4, 5},
//				{6, 7, 8, 9}
//		};
//		
////		matrix[i][j]
//
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}

//		int i = 5;
//		if (i > 0) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
//		
//		if (i > 0) {
//			System.out.println("True");
//		} else if (i < 0) {
//			System.out.println("False");
//		} else if (i < 0) {
//			System.out.println("False");
//		} else {
//			
//		}
//		
//		if (i > 0) {
//			System.out.println("True");
//		}
//		if (i < 0) {
//			System.out.println("False");
//		}
//		

		// byte, short, int, char, String, Enum
//		char i = 5;
//		System.out.println(Seasons.WINTER.ordinal());
//		switch (FALL) {
//		case WINTER:
//			System.out.println(1);
//			break;
//		case FALL:
//			System.out.println(5);
//			break;
//		default:
//			System.out.println("default");
//		}
		
//		String[] array = {"asd", "asdf", "a", "Z", "zasd"};
//		Arrays.sort(array);
//		Arrays.sort(array, 
//				(str1, str2) -> str1.compareToIgnoreCase(str2));
//		System.out.println(Arrays.toString(array));
//		
//		doSmth("s1", "s2");

//		int i = 1;
		int[] arr = {1, 2, 3};
//		doSmth2(i);
//		System.out.println(i);
//		doSmth3(arr);
//		System.out.println(arr[0]);

		for (int i : arr) {
			int b = i + 5;
			if (b % 2 == 0) {
				doSmth4(i, arr);
				System.out.println("smth");
			}
		}
		
	}
	
	public static void doSmth4(int i2, int... arr) {
		System.out.println(arr[0]);
		for (int i : arr) {
			
		}
	}
	
	public static void doSmth3(int[] arr) {
		arr = null;
	}
	
	public static void doSmth2(int i) {
		i = 10;
		System.out.println(i);
	}
	
	public static int doSmth(String str1, String str2) {
		return str1.compareToIgnoreCase(str2);
	}

}

enum Seasons {
	WINTER, SPRING, SUMMER, FALL;
}
