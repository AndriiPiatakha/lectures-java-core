package oop;
import java.util.Arrays;

public class Demo2 {
	
	private SomethingThatCanMove smth;
	
	private int i;
	
	public Demo2() {
		
	}
	
	public Demo2(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public void test(int[] arr) {
		if (arr == null) {
			return;
		}
	}
	
	public Book[] getBooksByYear(int year, Book[] books) {
		return Arrays.stream(books).filter(book -> {
			return book.getYear() > year;}).toArray(Book[]::new);
		
		
//				.toArray(Book[]::new);
	}
	
//	STREAM API
	public static void main(String[] args) {
//		int[] arr = {11, 2, 3};
//		int[] array = Arrays.stream(arr).sorted().filter((int i) -> i%2 == 0).toArray();
//		System.out.println(arr.length);
//		System.out.println(array.length);
//		
//		Book b = new Book();
//		Car c = new Car();
//		
		Vehicle[] arrV = {new Car(), new Van()};
		
		for (Vehicle vehicle : arrV) {
			vehicle.getSpeed();
			vehicle.someStaticMeth();
		}
		
		Vehicle v = new Car();
		
		SomethingThatCanMove car4 = new Van();
		
//		Vehicle v2 = new Car();
//		if (v3 instanceof Car) {
//			Car v3 = (Car)new Vehicle();
//		}
//		
//		v3.getWheels();
//		
//		c.getSpeed();
		
//		Vehicle c = new Car();
//		Car c3 = (Car)c;
//		Class<Vehicle> c2 = Vehicle.class;
		
		
	}
	
	public Car test(Vehicle v) {
		if (v instanceof Car) {
			return (Car)v;
		}
		return null;
	}
	

}



// instance of
// composition aggregation

class Horse {
	
//	private Vehicle v = new Vehicle();
	
//	Horse(Vehicle v) {
//		this.v = v;
//	}
	
//	public int getSpeedMph() {
//		return v.getSpeed();
//	}
}

abstract class Vehicle {
	
	private int speed;
	private int passangersCapacity;
	
	private final int someFinal = 1;
	
	public static final String SOME_CONSTANT = "";
	
	
	Vehicle(int i) {
//		someFinal = 1;
	}
	
	{
//		someFinal = 1;
		System.out.println("Parent init");
	}
	
	static {
//		someFinal = 1;
		System.out.println("Static parent init");
	}
	
	public Vehicle() {
		System.out.println("Parent constr");
	}
	
	public static void someStaticMeth() {
		System.out.println("Vehicle static");
	}
	
	public final Vehicle getVehicle() {
		return this;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public abstract void someAbstractMeth();
	
	public void setSpeed(final int speed) {
		this.speed = speed;
	}
	public int getPassangersCapacity() {
		return passangersCapacity;
	}
	public void setPassangersCapacity(int passangersCapacity) {
		this.passangersCapacity = passangersCapacity;
	}
	
	
	
}

class Car extends Vehicle {
	
	private int speed;
	
	{
		System.out.println("Child init");
	}
	
	static {
		System.out.println("Static child init");
	}
	
	public Car() {
		super(1);
		System.out.println("Child constr");
	}
	
	private int wheels;
	
	public int getWheels() {
		return this.wheels;
	}
	
	public int getSpeed() {
		System.out.println("CAR GETTER");
		return this.speed;
	}

	@Override
	public void someAbstractMeth() {
		
	}
	
}

class Van extends Vehicle implements SomethingThatCanMove, SomethingThatCanMove2 {
	private int speed;
	
	@Override
	public int getSpeed() {
		System.out.println("VAN GETTER");
		return this.speed;
	}

//	@Override
//	public Van getVehicle() {
//		return this;
//	}
	

	public static void someStaticMeth() {
		System.out.println("Van static");
	}

	@Override
	public void someAbstractMeth() {
		System.out.println("Some realisation");
		
	}

	@Override
	public void doSmth() {
		// TODO Auto-generated method stub
		
	}
	
}


class Book {
	
	private int year; 
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}

interface SomethingThatCanMove {
	
	public abstract void doSmth();
	
	default void tst() {
		System.out.println("Some default");
	}
}

interface SomethingThatCanMove2 {
	
//	default void tst() {
//		System.out.println("Some default");
//	}
}

interface Validator {
	
//	boolean isValid(User user);
}