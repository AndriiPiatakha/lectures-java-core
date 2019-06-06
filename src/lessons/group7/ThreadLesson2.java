package lessons.group7;

import java.util.concurrent.TimeUnit;

public class ThreadLesson2 {
	
	private static void printToConsole() {
		while (true) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(ThreadLesson2::printToConsole);
		Thread t2 = new Thread(ThreadLesson2::printToConsole);
		
		t.setDaemon(true);
		t2.setDaemon(true);
		
		t.start();
		t2.start();
		
		TimeUnit.SECONDS.sleep(1);
		Thread.sleep(1000);
		TimeUnit.MILLISECONDS.sleep(1000);
		TimeUnit.DAYS.sleep(1);
		
	}

}
