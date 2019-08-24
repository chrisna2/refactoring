package code.refactoring.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
	ArrayList<String> arrayList = new ArrayList<String>();

	@Before
	public void setUp() throws Exception {
        for (int i=0; i<3; i++)
            arrayList.add("" + i);
	}

	@Test
    public void testAdd() {
        assertEquals(arrayList.size(), 3);
        arrayList.add(1, "Insert");
        assertEquals(arrayList.size(), 4);
        assertEquals(arrayList.get(1), "Insert");
    }
	
	@Test
    public void testSet() {
        fail("Not yet implemented");
    }
    
	@Test
    public void testRemove() {
        fail("Not yet implemented");
    }
	
	@Test
    public void testAddAll() {
        fail("Not yet implemented");
    }
    
    @SuppressWarnings("unused")
	private void compare(ArrayList<String> lst, String[] strs) {
        Object[] array = lst.toArray();
        assertTrue("Arrays not the same length", array.length == strs.length);
        for (int i = 0; i < array.length; i++)
          assertEquals(strs[i], (String) array[i]);
    }


}
