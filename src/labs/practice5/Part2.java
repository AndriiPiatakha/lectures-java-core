package labs.practice5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/**
 * Demonstrates work of Spam class.
 * 
 * Create stream and reset System.in to another one stream.
 * 
 * @author Andrey Pyatakha
 *
 */

public class Part2 {
	
	

	/**
	 * Enter point to the Part2.
	 * 
	 * Create stream and reset System.in to another one stream.
	 * Run the main method of Spam2 class.
	 * 
	 * After 5 seconds had passed change input stream and simulates pressing
	 * of enter key.
	 * 
	 * @param args input parameters
	 * @throws IOException in case of Exception in main class
	 * @throws InterruptedException in case of interruption of main thread
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		ByteArrayInputStream bais = new ByteArrayInputStream(new byte[]{'\n'});
        Spam.main(new String[]{});
        TimeUnit.SECONDS.sleep(5);
        System.setIn(bais);
        
	}

}





