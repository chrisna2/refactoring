package code.refactoring.general_3;

import java.util.Enumeration;
import java.util.Vector;

public class Department extends Party {
	
	private Vector _staff = new Vector();

	public Department (String name) {
		super(name);
	}
	
	@Override
	public int getAnnualCost() {
		Enumeration e = getStaff();
		int result = 0;
		while(e.hasMoreElements()) {
			Employee each = (Employee)e.nextElement();
			result += each.getAnnualCost();
		}
		return result;
	}
	
	public int getHeadCount() {
		return _staff.size();
	}
	public Enumeration getStaff() {
		_staff.addElement(new Employee("Kim", "01", 100));
		_staff.addElement(new Employee("Kim", "02", 150));
		return _staff.elements();
	}
	public void addStaff(Employee arg) {
		_staff.addElement(arg);
	}

}
