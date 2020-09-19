package lessons.group11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextAnalyzer {
	
	private static List<Character> vowels;
	
	static {
		vowels = new ArrayList<>(Arrays.asList('а','у', 'е', 'э', 
				'о', 'ы', 'я', 'и', 'ю'));
	}
	

	public int findLineWithMostVowels(String fileName) throws IOException {
		int lineIndex = 0;
		long maxVowels = 0;
		
		List<String> lines = Files.readAllLines(Paths.get(fileName));
		
		for (int i = 0; i < lines.size(); i++) {
			long vowelsInLine = calculateVowelsInLine(lines.get(i));
			if (maxVowels < vowelsInLine) {
				maxVowels = vowelsInLine;
				lineIndex = i;
			}
		}
		
		return lineIndex + 1; 
	}

	private long calculateVowelsInLine(String line) {
		Character[] chars = 
				line.toLowerCase()
				.chars()
				.mapToObj(c -> (char)c).toArray(Character[]::new); 
		
		return Arrays.stream(chars)
				.filter(c -> vowels.contains(c))
				.count();
	}
	
}
