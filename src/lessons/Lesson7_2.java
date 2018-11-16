package lessons;

import java.io.IOException;
import java.util.function.Function;

public class Lesson7_2 {
	
	public static void main(String[] args) {
//		I10 i = new ACChild();
//		doSomeFilter((someString) -> someString.substring(1, 2), "ard");
//		doSomeFilter((someString) -> someString.substring(4, 6), "ard");
//		
//		Stanok s = new Stanok();
//		s.startEngine();
//		s.beepBeep();
		
		CustomList cl = new CustomListImpl1();
		CustomList cl2 = new CustomListImpl2();
		
		cl.add(new Object());
		cl2.add(new Object());
	}
	
	public static void doSomeFilter(Function<String, String> fun, String arg) {
		// do smth
		String result = fun.apply(arg);
		// do smth with result
	}

}


class Stanok {
	private Car10 car;
	
	public Stanok(Car10 car) {
		this.car = car;
	}
	
	public Stanok() {
		this.car = new Car10();
	}
	
	public void startEngine() {
		car.startEngine();
	}
	
}

class Car10 {
	
	public void startEngine() {
		
	}
	
	public void beepBeep() {
		
	}
}

interface CustomList {
	int I = 1; 
	
	void add(Object o);
}

class CustomListImpl1 implements CustomList {

	@Override
	public void add(Object o) {
		System.out.println("ADD 1");
	}
	
}

class CustomListImpl2 implements CustomList {

	@Override
	public void add(Object o) {
		System.out.println("ADD 2");
	}
	
}




class A10 {
	
	protected CustomList doSmth(CustomList c) throws IOException {
		return new CustomListImpl1();
	}
}

class ChildA extends A10 {
	
	@Override
	public CustomListImpl1 doSmth(CustomList c) {
		return new CustomListImpl1();
	}
}






interface I10 {
	
}

abstract class AC implements I10 {
	
}

class ACChild extends AC {
	
}




class BookService {
	

}
