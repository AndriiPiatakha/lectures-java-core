package lessons.group10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_2 {
	
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		outNumbers();
		sortArray();
		
		double d = 2.32;
		System.out.println(Math.round(d));
		
	}

	public static void outNumbers() {
		
		System.out.println("Enter any number:");
		String inString = in.next();
		char[] number = inString.toCharArray();
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println();
	}

	public static void sortArray() {
		System.out.println("Enter any 7 words:");
		String inWords = in.nextLine();
		String[] arr = inWords.split(" ");
		Arrays.sort(arr, (str1, str2) -> str2.length() - str1.length());
		System.out.println(Arrays.toString(arr));
	}

//	public static void pyramid() {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the hight pyramid: ");
//		int hight = in.nextInt();
//		for (int i = 1; i <= hight; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = hight - 1; i > 0; i--) {
//			for (int j = i; j > 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		in.close();
//	}
//
//	public static void arrays() {
//		int[] arr1 = new int[10];
//		int[] arr2 = new int[20];
//		Random ran = new Random();
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = ran.nextInt(100);
//		}
//		arr2 = Arrays.copyOf(arr1, 20);
//		System.out.println(Arrays.toString(arr1));
//		int j = 0;
//		for (int i = 10; i < arr2.length; i++) {
//			arr2[i] = arr2[j] * 2;
//			j++;
//		}
//		System.out.println(Arrays.toString(arr2));
//		System.out.println();
//	}
//
//	public static class Matrix {
//		static double[][] mt2 = new double[5][5];
//		static double[][] mt = { 
//				{ 1.1, 1.2, 1.3, 1.4, 1.5 },
//				{ 2.1, 2.2, 2.3, 2.4, 2.5 }, 
//				{ 3.1, 3.2, 3.3, 3.4, 3.5 },
//				{ 4.1, 4.2, 4.3, 4.4, 4.5 }, 
//				{ 5.1, 5.2, 5.3, 5.4, 5.5 } 
//				};
//
//		public static void matrix() {
//
//			for (int i = 0; i < mt.length; i++) {
//				for (int j = 0; j < mt.length; j++) {
//					System.out.print(mt[i][j] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println(" How much do you want to rotate matrix ?\n "
//					+ "If you want to rotate matrix to 90 degrees press 1. \n"
//					+ " If you want to rotate matrix to 180 degrees press 2. \n"
//					+ " If you want to rotate matrix to 270 degrees press 3. \n");
//			byte choice = in.nextByte();
//			if (choice == 1) {
//				rotateMatrix();
//			} else if (choice == 2) {
//				rotateMatrix();
//				rotateMatrix();
//			} else if (choice == 3) {
//				rotateMatrix();
//				rotateMatrix();
//				rotateMatrix();
//			}
//			for (int i = 0; i < mt2.length; i++) {
//				for (int j = 0; j < mt2.length; j++) {
//					System.out.print(mt2[i][j] + " ");
//				}
//				System.out.println();
//			}
//		}
//
//		public  static void rotateMatrix() {
//			for (int i = 0; i < mt2.length; i++) {
//				for (int j = 0; j < mt2.length; j++) {
//					mt2[i][j] = mt[mt2.length - j - 1][i];
//				}
//
//			}
//			for (int i = 0; i < mt.length; i++) {
//				for (int j = 0; j < mt.length; j++) {
//					mt[i][j] = mt2[i][j];
//				}
//			}
//		}
//	}
}
