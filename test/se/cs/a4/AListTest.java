package se.cs.a4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AListTest {
	AList list;
	
	@Before
	public void setUp(){
		list = new AList('a', 1, new AList('b', 2, new AList('c', 3, null)));
	}
	
	@Test
	public void testGetHd() {
		assertEquals('a', list.getHd());
	}

	@Test
	public void testGetPriority() {
		assertEquals(1, list.getPriority());
	}

	@Test
	public void testGetTl() {
		assertEquals('b', list.getTl().getHd());
	}

	@Test
	public void testToString() {
		assertEquals("(a/1), (b/2), (c/3), ",list.toString());
	}

}
