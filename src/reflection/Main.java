package reflection;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static final String CONSTANT_SOME = "Constanct";
	
	public static void main(String[] args) throws IOException {
		final int a = 10;
		
	}
	
	void test(final String s) {
		if (s == null) 
			return;
		
	}
	
	private void testMethod(String[] str) {
		System.out.println(str);
	}
	
	private void testMethod(String str, Integer i) {
		System.out.println(str);
	}

}
