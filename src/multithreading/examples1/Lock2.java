package multithreading.examples1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Lock2 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        ReentrantLock lock = new ReentrantLock();

        executor.submit(() -> {
            lock.lock();
//            lock.tryLock()
            try {
                ConcurrentUtils.sleep(1);
            } finally {
                lock.unlock();
            }
        });

        executor.submit(() -> {
        	lock.getHoldCount();
        	lock.getQueueLength();
            System.out.println("Locked: " + lock.isLocked());
            System.out.println("Held by me: " + lock.isHeldByCurrentThread());
            ConcurrentUtils.sleep(2);
            boolean locked = lock.tryLock();
            System.out.println("Lock acquired: " + locked);
        });

        ConcurrentUtils.stop(executor);
    }

}
