package oop.cloning;

//import org.apache.commons.lang3.*;

public class CloneDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		A a = new A();
		A clone = (A)a.clone();
		System.out.println("a = " + a);
		System.out.println("clone = " + clone);
		System.out.println(a.b == clone.b);
		
	}

}

class A implements Cloneable {
	int i;
	String s;
	B b;
	
	{
		i = 10;
		s = "some text";
		b = new B();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		A a = (A)super.clone();
		// Deep cloning 
		return a;
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", s=" + s + ", b=" + b + "]";
	}


	
}

class B {
	int i;
	String s;
	
	{
		i = 20;
		s = "B some text";
	}

	@Override
	public String toString() {
		return "B [i=" + i + ", s=" + s + "]";
	}
}