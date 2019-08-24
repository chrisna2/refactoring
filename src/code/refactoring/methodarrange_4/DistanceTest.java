package code.refactoring.methodarrange_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DistanceTest {
	Distance distance = new Distance();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testgetDistanceTrabelled() {
		double retdist = distance.getDistanceTravelled(10);
		assertTrue(retdist == 433.5);
		
		
	}

}
