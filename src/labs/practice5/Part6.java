package labs.practice5;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Creates threads which simultaneously writes to the one file.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Part6 {
	
	/**
	 * RandomAccessFile for writing.
	 */
	static RandomAccessFile raf;
	
	/**
	 * Number of Threads.
	 */
	public static final int THREADS_NUMBER = 10;
	
	/**
	 * How much each thread should write to the 
	 * file its own name.
	 */
	public static final int COLUMNS = 20;
	
	/**
	 * Line separator length.
	 */
	public static final int EOL_LENGTH = System.lineSeparator().length();
	
	/**
	 * Enter point to the Part6.
	 * 
	 * @param args input arguments.
	 * @throws IOException in case of exception while closing
	 * 			RandomAccessFile.
	 */
	public static void main(String[] args) throws IOException {
		raf = new RandomAccessFile("part6.txt", "rw");
		
		ExecutorService es = Executors.newCachedThreadPool();
		for (int i = 0; i < THREADS_NUMBER; i++) {
			es.execute(new Writer(i));
		}
		es.shutdown();
		while (!es.isTerminated()) {
			;
		}
		raf.close();
	}

}
