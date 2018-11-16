package oop.cars;

public class Demo {
	
	public static void main(String[] args) {
		Car cabrio = new Cabrio(new DieselEngine());
		Car petrolCabrio = new Cabrio(new PetrolEngine());
		
		Car sedan = new Sedan();
	}

}
