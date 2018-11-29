package lessons;

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
import java.util.Scanner;

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
		
		try (BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in, Charset.forName("UTF-8"))); 
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File("demoIO13")))) {
			String line = null;
			while ( (line = br.readLine()) != null && !line.equals("exit")) {
				bw.write(line + System.lineSeparator());
			}
		}
	
		
	}

}

class A112 implements Iterable<Object> {

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
