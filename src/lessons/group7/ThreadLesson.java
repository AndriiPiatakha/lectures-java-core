package lessons.group7;

import java.util.concurrent.TimeUnit;

public class ThreadLesson {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new ThreadExample());
		t.setDaemon(true);
		t.start();
		
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("Good bye");
	}

}


class ThreadExample implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("Hello");
		}
	}
	
}

