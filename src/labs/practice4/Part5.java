package labs.practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Class reads the text from console and print text for specified localization.
 * 
 * Contains methods for reading from console and printing results to console.
 * Uses properties file which are ocated in the src folder of this project.
 * 
 * @author Andrey Pyatakha
 *
 */
public class Part5 {
	
	/**
	 * Field for storage keys for messages in properties file.
	 */
	private static List<String> listKeys = new ArrayList<>();
	
	/**
	 * Field for storage locales objects to define correct properties file.
	 */
	private static List<Locale> listLocale = new ArrayList<>();
	

	/**
	 * Reads input from console.
	 * 
	 * Uses object of type Scanner for reading from console.
	 * The format for input is should be: key (whitespace) language.
	 * Incorrect input format may generate Exception.
	 * 
	 * Values that was inputed are stored in fields of this object.
	 * To stop typing words need to type word "stop".
	 * 
	 * Invokes method printResultToConsole.
	 * 
	 * @throws java.util.MissingResourceException in case 
	 *    if invalid input format, or key is absent in properties file.
	 * 
	 */
	public static void readFromConsoleAndPrintResult() {
		Scanner sc = new Scanner(System.in);
		
		String key = "";
		String language = "";
		
		System.out.println("Please, insert key and language. "
				+ "To finish spell \"stop\" and press enter.");
		while (sc.hasNext()) {
		    String s1 = sc.nextLine();
		    if (s1.equalsIgnoreCase("stop")) {
		        break;
		    }
		    String[] arr = s1.split(" ");
		 
		    key = arr[0];
		    language = arr[1];
		    
		    listKeys.add(key);
		    listLocale.add(new Locale(language));
		    
		}
		printResultToConsole(listKeys, listLocale);
		sc.close();
	}
	
	/**
	 * Prints to console messages by their keys and depends on locale.
	 * 
	 * Takes list of keys and list of locale as a parameters. 
	 * Prints message for each key and each locale which was typed 
	 * to the console. 
	 * 
	 * Before printing to console creates the object of ResourceBundle.
	 * 
	 * @param keys container which store key for messages.
	 * @param locales
	 * @throws java.util.MissingResourceException in case
	 * 			 if invalid input format, or key is absent in properties file.
	 */
	
	public static void printResultToConsole(List<String> keys, List<Locale> locales) {
		for (int i = 0; i < locales.size(); i++) {
			ResourceBundle rb = 
					ResourceBundle.getBundle("resources", locales.get(i));
			System.out.println(rb.getString(keys.get(i)));
		}
	}
	
	/**
	 * Enter point to the Part5.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Part5.readFromConsoleAndPrintResult();
	}
	

}
