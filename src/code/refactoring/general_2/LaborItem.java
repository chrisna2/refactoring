package code.refactoring.general_2;

public class LaborItem extends JobItem{
	
	private Employee _employee;
	
	public LaborItem(int unitPrice, int quantity, Employee employee) {
		super(unitPrice, quantity);
		this._employee = employee;
	}
	
	public Employee getEmployee() {
		return _employee;
	}
	
	public int getTotalPrice() {
		return getUnitPrice() * getQuantity();
	}
	
	public int getUnitPrice() {
		return _employee.getRate();
	}

	public int getRate() {
		// TODO Auto-generated method stub
		return _employee.getRate();
	}
	
}
