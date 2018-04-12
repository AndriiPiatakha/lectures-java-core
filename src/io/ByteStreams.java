package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ByteStreams {
	
	public static void main(String[] args) throws IOException {
		String filePath = "demoIo.txt";
//		printFileWithFileInputStream(filePath);
		
//		System.out.println();
//		System.out.println("===========");
//		
//		printFileWithFileInputStreamWithBuffer(filePath);
//		
//		System.out.println();
//		System.out.println("===========");
//		
//		printFileWithFileReader(filePath);
//		
//		System.out.println();
//		System.out.println("===========");
//		
//		printFileWithBuffer(filePath);
//		
//		writeFileToPath("testWrite.txt", "some text to write \nand more text русские буквы");
//		writeFileToPathFileWriter("testWrite2.txt", "some text to write \nand more text");
//		noWriteWithoutFlush("testWrite3.txt", "some text to write \nand more text");
		
		printFileToConsole(filePath);
		
	}

	private static void printFileWithFileInputStream(String path) throws IOException, FileNotFoundException {
		try (FileInputStream fis = new FileInputStream(path)) {
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		}
	}
	
	private static void printFileWithFileInputStreamWithBuffer(String path) throws IOException, FileNotFoundException {
		try (FileInputStream fis = new FileInputStream(path);
				BufferedInputStream bis = new BufferedInputStream(fis);
				DataInputStream dis = new DataInputStream(bis);
//				DataInputStream dis2 = new DataInputStream(new BufferedInputStream(new FileInputStream(path)))	
				) {
			int i;
			
			while (dis.available() != 0) {
				System.out.print(dis.readLine());
				System.out.println();
			}
		}
	}
	
	private static void printFileWithFileReader(String path) throws IOException, FileNotFoundException {
		try (FileReader fr = new FileReader(path)) {
			int content;
			while ( (content = fr.read()) != -1) {
				System.out.print((char) content);
			}
		}
	}
	
	private static void printFileWithBuffer(String path) throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
	
	private static void writeFileToPath(String path, String textToWrite) throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream(path)) {
			byte[] bytes = textToWrite.getBytes();
			fos.write(bytes);
		}
	}
	
	private static void writeFileToPathFileWriter(String path, String textToWrite) throws IOException {
		try (FileWriter fw = new FileWriter(path)) {
			fw.write(textToWrite);
		}
	}
	
	private static void noWriteWithoutFlush(String path, String textToWrite) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		bw.write(textToWrite);
	}
	
	public static void printFileToConsole(String path) throws IOException {
		try (Stream<String> fStream = Files.lines(Paths.get(path), StandardCharsets.UTF_8)) {
			fStream.forEach(System.out::println);
		}
		
//		List<String> readAllLines = Files.readAllLines(Paths.get(path));
	}
	
	
}
