package patterns.chainpatterns.chain;

import java.util.Scanner;

public class ATMDispenseChain {

	private final DispenseChain dispenseChain;

	public ATMDispenseChain() {
		// initialize the chain
		this.dispenseChain = new Dollar50Dispenser();
		final DispenseChain dispenseChain2 = new Dollar20Dispenser();
		final DispenseChain dispenseChain3 = new Dollar10Dispenser();

		// set the chain of responsibility
		dispenseChain.setNextChain(dispenseChain2);
		dispenseChain2.setNextChain(dispenseChain3);

	}

	public static void main(final String[] args) {
		final ATMDispenseChain atmDispenser = new ATMDispenseChain();
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
