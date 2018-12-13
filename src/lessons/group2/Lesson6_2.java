package lessons.group2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.function.Predicate;

import lessons.group2.Shape.Center;
import lessons.group2.Shape.Nested;

public class Lesson6_2 {
	
	private static int i;
//	private final int i2;
	public static final String SOME_CONST = "asd";
	
	public Lesson6_2() {
		super();
		
	}
	
	{
//		i2 = 1;
	}
	
	static {
		i = 1;
	}
	
	public static void main(String[] args) {
//		Book2[] books = new Book2[10];
//		Book2[] filteredBooks = filterBooksByAuthor(books, "Leo Tolstoy");
//		Arrays.toString(filteredBooks);
//		
//		Lesson6_2 l = new Lesson6_2();
//		Lesson6_2.doSmthStatic();
		
		Calendar instance = Calendar.getInstance();
		instance.set(1991, 1, 5);
		System.out.println(instance);
		System.out.println(instance.getTime());
		
		Center shape = new Shape().new Center();
		Nested n = new Shape.Nested();
		
	}

	private static void doSmthStatic() {
		
	}
	
	private static void doSmthStatic(int i) {
		
	}
	
	private static Book2[] filterBooksByAuthor(Book2[] books, String authorName) {
		return Arrays.stream(books)
				.filter(new Predicate<Book2>() {
					private int i;
					
					@Override
					public boolean test(Book2 t) {
						return false;
					}
				})
				.toArray(Book2[]::new);
		
//		return Arrays.stream(books)
//				.filter(book -> book.getAuthor().equals(authorName))
//				.toArray(Book2[]::new);
	}

}

class Shape {
	class Center {
		
	}
	
	static class Nested {
		
	}
}

class Book2 {
	
	public String getAuthor() {
		return "";
	}
}