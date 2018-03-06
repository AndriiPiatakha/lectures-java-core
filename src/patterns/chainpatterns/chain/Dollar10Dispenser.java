package patterns.chainpatterns.chain;

public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		System.out.println("Next chain = " + this.chain);
		if (cur.getAmount() >= 10) {
			int num = cur.getAmount() / 10;
			int remainder = cur.getAmount() % 10;
			System.out.println("Dispensing " + num + " 10$ note");
			if (remainder != 0) {
				this.chain.dispense(new Currency(remainder));
			}
			System.out.println("Exit from last dispenser");	
		} else {
			System.out.println("Why no NPE? 2");
			this.chain.dispense(cur);
		}
	}

}