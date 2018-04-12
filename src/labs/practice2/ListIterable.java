package labs.practice2;

/**
 * Implementing this interface allows an object to returns
 * object of ListIterator.
 * 
 * @author Andrey Pyatakha
 *
 */

public interface ListIterable {
	
	/**
	 * Returns object of ListIterator.
	 * 
	 * @return object of ListIterator
	 */
	ListIterator listIterator();
}
