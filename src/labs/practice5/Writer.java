package labs.practice5;

import java.io.IOException;

/**
 * Writes thread name to the file.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Writer extends Part6 implements Runnable {
	
	/**
	 * Thread ID.
	 */
	private int id;

	/**
	 * Constructor, set ID as a a parameter. 
	 * @param id int value.
	 */
	public Writer(int id) {
		this.id = id;
	}

	/**
	 * Writes thread ID to the file.
	 */
	@Override
	public void run() {
		try {
			writeToFile(findPositionToStart(id), id);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Writes to the file.
	 * 
	 * At first sets the position in the random access file to write.
	 * And then write thread ID specified times.
	 * 
	 * @param pos start position to write.
	 * @param element what exactly should be written.
	 * @throws IOException in case of exception while writing.
	 */
	public static synchronized void writeToFile(long pos, int element) throws IOException {
		raf.seek(pos);
		for (int i = 0; i < COLUMNS; i++) {
			 raf.write(String.valueOf(element).getBytes());
			 }
		raf.write(System.lineSeparator().getBytes());
	}

	/**
	 * Finds position to write in the text file.
	 * 
	 * @param threadNum ID of the thread to find row to write.
	 * @return long value of start index to write.
	 */
	public static long findPositionToStart(int threadNum) {
		return threadNum * (COLUMNS + EOL_LENGTH);
	}

	

}
