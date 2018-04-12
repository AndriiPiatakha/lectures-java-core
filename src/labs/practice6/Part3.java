package labs.practice6;

import labs.practice6.Parking.Car;

/**
 * Demo class of Part3.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Part3 {
	
	/**
	 * Enter point to the Part3.
	 * 
	 * Creates parking.
	 * 
	 * Then parks autos to the spots and takes them away.
	 * Periodically prints the state of the parking 
	 * to the console.
	 * 
	 * @param args input parameters.
	 */
	public static void main(String[] args) {
		Parking parking = new Parking(10);
		
		parking.parkAuto(new Car(), 2);
		System.out.println(parking);
		
		parking.parkAuto(new Car(), 2);
		parking.parkAuto(new Car(), 2);
		parking.parkAuto(new Car(), 2);
		
		System.out.println(parking);
		
		parking.deparkAuto(3);
		parking.deparkAuto(4);
		
		System.out.println(parking);
		
		parking.parkAuto(new Car(), 3);
		parking.parkAuto(new Car(), 3);
		parking.parkAuto(new Car(), 3);
		parking.parkAuto(new Car(), 3);
		parking.parkAuto(new Car(), 3);
		parking.parkAuto(new Car(), 3);
		parking.parkAuto(new Car(), 3);
		
		System.out.println(parking);
	}

}
