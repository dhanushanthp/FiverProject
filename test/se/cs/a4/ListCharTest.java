package se.cs.a4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListCharTest {
	ListChar charList;

	@Before
	public void setUp() {
		charList = new ListChar();
		charList.push('a');
		charList.push('b');
		charList.push('c');
		charList.push('d');
		charList.push('e');
	}

	@Test
	public void testListChar(){
		ListChar tmp = new ListChar('a',null);
		assertEquals("a,", tmp.toString());
	}
	
	@Test
	public void testTop() throws EmptyContainerException {
		assertEquals('e', charList.top());
	}

	@Test(expected = EmptyContainerException.class)
	public void testTopEmpty() throws EmptyContainerException {
		ListChar tmp = new ListChar();
		assertEquals('e', tmp.top());
	}

	@Test
	public void testPop() throws EmptyContainerException {
		charList.pop();
		assertEquals('d', charList.top());
	}

	@Test(expected = NullPointerException.class)
	public void testPopEmpty() {
		ListChar tmp = new ListChar();
		tmp.pop();
	}

	@Test
	public void testPush() throws EmptyContainerException {
		charList.push('f');
		assertEquals('f', charList.top());
	}

	@Test
	public void testIsEmptyFalse() {
		assertFalse(charList.isEmpty());
	}

	@Test
	public void testIsEmptyTrue() {
		ListChar tmp = new ListChar();
		assertTrue(tmp.isEmpty());
	}

	@Test
	public void testPushPop() {
		ListChar l = new ListChar();
		l.push('a');
		l.pop();
		assertTrue(l.isEmpty());
	}

	@Test(expected = NullPointerException.class)
	public void testPopPush() {
		ListChar l = new ListChar();
		l.pop();
		l.push('a');
		assertTrue(l.isEmpty());
	}

}
