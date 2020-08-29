package lessons.group11.presenthw;

import java.util.Arrays;
import java.util.Objects;

public class Gift {
	
	private static final int DEFAULT_GIFT_CAPACITY = 10;
	private double weight;
	private Sweet[] sweets;
	
	private int lastIndexAdded;
	
	public void addSweet(Sweet sweet) {
		if (sweet == null) {
			return;
		}
		if (sweets == null) {
			sweets = new Sweet[DEFAULT_GIFT_CAPACITY];
		}
		if (sweets.length < lastIndexAdded + 1) {
			sweets = Arrays.copyOf(sweets, sweets.length * 2);
		}
		sweets[lastIndexAdded++] = sweet;
	}
	
	public double calculateWeight() {
//		double sumWeight = 0;
//		for (Sweet sweet : sweets) {
//			sumWeight += sweet.getWeight();
//		}
//		return sumWeight;
		
		return Arrays.stream(sweets)
					.mapToDouble(sweet -> sweet.getWeight())
					.sum();
	}
	
	public Sweet[] filterSweetsBySugar(double minSugarWeight, double maxSugarWeight) {
		return Arrays.stream(sweets)
					.filter(Objects::nonNull)
					.filter( (sweet) -> {
						if (sweet.getSugarWeight() >= minSugarWeight && 
								sweet.getSugarWeight() <= maxSugarWeight) {
							return true;
						} else {
							return false;
						}
					})
					.toArray(Sweet[]::new);
	}

}
