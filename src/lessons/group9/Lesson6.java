package lessons.group9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson6 {
	
	public static void main(String[] args) {
//		List<Candy> list = new ArrayList<>();
//		double sum = list.stream()
//			.mapToDouble(Lesson6::getSugarFromCandy)
//			.sum();
//		
//		list.stream().forEach(System.out::println);
//		
//		Candy[] candies = new Candy[10];
//		Arrays.stream(candies)
//			.mapToDouble(candy -> candy.getSugar())
//			.sum();
//		
//		AClass aClass = new AClassImpl();
//		I.doSmthStatic();
//		
		
		I c = new Candy();
		c.doSmth();
		
	}
	
	public static double getSugarFromCandy(Candy candy) {
		return candy.getSugar();
	}

}


abstract class AClass {
	
	public void doSmth() {
		System.out.println("Default method abstr");
	}
}

class AClassImpl extends AClass {
	
}

class A2 {
	
}

interface I2 {
	default void doSmth() {
		System.out.println("Default method 2");
	}
}

interface I {
	
	default void doSmth() {
		System.out.println("Default method");
	}
	
	Candy doSmth2();
	
	static void doSmthStatic() {
		
	}
}

class Candy extends AClass implements I, I2 {
	
	public double getSugar() {
		return 0;
	}

	@Override
	public Candy doSmth2() {
		return null;
	}
	
}



interface Movable {
	void fly();
	void ride();
	void swim();
	
}

interface Rideable {
	void ride();
}

interface Swimable {
	void swim();
}

class Car implements Rideable {

	@Override
	public void ride() {
		System.out.println("I'm just a car I can only ride.");
		
	}
	
}

class SwimAbleCar implements Rideable, Swimable {

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}


