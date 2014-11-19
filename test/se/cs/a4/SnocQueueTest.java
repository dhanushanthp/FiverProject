package se.cs.a4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SnocQueueTest {
	SnocQueue s ;
	
	@Before
	public void setUp(){
		s = new SnocQueue();
		s.enqueue('a');
		s.enqueue('b');
		s.enqueue('c');
		s.enqueue('d');
		s.enqueue('e');
		s.enqueue('f');
		s.enqueue('g');
		s.enqueue('h');
	}
	
	@Test
	public void testTostring(){
		assertEquals("h,g,f,e,d,c,b,a,",s.getQueue().toString());
	}
	
	@Test
	public void testPeek() {
		assertEquals('h',s.getQueue().getC());
	}
	
	@Test(expected=NullPointerException.class)
	public void testEmptyPeek() {
		SnocQueue tmp = new SnocQueue();
		assertEquals('h',tmp.getQueue().getC());
	}

	@Test
	public void testDequeue() {
		s.dequeue();
		assertEquals("g,f,e,d,c,b,a,",s.getQueue().toString());
	}

	@Test
	public void testEnqueue() {
		SnocQueue tmp = new SnocQueue();
		tmp.enqueue('a');
		tmp.enqueue('b');
		assertEquals("b,a,",tmp.getQueue().toString());
		
	}

	@Test
	public void testIsEmpty() {
		SnocQueue tmp = new SnocQueue();
		assertTrue(tmp.isEmpty());
	}
	
	@Test
	public void testIsNotEmpty() {
		assertFalse(s.isEmpty());
	}

}
