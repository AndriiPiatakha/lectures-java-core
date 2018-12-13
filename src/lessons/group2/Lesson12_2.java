package lessons.group2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

import sun.awt.datatransfer.DataTransferer;

public class Lesson12_2 {
	
	public static void main(String[] args) throws IOException {
//		List<String> list = new ArrayList<>();
//		list.add("");
//		list.add("");
//		
//		Iterator<String> iterator = list.iterator();
//		iterator.next();
//		iterator.next();
//		iterator.remove();
//		iterator.remove();
//		System.out.println("END");
//		
//		A112 a = new A112();
//		for (Object obj : a) {
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
//		while (true) {
//			String nextLine = sc.nextLine();
//			Files.write(Paths.get("demoIO12"), 
//					(nextLine + System.lineSeparator()).getBytes(), 
//					StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//		}
		
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in, Charset.forName("UTF-8")));
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File("demoIO13")))) {
			String line = null;
			
			while ( (line = br.readLine()) != null && !line.equals("exit")) {
				bw.write(line + System.lineSeparator());
				sb.append(line + System.lineSeparator());
			}
		}
		
		String resultString = sb.toString();
		String[] split = resultString.split("\\s*(\\s)|\n");
		for (String string : split) {
			System.out.println(string);
		}
		
		System.out.println(split.length);
	
//		int wordCount = 0;
//		Stream<String> s = null;
//		s.forEach(string -> {
//			String[] split = string.split("\\s");
//			
//			final int wordCount2 = split.length;
//		});
//		int wordInLine = s.map(string -> string.split("\\s").length)
//			.mapToInt(i -> Integer.valueOf(i))
//			.sum();
//		int wordInLine2 = string.split("\\s").length;
		
	}

}

class A112 implements Iterable<Object> {

	private int i;
	private String s;
	private Lesson12_2 l;
	
	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + i;
//		result = prime * result + ((l == null) ? 0 : l.hashCode());
//		result = prime * result + ((s == null) ? 0 : s.hashCode());
//		return result;
//	}
	
	

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		A112 other = (A112) obj;
//		if (i != other.i)
//			return false;
//		if (l == null) {
//			if (other.l != null)
//				return false;
//		} else if (!l.equals(other.l))
//			return false;
//		if (s == null) {
//			if (other.s != null)
//				return false;
//		} else if (!s.equals(other.s))
//			return false;
//		return true;
//	}
	
	public int hashCode() {
		return Objects.hash(i, l, s);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A112 other = (A112) obj;
		return Objects.equals(this.i, other.i) 
				&& Objects.equals(this.s, other.s)
				&& Objects.equals(this.l, other.l);
	}
	
	
	
	
	
	
}
