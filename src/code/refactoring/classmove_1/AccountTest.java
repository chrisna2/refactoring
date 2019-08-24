package code.refactoring.classmove_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AccountTest {

	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testoverdraftCharge() {
		Account account = new Account(10);
		assertTrue(account.overdraftCharge() == 12.55);	
	}

}
