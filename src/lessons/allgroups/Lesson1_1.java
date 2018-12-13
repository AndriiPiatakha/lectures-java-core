package lessons.allgroups;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson1_1 {

	public static void main(String[] args) {

		// System.out.println(7 % 2);
		// System.out.println(2 % 7);

		// int i = 1;
		// System.out.println(i);
		// System.out.println(i++);
		// System.out.println(++i);

		// System.out.println(1 == 1);
		// System.out.println(1 != 1);
		//
		// String s = "hello";
		// String s2 = "hello";
		//
		// String s3 = "hello";
		// s3 += "1";
		// String s4 = "hello";
		// s4 += "1";
		//
		// String s5 = new String("hello");
		// String s6 = new String("hello");
		//
		// System.out.println(s == s2);
		//// System.out.println("s3 = " + s3 + " s4 = " + s4);
		// System.out.println(s3 == s4);
		// System.out.println(s5 == s6);
		// System.out.println(s5.intern() == s6.intern());
		// System.out.println(s5 == s6);
		//
		//
		// int i = 1;
		// i += 1;
		// i %= 2;
		// i *= 2;

		// &
		// |
		// ^
		// ~
		// >>
		// <<
		// >>>
		//
		// x * 2 pow y
		// System.out.println(3 << 3);
		// System.out.println(3 >> 1);
		//
		//
		// int i1 = 7;
		// System.out.println(5 / 2);
		//
		// System.out.println(3.1F - 2.3F);
		//
		// System.out.println(-7 >>> 2);
		//
		// System.out.println(1 + 2 / 2 * 3 >> 1 | 1);
		//
		// &&
		// ||
		// &
		// |
		// !
		//
		// boolean t = true;
		// boolean f = false;
		//
		// System.out.println(t || (5 / 0) > 1);
		// System.out.println(f && (5 / 0) > 1);
		//
		// String s = null;
		// System.out.println(isLengthMoreThan("1234567", 7));
		// System.out.println(isLengthMoreThan(null, 7));
		//
		// String someString = " ";
		// int result = someString != null ? someString.length() : 0;
		// System.out.println(result);
		//
		// System.out.println(Math.sqrt(-2));
		// System.out.println(5.0 / 0);
		//
		// Random r = new Random();
		// System.out.println(r.nextDouble());
		//
		// double pow = Math.pow(2, 3);
		// double pow2 = Math.pow(2, 6);
		// double pow3 = Math.pow(2, 7);
		// System.out.println(pow);

		// java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.print("Введите число плиз: ");
//		Scanner sc = new Scanner(System.in);
//		int nextInt = sc.nextInt();
//
//		System.out.println("Вы ввели число " + nextInt);
//
//		System.out.println("А теперь введите букву о которой я думаю: ");
//		String nextLine = sc.next();
//		
//		System.out.println(nextLine.equals("a"));
//
//		switch (nextLine) {
//		case "a":
//			System.out.println("YOU WIN!");
//			break;
//		case "b":
//			System.out.println("YOU LOSE");
//			break;
//		default:
//			System.out.println("Completely wrong answer");
//		}
		
		
		int i = 1;
		Integer iObj = i;
		Integer iObj2 = Integer.valueOf(1);
		i = iObj2;
		
		Integer i2 = -128;
		Integer i3 = -128;
		System.out.println(i2 == i3);
		
		Double d = 1.0;
		Double d2 = 1.0;
		System.out.println(d == d2);
		
//		doSmth(iObj2, i);
//		
//		int[] arr = {1, 2, 3};
//		Integer[] array = 
//				Arrays.stream(arr)
//						.mapToObj(Integer::valueOf)
//						.toArray(Integer[]::new);
	}
	
	public static void doSmth(int i, Integer i2) {
		System.out.println("int");
	}
	
	public static void doSmth(Integer i, int i2) {
		System.out.println("Integer");
	}
	

	public static boolean isLengthMoreThan(String text, int length) {
		return text != null && !text.isEmpty() && text.length() >= length;
	}

}
