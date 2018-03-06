package io.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerialDemo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		A a = new A(1, "some text");
		B b = new B();
		System.out.println("Object to write = " + a);
		try (ObjectOutputStream ous = new ObjectOutputStream(
				new FileOutputStream("serialFile"))) {
			ous.writeObject(a);
			ous.writeObject(b);
		}
		A readObject;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serialFile"))) {
			readObject = (A)ois.readObject();
		}
		System.out.println(readObject);
		
		System.out.println(readObject == a);
		
		ArrayList<B> bList = new ArrayList<>();
		ArrayList<A> aList = new ArrayList<>(bList);
		if (b instanceof A) {
			
		}
		
		b.getClass().isInstance(a);
		
	}
	
	public void test(List<? super Number> list) {
		list.add(new Double(1));
	}

}


class A implements Serializable {

	private static final long serialVersionUID = 1L;
	private int i;
	private transient String str;
	private B b;
	
	public A() {
		
	}
	
	public A(int i, String str) {
		this.i = i;
		this.str = str;
		this.b = new B();
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", str=" + str + ", b=" + b + "]";
	}

	
	
}

class B extends A implements Serializable {
	private String bString;
	private int bInt;
	
	{
		bString = "bString";
		bInt = 2;
	}

	@Override
	public String toString() {
		return "B [bString=" + bString + ", bInt=" + bInt + "]";
	}
}