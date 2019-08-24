package code.refactoring.methodarrange_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PriceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPrice() {
		Price price = new Price(10, 50);
		double retPrice = price.price();
		assertTrue(retPrice == 550.0);
	}

}
