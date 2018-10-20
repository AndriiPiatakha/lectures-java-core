package multithreading.different;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.stream.IntStream;


public class Semaphore2 {

    private static Semaphore semaphore = new Semaphore(5);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        IntStream.range(0, 10)
                .forEach(i -> executor.submit(Semaphore2::doWork));
        TimeUnit.SECONDS.sleep(5);
        executor.submit(Semaphore2::doWork);
        TestDemo.stop(executor);
    }

    private static void doWork() {
        boolean permit = false;
        try {
//        	semaphore.acquire();
            permit = semaphore.tryAcquire(1, TimeUnit.SECONDS);
            if (permit) {
                System.out.println("Semaphore acquired");
                TestDemo.sleep(5);
            } else {
                System.out.println("Could not acquire semaphore");
            }
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } finally {
            if (permit) {
                semaphore.release();
            }
        }
    }

}
