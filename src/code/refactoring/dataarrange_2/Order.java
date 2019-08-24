package code.refactoring.dataarrange_2;

public class Order {
	
	private String _customer;
	
	public Order (String customer) {
		_customer = customer;
	}
	
	public String getCustomerName() {
		return _customer;
	}

	public void setCustomer(String arg) {
		_customer = arg;
	}
	
}
