package oop;

import oop.Shape.Point;

public class Demo {

	public static void main(String[] args) {
		User user = new User();
		User user3 = new User();
//		User user2 = new User("John");
		
//		System.out.println(user.name);
//		System.out.println(user2.name);
//		
//		System.out.println(user.defaultId);
//		System.out.println(user2.defaultId);
		
//		System.out.println(user.userCounter);
//		System.out.println(User.userCounter);
		Demo d = new Demo();
		d.printSmth();
		
		Shape shape = new Shape();
		Point point = shape.new Point();

	}
	
	static void printSmth() {
		
	}

}

class User {
	String name;
	int defaultId;
	int moneyAmount;
	
	static int userCounter;
	
	{
		name = "Default";
		defaultId = 1;
		System.out.println("Init Block");
		++userCounter;
	}
	
	static {
		System.out.println("Init Static");
	}
	
	public User() {
		System.out.println("Default constructor");
	}
	
	public User(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}
	
	void createPaymentTo(String nameTo, int moneyAmount) {
		this.moneyAmount -= moneyAmount;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
}


class Shape {
	
	Point point;
	
	Shape() {
		
	}
	
	Shape(Point point) {
		this.point = point;
	}
	
	class Point {
		
	}
	
	static class Array {
		
	}
}


