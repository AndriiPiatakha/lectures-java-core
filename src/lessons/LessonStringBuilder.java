package lessons;

public class LessonStringBuilder {
	
	public static void main(String[] args) {
		String[] strings = {};
		
		StringBuilder sb = new StringBuilder();
		for (String string : strings) {
			if (string.length() < 3) {
				sb.append(string);
			}
		}
		
		String str = sb.toString();
		
		String result = "";
		for (String string : strings) {
			if (string.length() < 3) {
				result += string;
			}
		}
		
		
	}

}
