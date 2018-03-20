package syntax;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo3 {

	public static void main(String[] args) {

		// while (true) {
		// System.out.println("Print");
		// break;
		// }
		//
		// do {
		// System.out.println("One iteration");
		// } while (false);
		//
		// for (int i = 0; i < 5; i++) {
		// OUT: if (i == 3)
		// break OUT;
		// System.out.println(i);
		// }
		//
		// byte b = 0;
		// while (b >= 0) {
		// System.out.println(b);
		// b++;
		// }
		// for (int i : arr2) {
		// System.out.println(i);
		// }

		// int[] arr = new int[10];
		// int[] arr2 = {4, 1, 5};
		//
		// System.arraycopy(arr2, 0, arr, 3, arr2.length);
		// System.out.println(Arrays.toString(arr));
		
//		int arr[] = new int[10];
//		for (int i = 1; i < arr.length; i++) {
//			for (int j = i; (j >= 1) && (arr[j] < arr[j - 1]); j--) {
//				int a = arr[j];
//				arr[j] = arr[j - 1];
//				arr[j - 1] = a;
//			}
//		}
//
//		System.out.println(-2.0 / 0);
//		System.out.println(Math.sqrt(-1));
//
//		System.out.println(DemoEnum.D.getI());
		
		Integer[] arr = {4,7,1,5,9};
		
		
		Arrays.sort(arr, (a, b) ->  b - a);
		
		Arrays.sort(arr, Demo3::customSort);
		
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		});
		
		Arrays.sort(arr, new DescendingOrderComparator());
		
		System.out.println(Arrays.toString(arr));
		
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8}
		};
		
		int[][] matrix2 = new int[2][];
		
		System.out.println(Arrays.toString(matrix2));
		
		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Demo 90 degrees");
		doSmth(arr);
		
		
	}
	
	static void doSmth(Integer[] arr) {
		
	}
	
	static int customSort(Integer a, Integer b) {
		return b - a;
	}

	void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}
}

class DescendingOrderComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		return b - a;
	}
	
}

enum DemoEnum {
	A, B, C, D(1), E(2);

	private int i;

	private DemoEnum() {
	}

	DemoEnum(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}
}
