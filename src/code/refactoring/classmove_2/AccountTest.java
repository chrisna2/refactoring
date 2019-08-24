package code.refactoring.classmove_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInterestForAmount_days() {
		Account movefield = new Account(4.5);
		assertTrue(movefield.interestForAmount_days(500, 30) == 184.93150684931507);
	}

}
