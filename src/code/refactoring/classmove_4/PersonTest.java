package code.refactoring.classmove_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetManager() {
		Person John = new Person();
		assertTrue(John.getDepartment().getManager().equals("111"));
		
	}

}
