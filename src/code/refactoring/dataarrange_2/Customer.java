package code.refactoring.dataarrange_2;

public class Customer {
	
	private String customerName;
	
	
	public Customer(String name) {
		customerName = name;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	//굳이 꼭 필요한 것은 아니라서 삭제
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}


}
