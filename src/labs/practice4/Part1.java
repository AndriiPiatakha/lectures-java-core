package labs.practice4;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Used for making all the words of more then 2 characters to upper case.
 * 
 * Contains methods for reading from and writing to the console.
 * Designed to work with cyrillic char encoding.
 * 
 * @author Andrey Pyatakha
 *
 */

public class Part1 {
	
	/**
	 * System independent line separator.
	 */
	public static String newline = System.getProperty("line.separator");

	
	/**
	 * Used for making all the words of more than 3 characters to upper case.
	 * 
	 * Reads the file. After that invokes method prepareBeforeWriteToConsole 
	 * and send text that was read.
	 * 
	 * Method designed to work with cyrillic encoding.
	 * 
	 * @param path to the file to read.
	 * @return string that contains text from file.
	 * @throws IOException in case file not found, or while reading from file, 
	 * 				or while closing the file.
	 */
	public static String readFromFileAndWriteToConsole(String path) throws IOException {
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
		
		prepareBeforeWriteToConsole(sb.toString());
		return sb.toString();
		
	}
	
	
	
	/**
	 * Prepare text before writing to console.
	 * 
	 * Change every letters in words which have more then 3 letters to capitals.
	 * Uses regular expression to find words with more than 3 letters in text.
	 * 
	 * After words was founded, this method replaces old these words to words
	 * with all capitals letters.
	 * 
	 * Invokes writeToConsole(String text) method and passes to it text string.
	 * 
	 * @param text
	 * @return string which contains result of changing words with more than 3 letters
	 * 			to all capitals.
	 * @throws IOException in case some exception while invocation of 
	 * 			writeToConsole(String text) method.
	 */
	
	public static String prepareBeforeWriteToConsole(String text) throws IOException {
		Pattern p = Pattern.compile("[\\p{L}\\p{Nd}_-]{4,}");
		Matcher m = p.matcher(text);
			while (m.find()) {
				String temp = m.group();
				text = text.replace(temp, temp.toUpperCase());	
			}	
		writeToConsole(text);
		return text;
	}	
	
	
	/**
	 * Prints prepared text to console.
	 * 
	 * Designed to work with cyrillic chars and uses cp1251 encoding.
	 * 
	 * @param text
	 * @throws IOException in case exception while printing.
	 */
	
	public static void writeToConsole(String text) throws IOException {
		OutputStreamWriter ouw = new OutputStreamWriter(System.out, "cp1251");
		PrintWriter out = new PrintWriter(ouw, true);
		out.print(text);
		out.flush();
			
	}
	
	/**
	 * Enter point to the Part1
	 * 
	 * @param args
	 * @throws IOException in case of exceptions in the the methods 
	 * 						which are invoked here.
	 */
	
	public static void main(String[] args) throws IOException {
		readFromFileAndWriteToConsole("text01_in.txt");
	}

}
