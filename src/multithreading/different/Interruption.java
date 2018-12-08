package multithreading.different;

import java.util.concurrent.TimeUnit;

public class Interruption implements Runnable {
	   public void run() {
	      try {
	         System.out.println("in run() - about to work2()");
	         work2();
	         System.out.println("in run() - back from work2()");
	      } catch (InterruptedException x) {
	         System.out.println("in run() - interrupted in work2()");
	         return;
	      }
	      System.out.println("in run() - doing stuff after nap");
	      System.out.println("in run() - leaving normally");
	   }
	   
	   
	   
	   public void work2() throws InterruptedException {
	      while (true) {
	    	 System.out.println("thread");
	         if (Thread.currentThread().isInterrupted()) {
	            System.out.println("C isInterrupted()="+ Thread.currentThread().isInterrupted());
	            Thread.sleep(2000);
	            System.out.println("D isInterrupted()="+ Thread.currentThread().isInterrupted());
	         }
	      }
	   }
	   
	   
	   public void work() throws InterruptedException {
	      while (true) {
	         for (int i = 0; i < 100000; i++) {
	            int j = i * 2;
	         }
	         System.out.println("A isInterrupted()="+ Thread.currentThread().isInterrupted());
	         if (Thread.interrupted()) {
	            System.out.println("B isInterrupted()="+ Thread.currentThread().isInterrupted());
	            throw new InterruptedException();
	         }
	      }
	   }
	   public static void main(String[] args) {
	      Interruption si = new Interruption();
	      Thread t = new Thread(si);
	      t.start();
	      

	      try {
	         Thread.sleep(2000);
//	         TimeUnit.MILLISECONDS.sleep(1000);
	      } catch (InterruptedException x) { }
			
	      System.out.println("in main() - interrupting other thread");
	      t.interrupt();
	      System.out.println("in main() - leaving");
	   }
	}
