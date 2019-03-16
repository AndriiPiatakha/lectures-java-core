package lessons.group6;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestLesson7 {
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	private Lesson7 testInstance;
	
	@Before
	public void setUp() {
		testInstance = new Lesson7();
	}
	
	@Test
	public void shouldThrowExceptionWhenIllegalArgiment() {
		exceptionRule.expect(RuntimeException.class);
//		exceptionRule.expectMessage("Some expected meessage");
		exceptionRule.expectCause(isA(IllegalArgumentException.class));
		testInstance.sum(null, null);
	}
	
}
