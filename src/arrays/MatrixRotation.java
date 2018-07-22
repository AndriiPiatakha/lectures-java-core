package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, 
				{ 1, 2, 3, 4, 5 }, 
				{ 1, 2, 3, 4, 5 }, 
				{ 1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5 } };

		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Please enter angle in degrees(90, 180, 270):");
			int userValue = sc.nextInt();
			rotateMatrix(matrix, userValue);
			printMatrix(matrix);
		}

	}

	public static void rotateMatrix(int[][] matrix, int degrees) {
		switch (degrees) {
		case 90:
			transpose(matrix);
			break;

		case 180:
			verticalReflection(matrix);
			break;

		case 270:
			verticalReflection(matrix);
			transpose(matrix);
			break;

		default:
			System.err.println("Please enter 90, 180 or 270 degrees only!");
		}
	}

	public static void transpose(int[][] matrix) {
		int length = matrix.length;
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	public static void verticalReflection(int[][] matrix) {
		int length = matrix.length;
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length / 2; j++) {
				temp = matrix[i][length - 1 - j];
				matrix[i][length - 1 - j] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] line : matrix) {
			System.out.println(Arrays.toString(line));
		}
	}

}
