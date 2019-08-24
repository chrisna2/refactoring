package code.refactoring.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JunitSimpleTest {
	protected int fValue1;
	protected int fValue2;

	@Before
	public void setUp() throws Exception {
		fValue1= 2;
		fValue2= 3;
	}

	@Test
	public void testAdd() {
		double result= fValue1 + fValue2;
		assertTrue(result == 5);
	}
	
	@Test
	public void testEquals() {
		assertEquals(12, 12);
		assertEquals(12L, 12L);
		assertEquals(new Long(12), new Long(12));

		assertEquals("Size", 12, 12);
	}

}
