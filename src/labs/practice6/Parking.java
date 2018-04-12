package labs.practice6;

import java.util.Arrays;
import java.util.ListIterator;

/**
 * Parking system.
 * 
 * Emulates parking with N spots.
 * When car is coming to the spot it moves to the right
 * and engage first empty spot it meets.
 * 
 *  If there are no free spots there is info message is printing
 *  to console.
 *  
 *  Also there method which print condition of the parking to the
 *  console.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Parking {
	
	/**
	 * Array of cars at the parking.
	 */
	private Car[] spotsArray;
	
	/**
	 * Amount of spots at the parking.
	 */
	private int spotAmount;
	
	/**
	 * Public constructor.
	 * 
	 * Takes int value that means amount of
	 * spots at the parking.
	 * 
	 * @param spotAmount int value.
	 */
	public Parking(int spotAmount) {
		this.spotAmount = spotAmount;
		spotsArray = new Car[spotAmount];
	}
	
	/**
	 * Parks auto to the specified place.
	 * 
	 * Takes car object and index of spot as a parameter.
	 * Indexes of spots at the parking starts
	 * from zero.
	 * 
	 * If the spot is engaged car moves to the right 
	 * while meets empty spot.
	 * 
	 * If there is no empty spot from the right there is
	 * info message printing to the console.
	 * 
	 * @param car to park.
	 * @param indexOfSpot index of spot.
	 */
	public void parkAuto(Car car, int indexOfSpot) {
		if (spotsArray[indexOfSpot] == null) {
			spotsArray[indexOfSpot] = car;
		} else {
			ListIterator<Car> iter = Arrays.asList(spotsArray).listIterator(indexOfSpot-1);
			while (iter.hasNext()) {
				indexOfSpot++;
				iter.next();
				if (indexOfSpot < spotAmount && spotsArray[indexOfSpot] == null) {
					spotsArray[indexOfSpot] = car;
					break;
				} 
				if (indexOfSpot == spotAmount ) {
					System.out.println("There is no empty spot at the moment");
				}
			}	
		}
	}
	
	/**
	 * Takes car away from the parking spot.
	 * 
	 * @param parkSpotIndex from where to remove car.
	 */
	public void deparkAuto(int parkSpotIndex) {
		spotsArray[parkSpotIndex] = null;
	}
	
	/**
	 * Overrides toString method.
	 * 
	 * Printing to the console in specified format 
	 * showing empty and engaged spots.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Car car : spotsArray) {
			if (car == null) {
				sb.append("EMPTY").append(" | ");
			} else {
				sb.append(car).append(" | ");
			}
		}
		return sb.toString();
	}
	
	/**
	 * Sample for the Car objects.
	 * 
	 * Each car has its own id number.
	 * Overrides toString method which prints Car# and
	 * its Id number.
	 * 
	 * @author Andrey Pyatakha
	 *
	 */
	public static class Car {
		
		private static int count = 0;
		private int carId;
		{
			carId = ++count;
		}
		
		@Override
		public String toString() {
			return "Car#" + carId;
		}

	}
	
}
