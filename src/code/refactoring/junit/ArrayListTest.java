package code.refactoring.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
	ArrayList<String> arrayList = new ArrayList<String>();

	@Before
	public void setUp() throws Exception {
        for (int i=0; i<3; i++) {
            arrayList.add("" + i);
        }
	}
	// 기본 적으로 위에 설정된 값은 메서드별로 초기화 되어 개별적으로 적용된다.

	@Test
    public void testAdd() {
        assertEquals(arrayList.size(), 3);
        arrayList.add(1, "Insert");
        assertEquals(arrayList.size(), 4);
        assertEquals(arrayList.get(1), "Insert");
    }
	
	@Test
    public void testSet() {
        assertEquals(arrayList.size(), 3);
        arrayList.set(1, "Set");
        assertEquals(arrayList.size(), 3);
        assertEquals(arrayList.get(1), "Set");		
    }
    
	@Test
    public void testRemove() {
        assertEquals(arrayList.size(), 3);
        arrayList.remove(1);
        assertEquals(arrayList.size(), 2);
        
        String[] strs = {"0","2"};
        
        compare(arrayList, strs);
    }
	
	@Test
    public void testAddAll() {
        assertEquals(arrayList.size(), 3);
        arrayList.addAll(arrayList);
        assertEquals(arrayList.size(), 6);
    }
    
	//자체적으로 테스트 케이스 안에서 사용하는 메서드는 다음과 같이 설정 가능 하다.
    @SuppressWarnings("unused")
	private void compare(ArrayList<String> lst, String[] strs) {
        Object[] array = lst.toArray();
        assertTrue("Arrays not the same length", array.length == strs.length);
        for (int i = 0; i < array.length; i++)
          assertEquals(strs[i], (String) array[i]);
    }


}
