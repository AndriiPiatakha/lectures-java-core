//package labs.practice4;
//
//import static org.junit.Assert.assertEquals;
//
//import java.io.IOException;
//
//import org.junit.Test;
//
//
//public class Part2Test {
//
//	@Test
//	public void testFillWithRandomNumbers() throws IOException {
//		Part2.fillWithRandomNumbers("text02_Test.txt", 10);
//	}
//	
//	@Test
//	public void testSortNumbersFromFile() throws IOException {
//		Part2.sortNumbersFromFile("text02_INPUT_Test.txt", "text02_Sorted_Test.txt");
//		String expected = Part2.stringFromFile("text02_MUSTBE_Sorted.txt");
//		String actual = Part2.stringFromFile("text02_Sorted_Test.txt");
//		assertEquals(expected, actual);
//		
//	}
//	
//
//	@Test
//	public void testMain() throws IOException {
//		Part2.main(new String[]{});
//	}
//	
//	@Test
//	public void constructorTest() {
//		new Part2();
//	}
//
//}
