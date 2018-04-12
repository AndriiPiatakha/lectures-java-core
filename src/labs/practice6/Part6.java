package labs.practice6;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Analyze text from file and works with it.
 * 
 * Contains enum class of Tasks.
 * With text from file user can do one of the functions
 * provided by enum class of Tasks.
 * 
 * Each entity of enum Tasks should implement one method
 * which contains algorithm of work.
 * 
 * @author Andrey Pyatakha
 *
 */


public class Part6 {

	/**
	 * Contains functionality to work with the text from file.
	 * Each entity of enum Tasks should implement one method
	 * which contains algorithm of work.
	 * 
	 * Contains static entity of StringBuilder which is used
	 * for creating result string.
	 * 
	 * @author Andrey Pyatakha
	 *
	 */
	public enum Tasks {
		
		/**
		 * Entity designed for parsing text and print three most encountered
		 * words in the text.
		 * 
		 * Overrides one abstract method.
		 * 
		 * Uses containers of TreeSet type to sorting values 
		 * in the specified order.
		 * Printing words in the reverse order, sorting by string values 
		 * of Word object.
		 * 
		 */
		FREQUENCY {

			@Override
			public String doTask(String text) {
				List<String> listWords = Part1.getWordListFromText(text);

				// TreeSet for all words with its own Comparator
				TreeSet<Word> treeSetAllWords = 
						new TreeSet<>(new Comparator<Word>() {
					@Override
					public int compare(Word o1, Word o2) {
						int result = o2.getFrequency() - o1.getFrequency();
						if (result == 0) {
							result = o1.getWord().compareTo(o2.getWord());
						}
						return result;
					}
				});

				for (String string : listWords) {
					Word word = 
							new Word(string, Collections.frequency(listWords, string));
					treeSetAllWords.add(word);
				}

				Iterator<Word> iter = treeSetAllWords.iterator();

				Set<Word> treeSetHeadWords = 
						new TreeSet<>(new Comparator<Word>() {
					@Override
					public int compare(Word o1, Word o2) {
						return o2.getWord().compareToIgnoreCase(o1.getWord());
					}
				});

				for (int i = 0; i < HEAD_INDEX; i++) {
					treeSetHeadWords.add(iter.next());
				}

				for (Word word : treeSetHeadWords) {
					sb.append(word).append(" ==> ").append(word.getFrequency());
					sb.append(System.lineSeparator());
				}

				return sb.toString();
			}

		},

		/**
		 * Entity designed for parsing text and print most long
		 * words in the text.
		 * 
		 * Overrides one abstract method.
		 * 
		 * Uses containers of TreeSet type to sorting values 
		 * in the specified order.
		 * Printing words in the reverse order, sorting by amount of letters
		 * in Word object.
		 * 
		 */
		LENGTH {

			@Override
			public String doTask(String text) {
				List<String> listWords = Part1.getWordListFromText(text);

				TreeSet<Word> treeSetAllWords = 
						new TreeSet<>(new Comparator<Word>() {
					@Override
					public int compare(Word o1, Word o2) {
						int result = o2.getWordLength() - o1.getWordLength();
						if (result == 0) {
							result = o1.getWord().compareTo(o2.getWord());
						}
						return result;
					}
				});

				for (String string : listWords) {
					Word word = new Word(string);
					treeSetAllWords.add(word);
				}

				Iterator<Word> iter = treeSetAllWords.iterator();

				for (int i = 0; i < HEAD_INDEX; i++) {
					Word word = iter.next();
					sb.append(word).append(" ==> ")
					  .append(word.getWordLength());
					sb.append(System.lineSeparator());
				}

				return sb.toString();
			}

		},

		/**
		 * Entity designed for parsing text and print few duplicated
		 * words in reverse order in upper case.
		 * 
		 * Overrides one abstract method.
		 * 
		 * Uses containers of TreeSet type to sorting values
		 * in the specified order.
		 * Printing each string in the reverse order.
		 * 
		 */
		DUPLICATES {

			@Override
			public String doTask(String text) {
				List<String> listWords = Part1.getWordListFromText(text);
				Iterator<String> iter = listWords.iterator();
				
				HashMap<String, Integer> mapAllWords = new HashMap<>();
				List<String> listOfDuplicates = new LinkedList<>();
				while (iter.hasNext()) {
					int frequency = 0;
					int amountOfDuplicatesWord = 0;
					String word = iter.next().toLowerCase();
					if (mapAllWords.get(word) == null) {
						mapAllWords.put(word, ++frequency);
					} else {
						frequency = mapAllWords.get(word);
						if (frequency == 1) {
							++amountOfDuplicatesWord;
							listOfDuplicates.add(word);
						}
						mapAllWords.put(word, ++frequency);
					}
					
					if (amountOfDuplicatesWord == HEAD_INDEX) {
						break;
					}	
				}
							
				for (String string : listOfDuplicates) {
					sb.append(new StringBuilder(string)
							.reverse()
							.toString()
							.toUpperCase());
					sb.append(System.lineSeparator());
				}
				
				return sb.toString();
			}

		};

		/**
		 * Amount of elements to print to console.
		 */
		private static final int HEAD_INDEX = 3;
		
		/**
		 * Builder for creating result string for printing to console.
		 */
		private static StringBuilder sb = new StringBuilder();
		
		/**
		 * Do specified task of each object in this Enum.
		 * 
		 * @param text for parsing
		 * @return string result in specified format for printing
		 * 			to console.
		 */
		public abstract String doTask(String text);
	}

	
	/**
	 * Reads text from the text file.
	 * 
	 * Uses windows-1251 encoding for reading the file.
	 * Uses BufferedReader for reading.
	 * Writes text to the StringBuilder.
	 * 
	 * @param filePath path to the file to be read.
	 * @return String value of text from the file.
	 * @throws IOException in case file not found or exception while closing
	 * 			streams.
	 */
	public static String readFrom(String filePath) throws IOException {
		StringBuilder sb = new StringBuilder();
		try (FileInputStream fis = new FileInputStream(new File(filePath));
				InputStreamReader isr = new InputStreamReader(fis, "windows-1251");
				BufferedReader br = new BufferedReader(isr);) {

			String line = "";
			while ((line = br.readLine()) != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				}
			}
		return sb.toString();
	}

	/**
	 * Enter point to the Part6. 
	 * 
	 * Parses command line. And depend on the long or short command
	 * does specified actions. 
	 * 
	 * Then reads text from file and calls one of the Tasks to do
	 * specified task.
	 *  
	 * @param args input parameters.
	 * @throws IOException in case of exceptions in readFrom() method.
	 */
	public static void main(String[] args) throws IOException {
		
		List<String> list = Arrays.asList(args);
		Iterator<String> iter = list.iterator();
		
		String filePath = "";
		String taskString = "";

		while (iter.hasNext()) {
			String word = iter.next();
			if (word.equals("-i") || word.equals("--input")) {
				filePath = iter.next();
			}

			if (word.equals("-t") || word.equals("--task")) {
				taskString = iter.next();
			}
		}

		String text = readFrom(filePath);
		Tasks task = Tasks.valueOf(taskString.toUpperCase());
		String result = task.doTask(text);
		System.out.println(result);

	}

}

