package code.refactoring.methodarrange_5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PriceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testdiscount() {
		Price price = new Price();
		assertTrue(price.discount(60, 100, 5000) == 58);
		
	}

}
