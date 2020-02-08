package lessons.group10;

import java.util.Arrays;

public class Lesson4 {
	
	public static void main(String[] args) {
		String[] filteredStrings = filterStringsByCharacter(3, "String", "abs", "c", "da");
	
		String[] arr = {};
		Arrays.sort(arr, (str1, str2) -> {
			int result = str2.length() - str1.length();
			if (result == 0) {
				return str1.compareToIgnoreCase(str2);
			} else {
				return result;
			}
		});
	}

	private static String[] filterStringsByCharacter(int amountOfChars, 
			String... arr) {
		return Arrays.stream(arr)
				.filter((s) -> s.length() > 3)
				.toArray(String[]::new);
	}

}
