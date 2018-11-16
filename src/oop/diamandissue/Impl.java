package oop.diamandissue;

public class Impl implements I1, I2 {
	
	public static void main(String[] args) {
		I2 i2 = new Impl();
		System.out.println(i2.doSmth());
		System.out.println(I1.doSmth());
	}

}
