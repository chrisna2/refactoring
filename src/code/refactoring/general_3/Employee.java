package code.refactoring.general_3;

public class Employee extends Party{
	
	private String _id;
	private int _annualCost;

	public Employee (String name, String id, int annualCost) {
		super(name);
		_id = id;
		_annualCost = annualCost;
	}
	
	@Override
	public int getAnnualCost() {
		return _annualCost;
	}
	
	public String getId() {
		return _id;
	}


}
