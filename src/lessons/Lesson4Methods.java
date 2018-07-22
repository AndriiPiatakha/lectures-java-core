package lessons;

public class Lesson4Methods {
	
	public static void main(String... args) {
		int i = 1;
		doSmth(i);
		System.out.println(i);
		
		int[] arr = {1, 2, 3};
		doSmth(arr);
		System.out.println(arr[1]);
		
		doSmth2(arr);
		System.out.println(arr);
	}
	
	private static void doSmth(int i) {
		i++;
		System.out.println("in method: " + i);
	}
	
	private static void doSmth(final int... arr) {
		arr[1] = 100;
	}
	
	private static void doSmth2(int... arr) {
		// do smth with arr final
		arr = null;
		
		// do smth more with the same arr
		System.out.println(arr);
	}
	
	private static int returnSmth() {
		return 1;
	}

}
