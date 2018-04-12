package labs.practice6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Reads string from console and sorted words by their frequency of occurrence.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Part1 {


	/**
	 * Container that storage Word types and sort them
	 * in the specified order.
	 */
	private static WordContainer wordContainer = new WordContainer();
	
	/**
	 * Stores the default System.in.
	 */
	private static final InputStream DEFAULT_SYSTEM_IN = System.in;

	/**
	 * Adds objects of Word type to the container from the List
	 * of Strings.
	 * 
	 * At first finds only unique strings in List.
	 * For this purpose Set container is created. 
	 * 
	 * After in foreach loop creates objects of Word type 
	 * finding the frequency of occurrence in the text.
	 * 
	 * @param list of String objects from the text.
	 */
	public static void fillContainer(List<String> list) {
		Set<String> uniqueWords = new HashSet<>(list);
		for (String string : uniqueWords) {
			Word word = new Word(string, Collections.frequency(list, string));
			wordContainer.add(word);
		}
	}

	/**
	 * Returns List object with the words from the input string.
	 * 
	 * Uses regular expression to split string by words.
	 * 
	 * @param text string value
	 * @return List of strings from the specified text.
	 */
	public static List<String> getWordListFromText(String text) {
		String[] wordsArray = text.split("[\\p{P}\\s]+");
		List<String> list = Arrays.asList(wordsArray);
		return list;
	}
	
	/**
	 * Enter point to the Part1.
	 * 
	 * Creates string to parse words.
	 * Reset default System.in stream so that it would be
	 * possible not wait input string from the console.
	 * 
	 * @param args input arguments
	 * @throws IOException in case of exception in InputStream Object.
	 */

	public static void main(String[] args) throws IOException {

		String lineToRead = "asd asdf asd asdf asdf 43 asdsf 43 43 434";
		InputStream is = 
				new ByteArrayInputStream(lineToRead.getBytes("cp1251"));
		System.setIn(is);

		Scanner sc = new Scanner(System.in);
		String inputString = null;
		inputString = sc.nextLine();

		List<String> list = getWordListFromText(inputString);

		fillContainer(list);

		System.out.println(wordContainer);

		System.setIn(DEFAULT_SYSTEM_IN);

		is.close();
		sc.close();

	}

}