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
		Set s = new HashSet();
		s.add(new Course ("Smalltalk Programming", false));
		s.add(new Course ("Appreciating Single Malts", true));
		kent.setCourses(s);
        assertEquals(2, kent.getCourses().size());

		Course refact = new Course ("Refactoring", true);
		kent.getCourses().add(refact);
		kent.getCourses().add(new Course ("Brutal Sarcasm", false));
		assertEquals(4, kent.getCourses().size());

		kent.getCourses().remove(refact);
		assertEquals(3, kent.getCourses().size());
	  
		// 고급과정 검색
		Iterator iter = kent.getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) count ++;
		}
		System.out.println( count );
	}

}
