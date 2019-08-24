package code.refactoring.junit;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class VectorTest {
	protected Vector<Integer> fEmpty = new Vector<Integer>();
	protected Vector<Integer> fFull = new Vector<Integer>();
	
	@Before
	public void setUp() throws Exception {
		fFull.addElement(1);
		fFull.addElement(2);
		fFull.addElement(3);
	}
	
	@Test
	public void testCapacity() {
		int size= fFull.size(); 
		for (int i= 0; i < 100; i++)
			fFull.addElement(i);
		assertTrue(fFull.size() == 100+size);
	}
	
	@Test
	public void testClone() {
		Vector<Integer> clone= (Vector<Integer>)fFull.clone(); 
		assertTrue(clone.size() == fFull.size());
		assertTrue(clone.contains(1));
	}
	@Test
	public void testContains() {
		assertTrue(fFull.contains(1));  
		assertTrue(!fEmpty.contains(1));
	}
	@Test
	public void testElementAt() {
		Integer i= fFull.elementAt(0);
		assertTrue(i.intValue() == 1);

		try { 
			fFull.elementAt(fFull.size());
		} catch (ArrayIndexOutOfBoundsException e) {
			return;
		}
		fail("Should raise an ArrayIndexOutOfBoundsException");
	}
	
	@Test
	public void testRemoveAll() {
		fFull.removeAllElements();
		fEmpty.removeAllElements();
		assertTrue(fFull.isEmpty());
		assertTrue(fEmpty.isEmpty()); 
	}
	
	@Test
	public void testRemoveElement() {
		fFull.removeElement(3);
		assertTrue(!fFull.contains(3)); 
	}
}
