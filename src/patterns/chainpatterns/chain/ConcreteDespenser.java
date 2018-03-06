package patterns.chainpatterns.chain;

public class ConcreteDespenser implements DispenseChain {

	private DispenseChain nextChain;
	private int currencyValue;
	
	public ConcreteDespenser(int currencyValue) {
		this.currencyValue = currencyValue;
	}
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= currencyValue) {
			int num = cur.getAmount() / currencyValue;
			int remainder = cur.getAmount() % currencyValue;
			System.out.println("Dispensing " + num + " " + currencyValue + "$ note");
			if (remainder != 0)
				this.nextChain.dispense(new Currency(remainder));
		} else {
			this.nextChain.dispense(cur);
		}
	}

}
