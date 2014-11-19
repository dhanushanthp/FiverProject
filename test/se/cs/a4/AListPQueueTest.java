package se.cs.a4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AListPQueueTest {
	AListPQueue pq;

	@Before
	public void setUp() {
		pq = new AListPQueue();
		pq.insertItem(1, 'a');
		pq.insertItem(4, 'b');
		pq.insertItem(3, 'c');
		pq.insertItem(3, 'd');
	}

	@Test
	public void testNext() throws EmptyContainerException {
		assertEquals('c', pq.next());
	}

	@Test
	public void testDeleteItem() throws EmptyContainerException {
		pq.deleteItem();
		assertEquals('d', pq.next());
	}

	@Test
	public void testInsertItem() {
		AListPQueue pq = new AListPQueue();
		pq.insertItem(6, 'a');
		pq.insertItem(10, 'b');
		pq.insertItem(5, 'c');
		pq.insertItem(9, 'd');
		assertNotEquals(null, pq);
	}

	@Test
	public void testIsEmpty() {
		AListPQueue tmp = new AListPQueue();
		assertTrue(tmp.isEmpty());
	}

	@Test
	public void testIsNotEmpty() {
		AListPQueue tmp = new AListPQueue();
		tmp.insertItem(1, 'r');
		assertFalse(tmp.isEmpty());
	}

	@Test
	public void testToString() {
		assertEquals("(b/4), (c/3), (d/3), (a/1), ", pq.getHead().toString());
	}

}
