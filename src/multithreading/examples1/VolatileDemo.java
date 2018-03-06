package multithreading.examples1;

public class VolatileDemo {

	private static int MY_INT = 0;

	public static void main(String[] args) {
		new ChangeListener().start();
		new ChangeMaker().start();
	}

	static class ChangeListener extends Thread {
		@Override
		public void run() {
			int local_value = MY_INT;
			System.out.println("LOCAL VALUE " + local_value);
			while (local_value < 5) {
				
				if (local_value != MY_INT) {
					System.out.println("Got Change for MY_INT : " + MY_INT);
					local_value = MY_INT;
				}
			}
		}
	}

	static class ChangeMaker extends Thread {
		@Override
		public void run() {

			int local_value = MY_INT;
			while (MY_INT < 5) {
				System.out.println("Incrementing MY_INT to " + (local_value + 1));
				MY_INT = ++local_value;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}