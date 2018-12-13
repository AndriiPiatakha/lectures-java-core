package lessons.group2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import com.sun.org.apache.bcel.internal.classfile.Field;

public class Lesson8_2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		String[] arr = new String[10];
		addToDisk(arr, "", "", "");
		
		Sweet[] sweets = new Sweet[10];
		
		
		
		Sweet sweet1 = new ChocoCandy(1, 2, "");
		Sweet sweet2 = new ChocoCandy(1, 2, "");
		Sweet[] sweets2 = {sweet1, sweet2};
		Gift gift = new Gift(sweets2);
		
		Sweet clone = (Sweet)sweet1.clone();
		System.out.println(sweet1 instanceof ChocoCandy);
		File f = new File("");
		
		
//		Files.write(Paths.get(""), "".getBytes());
		
//		try {
//			Files.write(Paths.get(""), "".getBytes());
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
		
		try {
			doSmth();
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println();
		}
		
		
	}
	
	public static void doSmth() throws IOException {
		Files.write(Paths.get(""), "".getBytes());
	}

	protected static String[] addToDisk(String[] arr, String... mass) {
		for (int i = 0; i < mass.length; i++)
			arr[i] = mass[i];
		return arr;
	}

	 protected Music[] sortByGenre(Music[] arr) {
		 Arrays.sort(arr, (music1, music2) -> {
			 return music1.getGenre().compareTo(music2.getGenre());
		 });
		 return arr;
	 }

}

class Music {
	public String getGenre() {
		return "";
	}
}

class Sweet implements Cloneable {
	public int getWeight() {
		return 1;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class ChocoCandy extends Sweet {
	private int i;
	public ChocoCandy(int i, int i2, String s) {
		this.i = i;
	}
}

class Gift {
	private Sweet[] sweets;
	
	public Gift(Sweet[] sweets) {
		this.sweets = sweets;
	}
	
	public int getGiftWeight() {
		return Arrays.stream(this.sweets)
				.mapToInt(sweet -> sweet.getWeight())
				.sum();
	}
}

interface Somei10 {
	default void doSmth() {
		
	}
}