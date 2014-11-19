package se.cs.a4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SnocListTest {

	SnocList charList;

	@Before
	public void setUp() {
		charList =  new SnocList('a', new SnocList('b', new SnocList('c', null)));
	}

	@Test
	public void testSnocList(){
		SnocList tmp = new SnocList('a', null);
		assertEquals('a', tmp.getC());
		assertEquals(null, tmp.getL());
	}
	
	@Test
	public void testCurrentNode(){
		assertEquals('a',charList.getC());
	}
	
	@Test
	public void testNextNode(){
		assertEquals('b',charList.getL().getC());
	}
	
	@Test
	public void testreverse(){
		assertEquals("c,b,a,",charList.recursiveReverse(charList).toString());
	}
	
	@Test
	public void testNonreverse(){
		assertNotEquals("b,c,a,",charList.recursiveReverse(charList).toString());
	}
	
	@Test
	public void testNextNodeReverse(){
		assertEquals('b',(charList.recursiveReverse(charList)).getL().getC());
	}
	
	@Test
	public void testToString(){
		assertEquals("a,b,c,",charList.toString());
	}
	


}
