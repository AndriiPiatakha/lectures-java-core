package patterns.chainpatterns.chain;

import java.util.Scanner;

public class ATMDispenseChain2 {

	private final DispenseChain dispenseChain;

	public ATMDispenseChain2() {
		// initialize the chain
		this.dispenseChain = new ConcreteDespenser(50);
		final DispenseChain dispenseChain2 = new ConcreteDespenser(20);
		final DispenseChain dispenseChain3 = new ConcreteDespenser(10);

		// set the chain of responsibility
		dispenseChain.setNextChain(dispenseChain2);
		dispenseChain2.setNextChain(dispenseChain3);
	}

	public static void main(final String[] args) {
		final ATMDispenseChain2 atmDispenser = new ATMDispenseChain2();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			final Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atmDispenser.dispenseChain.dispense(new Currency(amount));
		}
	}
}