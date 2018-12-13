package lessons.allgroups;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Questino {

	public static void main(String[] args) throws InterruptedException {
//		String result = scan();

		long currentTimeMillis = System.nanoTime();
		TimeUnit.MILLISECONDS.sleep(1);
		System.out.println("Time: " + (System.nanoTime() - currentTimeMillis));
	}

	private static String scan() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ввидите свой текст: \n");
		StringBuffer textResult = new StringBuffer();

		while (true) {
			String nextLine = scanner.nextLine();
			if (nextLine.equals("exit"))
				break;
			textResult.append(nextLine).append(System.lineSeparator());
		}

		return textResult.toString();

	}

}
