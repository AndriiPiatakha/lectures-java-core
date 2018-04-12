package labs.practice4;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Part5Test {

	public static final InputStream STDIN = System.in;
	public static String newline = System.getProperty("line.separator");
	private static final String ENCODING = "Cp1251";
	
	@Before
	public void setUp() throws UnsupportedEncodingException {
		ByteArrayInputStream in = new ByteArrayInputStream(("apple en" + newline 
				+ "apple ru" + newline + "table en" + newline + "table ru"
				+ newline + "stop").getBytes(ENCODING));
		System.setIn(in);
	}
	
	@After
	public void tearDown() {
		System.setIn(STDIN);
	}
	
	@Test
	public void testreadFromConsoleAndPrintResult() {
		Part5.readFromConsoleAndPrintResult();
	}
	
	@Test
	public void constructor() {
		new Part5();
	}

	@Test
	public void testMain() {
		Part5.main(new String[]{});
	}

	
}
