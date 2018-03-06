package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;
import static java.nio.file.StandardOpenOption.*;

public class Demo {
	
	public static void main(String[] args) throws IOException {
//		readInputStream();
//		readBufferedInput();
//		writeOutputStream("asdasdasd" + System.lineSeparator() + "asdasd \nasda");
		
//		writeBufferedWriter("asdasdasd" + System.lineSeparator() + "����������� \nasda");
		
//		readBufferedReader();
		
//		readFile();
		
		writeNio("\nasda ���������");
	}
	
	private static void writeNio(String textToWrite) throws IOException {
		Files.write(Paths.get("test4.txt"), textToWrite.getBytes(), CREATE, APPEND);
	}
	
	private static void readFile() throws IOException {
		try (Stream<String> stream = Files.lines(Paths.get("test.txt"), 
				Charset.forName("windows-1251"))) {
			stream.forEach(System.out::println);
		}
	}
	
	private static void readBufferedReader() throws FileNotFoundException, IOException {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader("test3.txt"))) {
			String buffer;
			while ( (buffer = br.readLine()) != null) {
				sb.append(buffer).append(System.lineSeparator());
			}
		}
		System.out.println(sb.toString());
	}
	
	private static void writeBufferedWriter(String textToWrite) 
			throws FileNotFoundException, IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("test3.txt"));) {
			bw.write(textToWrite);
		}
	}
	
	private static void writeOutputStream(String textToWrite) throws FileNotFoundException, IOException {
		try(OutputStream os = new FileOutputStream("test2.txt") ) {
			os.write(textToWrite.getBytes());
		}
	}
	
	private static void readBufferedInput() throws FileNotFoundException, IOException {
		try (DataInputStream is = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("test.txt")))) {
			String line;
			while ( (line = is.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

	private static void readInputStream() throws IOException, FileNotFoundException {
		try (InputStream is = new FileInputStream("test.txt")) {
			int buffer;
			while ((buffer = is.read()) != -1) {
				System.out.print( (char) buffer);
			}
		}
	}
}