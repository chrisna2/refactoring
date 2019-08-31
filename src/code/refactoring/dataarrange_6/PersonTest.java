package code.refactoring.dataarrange_6;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPerson() {
		// 과정을 추가하는 코드
		Person kent = new Person();
		
		kent.addCource(new Course ("Smalltalk Programming", false));
		kent.addCource(new Course ("Appreciating Single Malts", true));
		
        assertEquals(2, kent.getSize());

		Course refact = new Course ("Refactoring", true);
		kent.addCource(refact);
		kent.addCource(new Course ("Brutal Sarcasm", false));
		assertEquals(4, kent.getSize());

		kent.removeCource(refact);
		assertEquals(3, kent.getSize());
	  
		// 고급과정 검색
		int count = kent.numberOfAdvancedCourses();
		System.out.println( count );
	}

}
