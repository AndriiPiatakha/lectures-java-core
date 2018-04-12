package labs.practice3;

/**
 * Turns every first letter in each word to capital.
 * 
 * Contains only one static method which provide main functionality.
 * 
 * @author Andrey Pyatakha
 *
 */

public class Part3 {
	
	
	/**
	 * Turns first letter in each word to capital.
	 * 
	 * At first method turns input text to chat array. 
	 * After it runs through it and when it faces to the first letter
	 * it turns is to capital. 
	 * 
	 * @param string with text.
	 * @return string of formated text.
	 */
	public static String firstCharToTitleCase(String string) {
		  char[] chars = string.toLowerCase().toCharArray();
		  boolean found = false;
		  for (int i = 0; i < chars.length; i++) {
		    if (!found && Character.isLetter(chars[i])) {
		      chars[i] = Character.toUpperCase(chars[i]);
		      found = true;
		    } else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') { // Possible to add other chars here
		      found = false;
		    }
		  }
		  return String.valueOf(chars);
		}

}
