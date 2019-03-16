package lessons.group6;

public class Lesson7 {
	
	public int sum(Integer a, Integer b) {
		if (a == null || b == null) {
			throw new IllegalArgumentException();
		}
		return a + b;
	}

}
