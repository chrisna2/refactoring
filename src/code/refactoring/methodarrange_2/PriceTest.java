package code.refactoring.methodarrange_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PriceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetPrice_Upcase() {
		Price price = new Price(10, 500);
		assertTrue(price.getPrice() == 5000*0.95);
	}
	
	@Test
	public void testGetPrice_Downcase() {
		Price price = new Price(10, 50);
		assertTrue(price.getPrice() == 500*0.98);
	}

}
