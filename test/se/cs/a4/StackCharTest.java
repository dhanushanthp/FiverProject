package se.cs.a4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackCharTest {
	StackChar  charStack;
	
	@Before
	public void setUp(){
		charStack= new StackChar();
		charStack.push('a');
		charStack.push('b');
		charStack.push('c');
		charStack.push('d');
		charStack.push('e');
	}
	
	@Test
	public void testTop() throws EmptyContainerException {
		assertEquals('e',charStack.top());
	}
	
	@Test(expected=EmptyContainerException.class)
	public void testTopEmpty() throws EmptyContainerException {
		ListChar tmp = new ListChar();
		assertEquals('e',tmp.top());
	}

	@Test
	public void testPop() throws EmptyContainerException {
		charStack.pop();
		assertEquals('d',charStack.top());
	}
	
	@Test(expected=NullPointerException.class)
	public void testPopEmpty() {
		ListChar tmp = new ListChar();
		tmp.pop();
	}

	@Test
	public void testPush() throws EmptyContainerException {
		charStack.push('f');
		assertEquals('f',charStack.top());
	}

	@Test
	public void testIsEmptyFalse() {
		assertFalse(charStack.isEmpty());
	}
	
	@Test
	public void testIsEmptyTrue() {
		ListChar tmp = new ListChar();
		assertTrue(tmp.isEmpty());
	}
	
	@Test
	public void testPushPop(){
		ListChar l = new ListChar();
		l.push('a');
		l.pop();
		assertTrue(l.isEmpty());
	}

}
