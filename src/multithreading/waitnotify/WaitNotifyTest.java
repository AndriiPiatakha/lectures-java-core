package multithreading.waitnotify;

public class WaitNotifyTest {

    public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"READER 1").start();
        
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "READER 2").start();
        
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "NOTIFIER").start();
        System.out.println("All the threads are started");
    }

}
