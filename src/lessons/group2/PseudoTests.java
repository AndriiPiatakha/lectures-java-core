//package lessons.group2;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
//
//public class PseudoTests {
//	
//	private Parser testInstance;
//	
//	@Before
//	public void setUp() {
//		testInstance = new Parser();
//	}
//	
//	@Test
//	public void shouldParseValidFile() {
//		String filePathToValidFile = "validFile.xml";
//		
//		Container<String> actualContainer = testInstance.parse(filePathToValidFile);
//		
//		Container expectedContainer = getExpectedContainer();
//		assertEquals(actualContainer, expectedContainer);
//	}
//	
//	@Test(expected = ParseException.class)
//	public void shouldThrowExceptionIfFileIsInvalid() {
//		String filePathToInvalidFile = "invalidFile.xml";
//		
//		Container<String> actualContainer = testInstance.parse(filePathToValidFile);
//	}
//
//	private Container getExpectedContainer() {
//		// TODO returns valid Container
//		return null;
//	}
//
//}
