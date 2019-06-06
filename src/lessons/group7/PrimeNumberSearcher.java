package lessons.group7;

import java.util.List;

public class PrimeNumberSearcher implements Runnable {
	
	private List<Integer> numbersToProceed;
	private List<Integer> primeNumbers;
	private PrimeService primeService;
	
	public PrimeNumberSearcher(List<Integer> numbersToProceed, List<Integer> primeNumbers) {
		this.numbersToProceed = numbersToProceed;
		this.primeNumbers = primeNumbers;
		this.primeService = new PrimeService();
	}

	@Override
	public void run() {
		for (Integer integer : numbersToProceed) {
			if (primeService.isPrime(integer)) {
				primeNumbers.add(integer);
			}
		}
	}
	

}
