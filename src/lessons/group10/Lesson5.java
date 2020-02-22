package lessons.group10;

public class Lesson5 {

	public static void main(String[] args) {
		drawRectangle(5, 2);
		
//		Abstract a = new Abstract();
		Abstract.doSmthStatic();
		
		Car c = new ECar();
		c.drive();
		
		FuncI funcI = () -> System.out.println("Hello");
		FuncI funcI2 = new FuncI() {

			@Override
			public void doSmth() {
				// TODO Auto-generated method stub
				
			}
			
		};
		FuncI funcI3 = new SomeClass();
		funcI.doSmth();
		
	}
	
	public static void drawRectangle(int height, int width) {
		
	}
}


abstract class Abstract {
	
	public abstract void doSmth2();
	
	public static void doSmthStatic() {
	}
	
}

interface LI5 {
	void doSmth();
}


class Car {
	
	public Car drive() {
		System.out.println("I drive like regular car");
		return this;
	}
	
}

class ECar extends Car {
	
	@Override
	public ECar drive() {
		System.out.println("I drive like E-Car");
		return this;
	}
	
	public void drive(int i) {
		
	}
}


@FunctionalInterface
interface FuncI {
	
	void doSmth();
	
//	void doSmth2();
	
	default void doSmth3() {
		
	}
	
	static void doSmth4() {
		
	}
}

class SomeClass implements FuncI {

	@Override
	public void doSmth() {
		System.out.println("Hello!");	
	}
	
}




