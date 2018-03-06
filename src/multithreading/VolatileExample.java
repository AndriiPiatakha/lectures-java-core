package multithreading;


public class VolatileExample {

    private static int MY_INT = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
    	
    	int local_value = MY_INT; //copied to stack
    	
        @Override
        public void run() {
            
            while ( local_value < 5 ) 
            {
//            	System.out.println("local_value -> " + local_value);
//            	System.out.println("MY_INT -> " + MY_INT);
//            	
            	try {
                    Thread.sleep(50);
                } catch (InterruptedException e) { e.printStackTrace(); }
            	
            	if( local_value != MY_INT) {  
                    System.out.println("Got Change for MY_INT : " + MY_INT);
                    local_value = MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override
        public void run() {
            while (MY_INT < 5) {
            	
                System.out.println("Incrementing MY_INT to " + (MY_INT + 1));
                
                MY_INT = MY_INT + 1;
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}