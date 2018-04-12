package labs.practice4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * This class provides possibility to fill , read and sort numbers in file.
 * 
 * Contains of static methods which work with the files and
 * their content.
 * 
 * @author Andrey Pyatakha
 *
 */

public class Part2 {
	
	
	/**
	 * Fills file with ten random numbers from 0 to 50.
	 * 
	 * Input parameter is path to the file which should be filled with numbers.
	 * 
	 * For generating random numbers this method uses object of Random class.
	 * User can set amount of numbers to generate, but the range from 0 to 50
	 * is settled by the task conditions.
	 * 
	 * @param path
	 * @param amountOfNumbers
	 * @throws IOException in case file not found.
	 */

	public static void fillWithRandomNumbers(String path, int amountOfNumbers) 
			throws IOException {
		int n = amountOfNumbers;
		int range = 51;
		File file = new File(path);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream(file))); 
		int number;
		Random random = new Random();
		while (n > 0) {
			number = random.nextInt(range);
			bw.write(number + " ");
			n--;
		}
		
		bw.close();
		
	}
	
	
	/**
	 * Sorts number in file and write sorted numbers to another one.
	 * 
	 * Method takes path to the file with numbers to sort and path to the file
	 * where sorted numbers should be written.
	 * 
	 * Invokes sort() method.
	 * Invokes fillFileWithNumbers() method.
	 * 
	 * @param pathFrom path to the file with numbers to sort.
	 * @param pathTo path to the file where to store sorted numbers.
	 * @throws IOException in case file not found with path provided by
	 * 						reference pathFrom.
	 */
	
	public static void sortNumbersFromFile(String pathFrom, String pathTo) throws IOException {
		File file = new File(pathFrom);
		BufferedReader br = new BufferedReader(new InputStreamReader(
						new FileInputStream(file)));
		String s = br.readLine();
		String[] arrOfNumbersString = s.split(" ");

		int[] arrOnInts = new int[arrOfNumbersString.length];
		for (int i = 0; i < arrOfNumbersString.length; i++) {
			arrOnInts[i] = Integer.parseInt(arrOfNumbersString[i]);
		}
		sort(arrOnInts);
		fillFileWithNumbers(pathTo, arrOnInts);
		
		br.close();

	}
	
	/**
	 * Provides bubble sort for arrays of type int.
	 * 
	 * @param int[] array to sort.
	 */
	
	
	private static void sort(int[] arrOnInts) {
		for (int i = arrOnInts.length - 1; i >=0; i--) {
			for (int j = 0; j < i; j++) {
				if (arrOnInts[i] < arrOnInts[j]) {
					int temp = arrOnInts[i];
					arrOnInts[i] = arrOnInts[j];
					arrOnInts[j] = temp;
				}
			}
		}
		
	}
	

	
	/**
	 * Fills sorted numbers to the file.
	 * 
	 * Writes each number followed by the whitespace.
	 * 
	 * @param path to the files where sorted numbers should be written.
	 * @param arrOnInts array of sorted numbers.
	 * @throws IOException in case of exception while write() method.
	 */
	
	private static void fillFileWithNumbers(String path, int[] arrOnInts) throws IOException {
		File file = new File(path);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream(file)));
		for (Integer integer : arrOnInts) {
			bw.write(integer.toString() + " ");
			}
		bw.close();
	}
	
	
	/**
	 * Reads text from text file.
	 * 
	 * Note that this method reads only one line in the file.
	 * Reading of one line from the file is enough for make the job done
	 * specified in this task.
	 * 
	 * @param path to file to read.
	 * @return string of text file.
	 * @throws UnsupportedEncodingException
	 * @throws FileNotFoundException in case file not found.
	 * @throws IOException in case exception while reading or closing of stream.
	 */
	
	public static String stringFromFile(String path) throws FileNotFoundException, IOException {
		File file = new File(path);
		BufferedReader br = new BufferedReader(new InputStreamReader(
						new FileInputStream(file))); 
		String s = br.readLine();
		
		br.close();
		return s;
		
	}
	

	/**
	 * Enter point to the Part2.
	 * 
	 * At first fills file with 10 random numbers.
	 * After sorted it.
	 * And then print numbers to the console in the specified format.
	 * 
	 * @param args
	 * @throws IOException in case of exceptions in the the methods 
	 * 						which are invoked here.
	 */
	public static void main(String[] args) throws IOException {
		
		fillWithRandomNumbers("text02.txt", 10);
		sortNumbersFromFile("text02.txt", "text02_SORTED.txt");
		
		System.out.println("input  ==> " + stringFromFile("text02.txt"));
		System.out.println("output ==> " + stringFromFile("text02_SORTED.txt"));

	}

}

