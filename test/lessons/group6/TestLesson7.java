package lessons.group6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLesson7 {
	
	pub
	private Lesson7 testInstance;
	
	@Before
	public void setUp() {
		testInstance = new Lesson7();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenIllegalArgiment() {
		testInstance.sum(null, null);
	}
	
}
