package code.refactoring.general_2;

public class JobItem {
	
	
	
	/* as-is
	private Employee _employee;
	private int _unitPrice;
	private int _quantity;
	private boolean _isLabor;

	public JobItem(int unitPrice, int quantity, boolean isLabor, Employee employee) {
		_unitPrice = unitPrice;
		_quantity = quantity;
		_isLabor = isLabor;
		_employee = employee;
	}
	
	public int getTotalPrice() {
		return getUnitPrice() * _quantity;
	}
	
	public int getUnitPrice() {
		return (_isLabor) ? _employee.getRate() : _unitPrice;
	}
	
	public int getQuantity() {
		return _quantity;
	}
	
	public Employee getEmployee() {
		return _employee;
	} 
	 */
	
	
	private int _unitPrice;
	private int _quantity;

	public JobItem(int unitPrice, int quantity) {
		_unitPrice = unitPrice;
		_quantity = quantity;
	}
	
	
	public int getQuantity() {
		return _quantity;
	}

	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return _unitPrice * _quantity;
	}


	public int getUnitPrice() {
		// TODO Auto-generated method stub
		return _unitPrice;
	}
	

}
