package code.refactoring.classmove_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	
	Person person = new Person();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testgetTelephoneNumber() {
		person.setName("Kim");
		person.setOfficeAreaCode("031");
		person.setOfficeNumber("1234-5678");
	
		assertTrue(person.getTelephoneNumber().equals("(031)1234-5678"));
	}

}
