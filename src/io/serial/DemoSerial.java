package io.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DemoSerial {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SomeClass objectToWrite = new SomeClass(1, "test");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial"))) {
			oos.writeObject(objectToWrite);
			System.out.println(objectToWrite);
		}
		Object readedObject;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial"))) {
			readedObject = ois.readObject();
			if (readedObject instanceof SomeClass) {
				readedObject = (SomeClass) readedObject;
			}
			System.out.println(readedObject);
		}
		
		System.out.println(objectToWrite == readedObject);
		
	}

}

class SomeClass implements Serializable {
	private static final long serialVersionUID = 1L;
	int i;
	String s;
	
	public SomeClass() {
	}
	
	public SomeClass(int i, String s) {
		this.i = i;
		this.s = s;
	}

	@Override
	public String toString() {
		return "SomeClass [i=" + i + ", s=" + s + "]";
	}
	
	
}

