package multithreading.examples1;

class ExampleThread extends Thread {
	private int testValue;

	public ExampleThread(String str) {
		super(str);
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println(getName() + " : " + i);
				if (getName().equals("Thread 1")) {
					testValue = 10;
					System.out.println(testValue);
				}
				if (getName().equals("Thread 2")) {
					System.out.println("Test Value : " + testValue);
				}
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}
	}
}

public class VolatileExample {
	public static void main(String args[]) {
		new ExampleThread("Thread 1").start();
		new ExampleThread("Thread 2").start();
	}
}