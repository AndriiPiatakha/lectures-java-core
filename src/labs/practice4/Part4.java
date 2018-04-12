package labs.practice4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * This class analyzes text file and returns sentences from file.
 * 
 * Class implements interface Iterable so that is possible to get 
 * iterator object and iterates trough the text that was read with 
 * iterator.next() method.
 * 
 * Class uses regular expressions to extract sentences from the text file.
 * 
 * Contains static methods for reading and disassemble text files.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Part4 implements Iterable {
	
	/**
	 * System independent object of new line.
	 */
	private static String newline = System.getProperty("line.separator");
	
	/**
	 * Pattern for extracting of sentences from the text.
	 */
	private static Pattern pSentence;
	
	/**
	 * Matcher reference for finding matches in the text.
	 */
	private static Matcher matcher;
	
	/**
	 * Filed where text will be stored. 
	 */
	private static String text = "";
	
	
	/**
	 * Getter for matcher field.
	 * 
	 * @return matcher.
	 */
	public static Matcher getMatcher() {
		return matcher;
	}
	
	/**
	 * Reads text from file.
	 * 
	 * Uses InputStreamReader with encoding windows-1251 which in turn
	 * allows to read file with cyrillic chars from text.
	 * 
	 *  After the file will have been read, this method invokes
	 *  createPatternAndMatcherForSentencesExtract() method and passes the text as
	 *  a parameter.
	 * 
	 * @param path to the file that should be read.
	 * @return String object which contains text from the file.
	 * @throws IOException in case file not found.
	 */

	public static String readFromFile(final String path) throws IOException {
		StringBuilder sb = new StringBuilder();

		FileInputStream fis = new FileInputStream(new File(path));
		InputStreamReader isr = new InputStreamReader(fis, "windows-1251");
		BufferedReader br = new BufferedReader(isr); 

		String line = "";
		int lineNumber = 1;
		while ((line = br.readLine()) != null) {
			if (lineNumber != 1) {
				sb.append(newline);
			}
			sb.append(line);
			lineNumber++;
			}

		
		br.close();
		text = sb.toString();
		createPatternAndMatcherForSentencesExtract(text);
		return text;
	}
	
	/**
	 * Creates pattern and matcher objects.
	 * 
	 * Pattern and matcher objects are intended to 
	 * extract sentences from the text.
	 * 
	 * Takes string object as an argument. 
	 * Uses regular expression for creating matcher for text.
	 * 
	 * @param text
	 */

	public static void createPatternAndMatcherForSentencesExtract(String text) {
		pSentence = Pattern
			.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)");
		matcher = pSentence.matcher(text);

	}

	@Override
	public Iterator iterator() {
		return new IteratorImpl();
	}

	/**
	 * This implementation returns a straightforward implementation of the
     * Iterator interface.
     *
     * Note that the iterator returned by this implementation will
     * throw an {@link UnsupportedOperationException} in response to its
     * {@code remove} methods unless the method is overridden.
     *
     * This implementation can be made to throw runtime exceptions 
     * (java.lang.IllegalStateException) in case if there no match found. 
     *
     * @throws IndexOutOfBoundsException
     * @throws IllegalStateException

	 * 
	 */
	  
	
	public class IteratorImpl implements Iterator {
		
		/**
		 * If flag false that means matcher.find() didn't ready 
		 * for next matcher.group().
		 * If flag true that means matcher.find() ready to extract 
		 * next matcher.group().
		 */
		private boolean flag;
		private boolean isHasNext;
		

		
		/**
	     * Returns {@code true} if the iteration has more elements.
	     * (In other words, returns {@code true} if {@link #next} would
	     * return an element rather than throwing an exception.)
	     *
	     * @return {@code true} if the iteration has more elements
	     */
        
		
		@Override
		public boolean hasNext() {
			if (!flag) {
				flag = true;
				isHasNext = matcher.find();
			} 
			return isHasNext;
		}
			
		
		/**
	     * Returns the next element in the iteration.
	     *
	     * @return the next element in the iteration
	     * @throws IllegalStateException if the iteration has no more elements.
	     */
        
        
		@Override
		public Object next() {
			if (!flag) {
				isHasNext = hasNext();
				
			}
        	if (isHasNext) {
        		flag = false;
        		return matcher.group();
        	} else {
              throw new NoSuchElementException();
          }
	}


		/**
		 * The default implementation throws an instance of
	     * {@link UnsupportedOperationException} and performs no other action.
	     *
	     * @throws UnsupportedOperationException if the {@code remove}
	     *         operation is not supported by this iterator
	     */
		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}
	
	/**
	 * Enter point to the Part4. 
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		readFromFile("text04.txt");
		
		Part4 obj = new Part4();
		Iterator iter = obj.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}	
		
		
		
	}

}
