package multithreading.different;

import java.lang.Thread.State;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.SliderUI;

public class DemoTest2 {

	public static void main(String[] args) {
		// Thread t = new Thread( () -> {
		// try {
		// TimeUnit.SECONDS.sleep(5);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// System.out.println("Hello from another Thread");
		//
		// } );
		//// t.setDaemon(true);
		// t.setPriority(Thread.NORM_PRIORITY);
		// t.yield();
		// t.start();
		// System.out.println("This thread is finished == thread name = " +
		// Thread.currentThread().getName());

		// System.out.println();
		//
		// ExecutorService es = Executors.newSingleThreadExecutor();
		// Future<List<String>> future = es.submit(new B());
		//
		// Thread t3 = new CustomThread();
		// t3.start();
		//

		Thread t4 = new Thread(() -> {
			System.out.println("Going to sleep");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		t4.start();
		try {
			t4.join();
		} catch (InterruptedException e) {
			
		}

		System.out.println("after");

	}

}

class B implements Callable<List<String>> {

	@Override
	public List<String> call() throws Exception {
		System.out.println("In CALL");
		System.out.println(Thread.currentThread().getName());
		return null;
	}

}

class A implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

class CustomThread extends Thread {

	@Override
	public void run() {

	}
}
