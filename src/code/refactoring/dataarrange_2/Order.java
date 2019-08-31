package code.refactoring.dataarrange_2;

public class Order {
	
	//to-be
	private Customer _customer;
	
	public Order (String customer) {
		_customer = new Customer(customer);
	}
	
	public String getCustomerName() {
		return _customer.getCustomerName();
	}

//	public void setCustomer(String arg) {
//		_customer.setCustomerName(arg);
//	}
	
	/*AS-IS
	private String _customer;
	
	public Order (String customer) {
		_customer = customer;
	}
	
	public String getCustomerName() {
		return _customer;
	}

	public void setCustomer(String arg) {
		_customer = arg;
	}*/
	
}
