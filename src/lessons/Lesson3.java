package lessons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Lesson3 {

	
	public static void main(String[] args) {
		// int readedValue = 1000;
		// String value = Integer.toString(readedValue);
		// for (int i = 0; i < value.length(); i++) {
		// System.out.println(value.charAt(i));
		// }
		//
		// if (true)
		// System.out.println(true);
		// else
		// System.out.println(false);
		//
		//
		//
		// if (true) {
		//
		// } else if (true) {
		//
		// } else if (true) {
		//
		// } else {
		//
		// }
		//
		// switch (Color.A) {
		// case A:
		// System.out.println(1);
		// break;
		// case B:
		// System.out.println(2);
		// break;
		// default: System.out.println("default");
		// }
		//
		// char c = 'a';
		// switch (c) {
		// case 1:
		// System.out.println(1);
		// break;
		// case 2:
		// System.out.println(2);
		// break;
		// default: System.out.println("default");
		// }

		// switch (1L) {
		// case 1:
		// System.out.println(1);
		// break;
		// case 2:
		// System.out.println(2);
		// break;
		// default: System.out.println("default");
		// }

//		System.out.println(Color.A.getI());

//		switch (3) {
//		case 1:
//			System.out.println(1);
////			break;
//		case 2:
//			System.out.println(2);
//			break;
//		default:
//			System.out.println("default");
//		}
		
//		int i = 1;
//		// c пост проверкой условия
//		do {
//			
//		} while (i > 0);
//		
//		// c пред проверкой условия
//		while (i > 0) {
//			
//		}
//		
		// цикл со счетчиком
//		l: for(int i2 = 0; i2 < 10;) {
//			if (true) {
//				i2 += 2;
//				continue l;
//			}
//			for (int i3 = 0; i3 < 10;) {
//				break l;
//				goto 
//				const
//				var
//			}
//		}
		
		// foreach 
		// for arrays or Iterable
//		String[] arr = {"1", "2", "3"};
//		for (String string : arr) {
//			System.out.println(string);
//		}
		
//		int[] arr = {1, 2, 3};
//		int[] arr2 = new int[3];
//		int arr3[] = new int[3];
//		
//		int[][] matrix = {
//				{1, 2, 3},
//				{3, 4, 5},
//				{6, 7, 8}
//		};
		
//		int[][] matrix2 = new int[10][];
////		System.out.println(matrix2[1]);
//		
//		int[] arr6 = arr;
//		arr6[1] = 100;
//		System.out.println(arr[1]);
//		
//		System.out.println(Arrays.toString(arr6));
//		
//		for(int i = 0; i < matrix.length; i++) {
//			for(int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
//		Object arr4[] = {new Integer(1), new String()};
//		
//		Object object = arr4[1];
		
//		System.out.println(arr[0]);
//		System.out.println(arr2.length);
//		System.out.println(arr2[arr2.length]);
		
		
//		Random r = new Random(1);
//		System.out.println(r.nextInt(10));
//		System.out.println(r.nextInt(10));
//		
//		// (Math.random() * ((max - min) + 1)) + min
//		int random = (int) (Math.random() * 1000);
//		System.out.println(random);
		
		
		Integer[] arr = {10, 2, 30};
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		
		String[] strings = {"asdasd", "acqc", "acqc", "acqweqwe"};
		Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());
		
		Arrays.sort(strings, (String s1, String s2) -> {
			return s1.length() - s2.length();
		});
		
//		Arrays.sort(strings, );

		System.out.println(Arrays.toString(strings));
		Color.RED.ordinal();
		
		Toy[] toys = {new Toy()};
		Arrays.sort(toys, (toy1, toy2) -> toy1.getColor().ordinal() - toy2.getColor().ordinal());
		
		Arrays.sort(strings, Lesson3::doSort);
	}
	
	public static int doSort(String s1, String s2) {
		return s1.length() - s2.length();
	}
	
//	public void test(String... l, int... i) {
//		
//	}
}


class Toy {
	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}

enum Color {
	RED, GREEN, YELLOW;

	private int i;

	private Color() {
		this.i = 1;
	}

	public int getI() {
		return this.i;
	}
}
