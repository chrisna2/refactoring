package code.refactoring.complex_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GeneratePrimesTest {
	GeneratePrimes genPrimes = new GeneratePrimes();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetPrimes() {
		int cntPrimes = genPrimes.getPrimes(100);
		assertTrue (cntPrimes == 25);
	}

}
