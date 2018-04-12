package labs.practice6;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Class for storage object of parameterized type.
 * 
 * Aggregating TreeSet. Uses delegation calling methods of TreeSet.
 * 
 * Overrides toString() method so that string representation would be as it
 * specified in the task.
 * 
 * @author Andrey Pyatakha
 *
 */
public class WordContainer {

	/**
	 * Aggregating of TreeSet object. This filed is used for delegation.
	 */
	private TreeSet<Word> set = new TreeSet<>();

	/**
	 * Adds the specified element to this set if it is not already present. More
	 * formally, adds the specified element to this set if the set contains no
	 * element such that If this set already contains the element, the call
	 * leaves the set unchanged and returns false.
	 * 
	 * @param object to be added to this set
	 * @return true if added successfully, and false if 
	 * 			current object already exists in the container.
	 */
	public boolean add(Word object) {
		return set.add(object);
	}

	/**
	 * Overrides toString() method so that string representation would be as it
	 * specified in the task.
	 */
	@Override
	public String toString() {
		Iterator<Word> iter = set.iterator();
		StringBuilder sb = new StringBuilder();
		while (iter.hasNext()) {
			Word word = iter.next();
			sb.append(word).append(" : ").append(word.getFrequency());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}
}
