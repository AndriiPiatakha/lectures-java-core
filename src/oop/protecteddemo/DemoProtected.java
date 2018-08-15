package oop.protecteddemo;

import oop.Yacht;

public class DemoProtected extends Yacht {
	
	public static void main(String[] args) {
		Yacht y = new Yacht();
//		y.i = 1;
	}


}

class SuperYacht extends Yacht {
	
	public SuperYacht(int lenght) {
		this.lenght = lenght;

	}
	
	
}
