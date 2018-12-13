package lessons.allgroups;

import java.util.Arrays;

public class Lesson5 {

	public static void main(String[] args) {
		Integer max = Arrays.stream(new int[2]) // Создание стрима
				.boxed() // Упаковка
				.max(Integer::compareTo) // Сравнение
				.get();
		
		String s = "asdasd qadsad asdas !1:; =+=== qqwdqwd";
		String[] split = s.split("\\s");
		
		for (String string : split) {
			if(string.matches("[a-zA-Z]*")) {
				System.out.println(string);
			}
		}
		System.out.println(split.length);
		
		Arrays.stream(new int[1]).max().getAsInt();
	}

}
