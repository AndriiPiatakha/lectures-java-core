package labs.practice4;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Part3Test {
	
	public static final InputStream STDIN = System.in;
	public static String newline = System.getProperty("line.separator");
	private static final String ENCODING = "Cp1251";
	
	@Before
	public void setUp() throws UnsupportedEncodingException {
		ByteArrayInputStream in = new ByteArrayInputStream(("string" + newline 
				+ "char" + newline + "int" + newline + "double" + newline +
				"WRONG TYPE" + newline + "stop").getBytes(ENCODING));
		System.setIn(in);
	}
	
	@After
	public void tearDown() {
		System.setIn(STDIN);
	}

	@Test
	public void testReadTypesFromConsoleAndPrintTupesFromText() throws IOException {
		Part3.readTypesFromConsoleAndPrintTypesFromText("task03_in.txt");
	}

	@Test
	public void testReadBaseText() throws IOException {
		String actual = Part3.readBaseText("task03_in.txt");
		String expected = "a bcd 43.43 432 ט כ פגûא 89 .98" + newline;
		assertEquals(expected, actual);
	}

	@Test
	public void testCinstructor() {
		new Part3();
	}
	
	@Test
	public void testMain() throws IOException {
		Part3.main(new String[]{});
	}

}
