//package labs.practice4;
//
//import static org.junit.Assert.assertEquals;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.PrintStream;
//import java.io.UnsupportedEncodingException;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//
//public class Part1Test {
//
//	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//	public static String newline = System.getProperty("line.separator");
//	public static final PrintStream STDOUT = System.out;
//	
//	@Before
//	public void setUpStreams() throws UnsupportedEncodingException {
//	    System.setOut(new PrintStream(outContent, true, "cp1251"));
//	}
//	
//	@After
//	public void cleanUpStreams() {
//		System.setOut(STDOUT);
//	}
//	
//	@Test
//	public void testPrintInUpperCase() throws IOException {
//		Part1.readFromFileAndWriteToConsole("text01_in.txt");
//		
//		String expected = "ASDA12987HJS ASD-ASDA as ds we dsj" + newline +
//							"��� ������� ����� �� �� ���� ��� ��-�����";
//		String actual = new String(outContent.toByteArray(), "cp1251");
//
//		System.out.println(actual);
//		assertEquals(expected, actual);
//	}
//	
//	@Test
//	public void testConstructor() {
//		new Part1();
//	}
//	
//	@Test
//	public void testMain() throws IOException {
//		Part1.main(new String[]{});
//	}
//	
////	@Test(expected=IOException.class)
////	public void testException() throws IOException {
////		Subtask01.printInUpperCase(new File("sadasd.txt"));
////	}
//	
//	
//
//}
