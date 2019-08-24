package code.refactoring.methodarrange_6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Account account = new Account();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGamma() {
		int retValue = account.gamma(10, 10, 2);
		assertTrue(retValue == 640);
	}

}
