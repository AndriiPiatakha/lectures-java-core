package lessons.group6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Lesson1 {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>(Arrays.asList("a", "ba", "sdasda", "qw"));
//		Collections.sort(list, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.length() - o1.length();
//			}
//		});
//
//		Collections.sort(list, (o1, o2) -> o2.length() - o1.length());
//		Collections.sort(list, Lesson1::sort);
//		
//		List<String> synchronizedList = Collections.synchronizedList(list);
//
//		System.out.println(list);
//		
//		TreeSet<Car> tree = new TreeSet<>();
		Car c = new Car();
		c.doSmth2();
		System.out.println(c.SOME_INT);

		

	}

	public static int sort(String o1, String o2) {
		return o2.length() - o1.length();
	}

}

class Car extends Vehicle implements Comparable<Car>, SomeI {

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doSmth() {
		// TODO Auto-generated method stub
		
	}
	
	public static void doSmth2() {
		System.out.println("In car");
	}
}

class Vehicle {
	
	public static void doSmth2() {
		System.out.println("In vehicle");
	}
	
}

interface SomeI2 {
	
}

@FunctionalInterface
interface SomeI extends SomeI2 {

	int SOME_INT = 1;
	
	void doSmth() throws IOException;
	
	static void doSmth2() {
		System.out.println("In SomeI");
	}
	
	default void какойтоМетод() {
		
	}
}
