package lessons.group8;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {

	// private static Scanner sc;
	// private static int a, b, c;
	// private int f;

	public static void main(String[] args) {
		// sc = new Scanner(System.in);
		// System.out.println(sc.next());
		// sc.close();

		// int i = 1;
		// double d = 3.7;
		// System.out.println(Math.round(d));
		//
		//
		//
		// if (a <= 0 || b <= 0 || c <= 0) {
		// System.out.println("Error, try one more time");
		//
		// } else {
		//
		// double p = (a + b + c) / 2;
		// double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		//
		// System.out.println("Area is equal to " + s + "\n");
		// System.out.println("One's again");
		// }

		// Scanner sc1 = null;
		// if (sc1.hasNextDouble()) {
		// double a = sc1.nextDouble();
		// } else {
		// System.out.println("Введите числовое значение. " + "Дробную часть
		// отделяйте запятыми.");
		// System.exit(0);
		// }
		//
		// System.out.println(a);
		//
		//
		//
		//
		// char c = 'c';
		// Character c1 = 'c';
		//
		// boolean b = true;
		// Boolean b1 = true;
		//
		//
		//
		// int i = 1000;
		// int i3 = 1;
		// Integer i1 = 1000;
		// Integer i2 = 1000;
		//// doSmth(i1);
		//
		// System.out.println(i2.equals(i1));

		// String s = new String("asdasd");
		// String s1 = new String("asdasd");
		//
		// System.out.println(s.intern() == s1.intern());
		//

		// if (true)
		// System.out.println(true);
		// else {
		// if ()
		// System.out.println(false);
		// }
		// boolean c = true;
		//
		// switch(Etest.A) {
		// case B:
		// System.out.println(0);
		// default:
		// System.out.println("default");
		// }
		//
		//
		// System.out.println(Etest.A.i);
		//
		// }

		// public static void doSmth(int i) {
		//
		// }

		for (int i = 0; i < 6; i++) {
//			b: for (int j = 0; j < 5; j++) {
////				continue b;
//				if (true) {
//					break b;
//				}
//				
//			}
//			
		
//			if (i % 2 == 0) {
//				continue;
//			}
//			System.out.println(i);
		}
//
//		System.out.println("finished");
//		
//		byte b = 1;
//		while (b > 0) {
//			System.out.println(b);
//			b++;
//		}
//		
//		do {
//			System.out.println("hello");
//		} while (b < 0);
		
//		char[] charArr = "asd".toCharArray();
//		
//		for (char c : charArr) {
//			System.out.println(c);
//		}
//		
		
		Integer[] intArr = new Integer[10];
		
		int[] arr2 = {1, 2, 3};
		int[] arr3 = arr2;
		
		arr3[1] = 200;
		
		System.out.println(Arrays.toString(arr2));
		
//		Arrays.fill(intArr, 1);
//		for (Integer i : intArr) {
//			System.out.println(i);
//		}
//		
//		System.out.println(Arrays.toString(intArr));

	}
}

enum Etest {
	A, B, C;

	public int i;
}
