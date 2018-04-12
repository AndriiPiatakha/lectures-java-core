package labs.practice4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Allows user print specified types from text file.
 * 
 * Provides possibility of reading text files.
 * Contains methods which read and store input strings from console.
 * 
 * Uses regular expressions to find specified types in text.
 * 
 * @author Andrey Pyatakha
 *
 */

public class Part3 {
	
	/**
	 * Pattern for extracting string type objects from text.
	 */
	private static Pattern patternString = Pattern.compile("[\\p{L}_-]{2,}");
	
	/**
	 * Pattern for extracting int type objects from text.
	 */
	private static Pattern patternNumbersInt = 
			Pattern.compile("(?<!\\.)(?<!\\d)\\d+(?!\\.)(?!\\d)");
	
	/**
	 * Pattern for extracting float-point numbers from text.
	 */
	private static Pattern patternNumbersFloat = 
			Pattern.compile("(\\d+\\.{1}\\d+)|((?<!\\d)(?<!\\.)[\\.]{1}\\d+)");
	
	/**
	 * Pattern for extracting char type objects from text.
	 * 
	 * Char specified in task like letter of each alphabet.
	 */
	private static Pattern patternChars = Pattern.compile("[\\p{L}]");
	
	/**
	 * Reads an input from console.
	 * 
	 * Input format: one type in one line.
	 * 
	 * Values that was inputed are stored in fields of this object.
	 * To stop typing words need to type word "stop".
	 * 
	 * Invokes readBaseText() method and passed to it string pathToTextFile
	 * as a parameter.
	 * 
	 * Invokes textScan() method and passed to it list of types to choose and
	 * text.
	 * 
	 * @param pathToTextFile
	 * @return list which contains types which was typed by user to the console
	 * @throws IOException in case if file not found
	 */
	public static List<String> 
			readTypesFromConsoleAndPrintTypesFromText(String pathToTextFile) throws IOException {
		List<String> listOfTypes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert types. Just one type in line. " +
				 "After each typing press Enter. " +
				 "To finish spell word \"STOP\" and press Enter");
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s.equalsIgnoreCase("stop")) {
				break;
				}
			listOfTypes.add(s);
		}
		sc.close();
		
		String text = readBaseText(pathToTextFile);
		textScan(listOfTypes, text);
		
		return listOfTypes;
	}
	
	/**
	 * Reads a text from a text file.
	 * 
	 * Reads line by line and uses StringBuilder object.
	 * Uses windows-1251 encoding to read cyrillic chars correctly.
	 * 
	 * Returns string of text from the file.
	 * 
	 * @param path
	 * @return string which contains text from the file.
	 * @throws IOException in case if file not found
	 */
	public static String readBaseText(String path) throws IOException {
		StringBuilder sb = new StringBuilder();
		FileInputStream fis = new FileInputStream(new File(path));
		InputStreamReader isr = new InputStreamReader(fis, "windows-1251");
		BufferedReader br = new BufferedReader(isr);

		String line = "";
		while ((line = br.readLine()) != null) {
			sb.append(line);
			sb.append(System.getProperty("line.separator"));
			}
		br.close();
		return sb.toString();
	}
	
	/**
	 * Scans the text for the presence of specified types.
	 * 
	 * Creates matcher object of the specified pattern depends on the type .
	 * After matcher was created, it starts find matches in the text and 
	 * prints to console every match.
	 * 
	 * If there are no such type as user typed to console before, the default
	 * message arises.
	 * 
	 * @param types list of types that were inserted by user to console.
	 * @param text
	 */
	public static void textScan(List<String> types, String text) {
		
		Matcher m = null;
		for (String type : types) {
			switch (type.toLowerCase()) {
			case "string":
				System.out.println("All of string type: ");
				m = patternString.matcher(text);
				while (m.find()) {
					System.out.println(m.group());
				}
				break;
			case "char":
				System.out.println("All of char type: ");
				m = patternChars.matcher(text);
				while (m.find()) {
					System.out.println(m.group());
				}
			
				break;
			case "int":
				System.out.println("All of int type: ");
				m = patternNumbersInt.matcher(text);
				while (m.find()) {
					System.out.println(m.group());
				}
				break;
			case "double":
				System.out.println("All of double type: ");
				m = patternNumbersFloat.matcher(text);
				while (m.find()) {
					System.out.println(m.group());
				}
				break;
			default:
				System.out.println("NO SUCH TYPE WAS FOUND IN TEXT");
				break;
			}	
		}
	}
	
	/**
	 * Enter point to the Part5.
	 * 
	 * @param args
	 * @throws IOException in case file not found.
	 */
	
	public static void main(String[] args) throws IOException {
		readTypesFromConsoleAndPrintTypesFromText("task03_in.txt");
	}
		

}
