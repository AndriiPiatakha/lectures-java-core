package collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Lesson11 {
	
	private int list;
	
	
	public static void main(String[] args) {
		String s = "asda, asdas; asda.";
		String[] split = s.split("\\p{P}");
		System.out.println(Arrays.toString(split));
		System.out.println(split.length);
		
		Set<String> set = new TreeSet<>();
	}
	
	private class A {
		
		private int list;
		public void doSmth() {
			Lesson11.this.list = 10;
			
		}
	}

}
