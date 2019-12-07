package lessons.group9;

public class MTApp {

	private static int i = 0;
	private static Object dummy = new Object();

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(() -> {
			int i2 = 0;
			while (i2 < 10_000) {
				increment();
				i2++;
			}
		}, "Im thread");

		Thread t2 = new Thread(() -> {
			int i2 = 0;
			while (i2 < 10_000) {
				increment();
				i2++;
			}
		}, "Im thread");

		t.start();
		t2.start();
		System.out.println(Thread.currentThread().getName());
		t.join();
		t2.join();
		System.out.println(i);

	}

//	public synchronized static void increment() {
//		++i;
//	}

	public static void increment() {
		synchronized (dummy) {
			++i;
		}

	}

}
