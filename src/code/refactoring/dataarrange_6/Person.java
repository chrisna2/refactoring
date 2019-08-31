package code.refactoring.dataarrange_6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//������ Ŭ�������� ��ü �״�θ� ȣ���Ͽ� Ŭ���̾�Ʈ �󿡼� �߰��� ó���ϴ� ���� ���δ�.
public class Person {
	
	private Set _courses;
	
	//as-is
//	public Set getCourses() {
//		return _courses;
//	}
//	public void setCourses(Set arg) {
//		_courses = arg;
//	}
	
	public Person() {
		_courses = new HashSet();
	}
	
	//to-be
	public void addCource(Course arg) {
		_courses.add(arg);
	}
	
	public void removeCource(Course arg) {
		_courses.remove(arg);
	}
	public int getSize() {
		return _courses.size();
	}
	
	public int numberOfAdvancedCourses() {
		Iterator iter = _courses.iterator();
		
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) count ++;
		}
		return count;
	}

}

