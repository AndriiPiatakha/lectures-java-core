package test;

import java.util.Iterator;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test implements Iterable {
	
	public static void main(String[] args) {
		
		String arr = "asd asdas as-da. ,s acas as ! asda asd  z,!-?";
		String str2 = "as 1 asfd  44 asdfd r34 ";
		String replace = arr.replaceAll("[ \\.,!-\\?]", "");
		String replace2 = str2.replaceAll("\\D", " ").trim();
		Pattern p = Pattern.compile("()");
		Matcher m = p.matcher(replace2);
		
		
		System.out.println(replace);
		System.out.println(replace2);
		String[] split = arr.split("");
		System.out.println(split.length);
		
	}
	
	public static void lettersCount(String s){
//		[0-1]
        Stream.of(s.replaceAll("[.!?\\-]", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((letter, count) -> System.out.println(letter + " " + count));
    }

	@Override
	public Iterator iterator() {
		
		return null;
	}
	
	private class ItrImpl implements Iterator {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
