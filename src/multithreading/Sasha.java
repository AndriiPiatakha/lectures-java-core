package multithreading;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.sun.corba.se.spi.ior.iiop.GIOPVersion;

public class Sasha {
	public int[] giveMeRandomNumbers() {

		int[] mass = new int[10];
		for (int i = 0; i < 10; i++) {
			mass[i] = (int) (Math.random() * 2000);
		}
		Arrays.sort(mass);
		return mass;
	}

	public String[] giveMeRandomStrings() {

		String[] stringArr = new String[10];

		for (int i = 0; i < 10; i++) {
			String symbol = Character.toString((char) (Math.random() * 100)) + i;
			stringArr[i] = symbol;
		}

		return stringArr;
	}

	public static void main(String[] args) throws InterruptedException {

		SomeThread someThread = new SomeThread();

		someThread.start();

		// TimeUnit.SECONDS.sleep(5);

		new Scanner(System.in).nextLine();
		someThread.interrupt();
		System.out.println(Thread.currentThread().getName() + " ended its work");

	}

}

class SomeThread extends Thread {

	Sasha spam = new Sasha();

	int[] timeArr = spam.giveMeRandomNumbers();
	String[] stringArr = spam.giveMeRandomStrings();

	@Override
	public void run() {
		try {
			int i = 0;

			while (true) {

				Thread.sleep(timeArr[i]);
				System.out.println(this.getName() + " message: " + stringArr[i]);
				i++;
				if (i == 9) {
					i = 0;
				}

			}

		} catch (InterruptedException e) {
			System.out.println(this.getName() + " ended its work");

		}

	}

}

