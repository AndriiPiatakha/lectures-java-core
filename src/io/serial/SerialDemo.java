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
		System.out.println("Object to write = " + a);
		try (ObjectOutputStream ous = new ObjectOutputStream(
				new FileOutputStream("serialFile"))) {
			ous.writeObject(a);
		}
		A readObject;
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("serialFile"))) {
			readObject = (A)ois.readObject();
		}
		System.out.println("Read object = " + readObject);
		
		System.out.println(readObject == a);
		System.out.println(readObject.getB() == a.getB());
		
		System.out.println(readObject.i == a.i);
		
//		ArrayList<B> bList = new ArrayList<>();
//		ArrayList<A> aList = new ArrayList<>(bList);
//		if (b instanceof A) {
//			
//		}
		
//		b.getClass().isInstance(a);
		
	}
	
	public void test(List<? super Number> list) {
		list.add(new Double(1));
	}

}


class A implements Serializable {

	private static final long serialVersionUID = 1L;
	public static Integer i;
	private transient String str;
	private B b;
	
	public A() {
		
	}
	
	public B getB() {
		return this.b;
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

	private void writeObject(ObjectOutputStream oos) throws Exception 
    { 
        // to perform default serialization of Account object. 
        oos.defaultWriteObject(); 
        System.out.println("=============== in write object");
        // epwd (encrypted password) 
//        String epwd = "123" + pwd; 
  
        // writing encrypted password to the file 
//        oos.writeObject(epwd); 
    } 
  
    // this method is executed by jvm when readObject() on 
    // Account object reference in main method is executed by jvm. 
    private void readObject(ObjectInputStream ois) throws Exception 
    { 
        // performing default deserialization of Account object 
        ois.defaultReadObject(); 
        System.out.println("============ in read object");
        // deserializing the encrypted password from the file 
//        String epwd = (String)ois.readObject(); 
  
        // decrypting it and saving it to the original password 
        // string starting from 3rd  index till the last index 
//        pwd = epwd.substring(3); 
    } 
	
}

class B implements Serializable {
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