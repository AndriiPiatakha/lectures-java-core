package lessons.group6;

public class Lesson7 {
	
	public int sum(Integer a, Integer b) {
		if (a == null || b == null) {
			throw new RuntimeException(new IllegalArgumentException("Some expected meessage"));
		}
		return a + b;
	}

}
