package lessons.group11;

public class DebugDemo {

	public static void main(String[] args) {
		
		String str = "Hello";
		for (char c : str.toCharArray()) {
			System.out.println(c);
			int i = c - 10;
			doSomething();
		}
		
		
	}

	private static void doSomething() {
		int i = 10;
		System.out.println(i);
	}
}
