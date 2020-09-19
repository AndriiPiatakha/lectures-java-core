package lessons.group11;

import java.io.IOException;

public class TextAnalyzerDemo {
	
	public static void main(String[] args) throws IOException {
		TextAnalyzer textAnalyzer = new TextAnalyzer();
		int lineWithMaxVowels = textAnalyzer.findLineWithMostVowels("esenin.txt");
		System.out.println(lineWithMaxVowels);
	}

}
