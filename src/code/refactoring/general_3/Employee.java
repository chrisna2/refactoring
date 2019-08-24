package code.refactoring.general_3;

public class Employee {
	
	private String _name;
	private String _id;
	private int _annualCost;

	public Employee (String name, String id, int annualCost) {
		_name = name;
		_id = id;
		_annualCost = annualCost;
	}
	
	public int getAnnualCost() {
		return _annualCost;
	}
	
	public String getId() {
		return _id;
	}
	
	public String getName() {
		return _name;
	}

}
