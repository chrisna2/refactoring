package code.refactoring.conditionsimple_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CapitalTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testgetAdjustedCapital() {
		Capital capital = new Capital();
		
		double result = capital.getAdjustedCapital(100);
		assertTrue(result == 10.0);
		
	}

}
