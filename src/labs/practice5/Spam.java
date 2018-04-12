package labs.practice5;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/**
 * Prints specified messages after specified intervals.
 * 
 * Takes array of int values and array of String values as  a parameters.
 * In case if arrays got different length throws an IllegalArgumentException.
 * 
 * This class extends Thread.
 * It prints to console messages after specified latency.
 * 
 * @author Adnrey Pyatakha
 *
 */

public class Spam extends Thread {
	/**
	 * Array of int values which uses as latency.
	 */
	private int[] latency;
	
	/**
	 * Array of String values which contains elements to print to console.
	 */
	private String[] messages;

	/**
	 * Takes array of int and array of String as parameters.
	 * In case if arrays got different length throws an IllegalArgumentException.
	 * Constructor start new thread.
	 * 
	 * @param latency int values of delays between printing messages.
	 * @param messages String values to print to console.
	 */
	public Spam(int[] latency, String[] messages) {
		if (latency.length != messages.length) {
			throw new IllegalArgumentException(
					"Error! Arrays of latency and messages aren't equal!!!");
		}
		this.latency = latency;
		this.messages = messages;
		start();
	}

	
	/**
	 * Prints to console messages from String array after specified delays.
	 */
	@Override
	public void run() {
		try {
			for (int i = 0; i < messages.length; i++) {
				TimeUnit.MILLISECONDS.sleep(latency[i]);
				System.out.println(messages[i]);
			}
		} catch (InterruptedException ex) {
		}
	}
	
	/**
	 * Listener which observes when code point of "Enter" will be appeared.
	 * Observer for the thread which takes as an argument
	 * in constructor.
	 * 
	 * @author Andrey Pyatakha
	 *
	 */

	static class Listener extends Thread {
		/**
		 * Thread for observing.
		 */
		Thread thread;
		
		/**
		 * InputStream by default.
		 */
		public static final InputStream IN_DEFAULT = System.in; 

		/**
		 * Constructor.
		 * Takes another thread as a parameter.
		 * Set this thread to Daemon, and start it instantly
		 * after creation.
		 * 
		 * @param thread to listen.
		 */
		public Listener(Thread thread) {
			super();
			setDaemon(true);
			this.thread = thread;
			start();
		}

		/**
		 * Reads from the system in and wait for the enter.
		 */
		@Override
		public void run() {
			try {
				while (true) {
					if (System.in.available() > 0 && System.in.read() == '\n') {
						System.setIn(IN_DEFAULT);
						thread.interrupt();
					}
				}
			} catch (IOException e) {
			}
		}
	}

	/**
	 * Enter point to the Spam.
	 * 
	 * Creates array of delays and array of messages and pass to
	 * the Spam object as a parameters.
	 * 
	 * Creates listener to hear the enter value and to interrupt
	 * application.
	 * 
	 * @param args input arguments.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int[] latency = { 1000, 1000, 1000, 1000, 1000, 1000 };
		String[] messages = { "First message", "Second message", "Third message", 
				"Fourth message", "Fifth message", "Sixth message" };
		Thread spam = new Spam(latency, messages);
		Thread listener = new Listener(spam);

	}

}
