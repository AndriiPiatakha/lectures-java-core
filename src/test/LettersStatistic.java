package test;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LettersStatistic {
	
	private static void writeToFile(String str) throws IOException {
        Files.write(Paths.get("Text.txt"), (str + System.lineSeparator()).getBytes(),
        		StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    private static List<Character> chars = new ArrayList<>();

    public static void main(String args[]) throws FileNotFoundException, IOException {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File("demoIo.txt")));

            int c;
            while ((c = reader.read()) != -1) {
                chars.add((char) c);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        String s = chars.toString();
        int[] arr = new int[255];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
            
        }

        for (int i = 97; i < 123; i++) {
            if (arr[i] != 0) {
                System.out.println((char) i + " " + arr[i] + " раз(а)");
            }
        }


    }
}

