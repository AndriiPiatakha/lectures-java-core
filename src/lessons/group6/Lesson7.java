package lessons.group6;

import java.util.Arrays;

public class Lesson7 {
	
	public static void main(String[] args) {
		String regex = ",|\n";
		String s = "1,2*3*3\n";
		String[] split = s.split("\\D");	
		System.out.println(Arrays.toString(split));
	}
	
	public int sum(Integer a, Integer b) {
		if (a == null || b == null) {
			throw new RuntimeException(new IllegalArgumentException("Some expected meessage"));
		}
		return a + b;
	}

}
