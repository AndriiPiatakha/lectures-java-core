package labs.practice4;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;

import org.junit.Test;


public class Part4Test {
	
	public static String newline = System.getProperty("line.separator");
	public static final String TEXT_EXPECTED = "The writer of this poem was Rabindranath Tagore "
			+ "(7 May 1861 – 7 August 1941), a Bengali poet, novelist,"
			+ " musician, painter and playwright who reshaped Bengali "
			+ "literature and music.  " + newline + "He was the first "
		    + "non-European to be awarded the Nobel Prize for Literature (1913). "
			+ newline + "I confess that I had never heard of this poem – "
			+ "or even of Tagore – until I was introduced to it recently "
			+ "by a dear Chinese friend.";

	@Test
	public void testReadFromFile() throws IOException {
		String actual = Part4.readFromFile("text04.txt");
		String expected = TEXT_EXPECTED;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCutSentencesFromTextAndAddingToList() {
		Part4.createPatternAndMatcherForSentencesExtract(TEXT_EXPECTED);
		String[] sentecesExpected = {
				"The writer of this poem was Rabindranath Tagore (7 May 1861 – "
				+ "7 August 1941), a Bengali poet, novelist, musician, "
				+ "painter and playwright who reshaped Bengali literature "
				+ "and music.",
				"He was the first non-European to be awarded the Nobel "
				+ "Prize for Literature (1913).",
				"I confess that I had never heard of this poem – or even of "
				+ "Tagore – until I was introduced to it recently by a dear "
				+ "Chinese friend."} ;
		int index = 0;
		while (Part4.getMatcher().find() && index < sentecesExpected.length) {
			String sentenceActual = Part4.getMatcher().group();
			String expected = sentecesExpected[index];
			assertEquals(expected, sentenceActual);
			index++;
		}
		Part4.getMatcher().reset();
	}
	
	@Test
	public void testConstructor() {
		new Part4();
	}
	
	@Test
	public void testMain() throws IOException {
		Part4.main(new String[]{});
	}
	
	@Test
	public void testConstructorIteratorImpl() {
		new Part4().iterator();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testRemoveWaitingForException() {
		new Part4().iterator().remove();
	}
	
	@Test
	public void testHasNextInIteratorImpl() {
		Part4.createPatternAndMatcherForSentencesExtract(TEXT_EXPECTED);
		boolean actual = new Part4().iterator().hasNext();
		boolean expected = true;
		Part4.getMatcher().reset();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNextInIteratorImpl() {
		Part4.createPatternAndMatcherForSentencesExtract(TEXT_EXPECTED);
		String actual = (String) new Part4().iterator().next();
		String expected = "The writer of this poem was Rabindranath "
				+ "Tagore (7 May 1861 – 7 August 1941), a Bengali poet, "
				+ "novelist, musician, painter and playwright who reshaped "
				+ "Bengali literature and music.";
		Part4.getMatcher().reset();
		assertEquals(expected, actual);
		System.out.println(actual);
	}
	
	@Test
	public void testHasNext() {
		Iterator iter = new Part4().iterator();
		iter.hasNext();
		iter.hasNext();
		Part4.getMatcher().reset();
	}
	
	
	
}
