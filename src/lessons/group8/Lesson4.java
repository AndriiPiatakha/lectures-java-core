package lessons.group8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// int num = 100;
		// List<Integer> prime = new ArrayList<>();
		// for (int i = 2; i < num; i++) {
		// boolean primeNum = true;
		// for (int j = 2; j < i; j++) {
		// if (i % j == 0) {
		// primeNum = false;
		// break;
		// }
		// }
		// if (primeNum) {
		// prime.add(i);
		// }
		// }

		// Random r = new Random();
		// int nextInt = r.nextInt(2) + 2;
		// System.out.println(nextInt);

		// BufferedReader reader = new BufferedReader(new
		// InputStreamReader(System.in));
		// System.out.println("Количество линий");
		// int a = Integer.parseInt(reader.readLine());
		// System.out.println("Высота");
		// int b = Integer.parseInt(reader.readLine());
		// System.out.println("Ширина");
		// int c = Integer.parseInt(reader.readLine());
		// for (int k = 0; k < b; k++) {
		// for (int i = 0; i < a; i++) {
		// if (i % 2 != 0) {
		// for (int j = 0; j < c; j++) {
		// System.out.print("+");
		// }
		// } else {
		// for (int j = 0; j < c; j++) {
		// System.out.print("*");
		// }
		// }
		// }
		// System.out.println();
		// Scanner scanner = new Scanner(System.in);
		//
		// System.out.print("Укажи количество вертикальных полос: ");
		// int vertLine = scanner.nextInt();
		//
		// System.out.print("укажи ширину обоев: ");
		// int width = scanner.nextInt();
		//
		// System.out.print("укажи высоту обоев: ");
		// int high = scanner.nextInt();
		//
		// for (int i = 0; i < high; i++) {
		// for (int j = 0; j < vertLine; j++) {
		// for (int a = 0; a < width; a++) {
		// System.out.print('+');
		// }
		// for (int b = 0; b < width; b++) {
		// System.out.print('*');
		// }
		// }
		// System.out.println();
		// }

//		for (int i = 2; i < 100; i++) {
//			for (int j = 2; j < i; j++)
//				if ((i % j) != 0) {
//					System.out.println(i + " - простое число.");
//				}
//		}
//		System.out.println();
		
		
//		String[] strings = {"abc", "y", "op", "Bcd", "z"};
//		System.out.println(Arrays.toString(strings));
//		
//		Arrays.sort(strings);
//		System.out.println(Arrays.toString(strings));
//		
//		Arrays.sort(strings, Lesson4::reverse);
//		System.out.println(Arrays.toString(strings));
		
//		doSmth("asd", 1, 2, 3, 4, 5);
		
//		doSmth2(new Integer(1), new Integer(1));
		
		int i = 1;
		doSmth3(i);
		System.out.println(i);
		
		int[] ints = {1, 2, 3};
		
		
		doSmth4(ints);
		System.out.println(Arrays.toString(ints));

		String format = String.format("asd %s and %f", "!", 12.0);
		System.out.println(format);
	}
	
	
	public static void doSmth4(int[] ints) {
//		ints[2] = 200;
		ints = null;
	}
	
	public static void doSmth3(int i) {
		i = 3;
	}
	
	public static void doSmth2(int i, Integer i2) {
		System.out.println("int");
	}
	
	public static void doSmth2(Integer i, int i2) {
		System.out.println("Integer");
	}
	
	public static void doSmth(String s, int... ints) {
		for (int i : ints) {
			
		}
		System.out.println(ints[0]);
	}
	
	public static int reverse(String str1, String str2) {
//		return str2.compareTo(str1);
		if (str1.length() > str2.length()) {
			return 1;
		} else if (str1.length() == str2.length()) {
			return str1.compareToIgnoreCase(str2);
		} else {
			return -1;
		}
	}

}
