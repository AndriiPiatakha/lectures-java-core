package labs.practice3;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Finds the longest and the shortest word in the input text.
 * 
 * Contains only one method which uses regular expression to split 
 * text to the words.
 * 
 * @author Andrey Pyatakha
 *
 */

public class Part2 {
	

	/**
	 * Finds the longest and the shortest word in the input text.
	 * 
	 * Method splits text with whitespace, numbers and punctuation marks.
	 * Creates object of TreeMap and store there entries where key is 
	 * word length and the value is words of this length.
	 * 
	 * Beforehand putting entry to the map method checks if 
	 * entry with the same key is exists. If it already exists method
	 * extracts the value and concatenates values.
	 * 
	 * Due to interface SortedMap method extracts first key which is
	 * supposed to be the shortest words in text and the last key which is
	 * supposed to be the longest words in text.
	 * 
	 * @param str is a text to find the shortest and the longest words
	 *        in it.
	 */
	
	public static void findAndPrintTheSortestAndLongest(String str) {
		SortedMap<Integer, String> map = new TreeMap<>();
		String[] words = str.split("[\\s\\p{P}\\d\\+]+");
		for (String string : words) {
			if (map.get(string.length()) == null) {
				map.put(string.length(), string);
			} else {
				String result = map.get(string.length());
				if (!result.contains(string)) {
					result = result + ", " + string;
				}
				map.put(string.length(), result);
			}
		}
		
		System.out.println(map.get(map.firstKey()));
		System.out.println(map.get(map.lastKey()));
		
	}



}

