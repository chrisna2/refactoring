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
		//객체에서 객체를 또 직접호출 하는 것은 의존성을 심화시킨다.
		assertTrue(John.getManager().equals("111"));
	}

}
