package labs.practice3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/**
 * Provides method for formatting specified text.
 * 
 * There are few format templates which specified in the task for Practice3.
 * All methods may work separately and don't depend on each other.
 * 
 * @author Andrey Pyatakha
 *
 */

public class Part1 {
	
	/**
	 * Converts input string to the specified pattern in subtask 1.1.
	 * 
	 * At first all the lines are split by new line.
	 * After method formats each line to specified template.
	 * 
	 * @param input text
	 * @return string, result of formatting.
	 */
	
	public static String convert1(String input) {
		StringBuilder sb = new StringBuilder();
		String[] lines = input.split("\\n");
		for (int i = 1; i < lines.length; i++) {
			String[] wordsInLine = lines[i].split(";");
			sb.append(wordsInLine[0] + " ==> " + wordsInLine[2] + "\n");
		}
		return sb.toString();
	
	}
	
	/**
	 * Converts input string to the specified pattern in subtask 1.2.
	 * 
	 * At first all the lines are split by new line.
	 * After method formats each line to specified template.
	 * 
	 * @param input text
	 * @return string, result of formatting.
	 */
	public static String convert2(String input) {
		StringBuilder sb = new StringBuilder();
		String[] lines = input.split("\\n");
		for (int i = 1; i < lines.length; i++) {
			String[] wordsInLine = lines[i].split(";");
			sb.append(wordsInLine[1] + " (email: " + wordsInLine[2] + ")\n");
		}
		return sb.toString();
	
	}
	
	
	/**
	 * Converts input string to the specified pattern in subtask 1.3.
	 * 
	 * At first all the lines are split by new line.
	 * After method formats each line to specified template.
	 * 
	 * Method creates HashMap object to store key (domains) and values (users logins).
	 * 
	 * In each line, in each third element which is supposed to be email method
	 * extracts substring from the symbol "@".
	 * 
	 * Before put key and value to the map it checks if it already has the same key.
	 * In case the entry with specified key already exists it extracts value
	 * and concatenates old value with new one.
	 * 
	 * @param input text
	 * @return string, result of formatting.
	 */
	public static String convert3(String input) {
		Map<String, String> map = new HashMap<>();
		
		StringBuilder sb = new StringBuilder();
		String[] lines = input.split("\\n");
		for (int i = 1; i < lines.length; i++) {
			String[] wordsInLine = lines[i].split(";");
			
			// split emails on domens
			String domen = wordsInLine[2].substring(wordsInLine[2].indexOf('@') + 1);
			
			// Can be used for validation of emails
//			Pattern p = Pattern.compile("((\\w)+(\\.+\\w{2,4}){1,3})|(([0-2]\\d{2}\\.){3}\\d{3})");
//			Matcher m = p.matcher(wordsInLine[2]);
//			String domen = "";
//			if (m.find()) {
//				domen = m.group();
//			}

			// check if key exist
			if (map.get(domen) == null) {
				map.put(domen, wordsInLine[0]);
			} else {
				String loginsByKey = map.get(domen) + ", " + wordsInLine[0];
				map.put(domen, loginsByKey);
			}
	
		}
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			sb.append(entry.getKey() + " ==> " + entry.getValue() + "\n");
		}
		
		return sb.toString();
	
	}
	
	
	
	/**
	 * Converts input string to the specified pattern in subtask 1.4.
	 * 
	 * This methods adds additional word "Password in the first line.
	 * And random number value in each row except first.
	 * 
	 * Range of random number is from 1000 to 9999.
	 * 
	 * @param input text
	 * @return string, result of formatting.
	 */
	
	public static String convert4(String input) {
		StringBuilder sb = new StringBuilder();
		String[] lines = input.split("\\n");
		for (int i = 0; i < lines.length; i++) {
			if(i == 0) {
				sb.append(lines[i] + ";" + "Password\n");
				continue;
			}
			
			int randomNumber = (int)(Math.random()*8999) + 1000;
			sb.append(lines[i] + ";" + randomNumber + "\n");
		}
		return sb.toString();
	
	}
	
	

}
