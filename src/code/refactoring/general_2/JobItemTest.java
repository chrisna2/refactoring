package code.refactoring.general_2;

public class JobItemTest {
	
	public static void main(String[] args) {
		Employee kent = new Employee(1);
		JobItem jobitem = new JobItem(0, 5, true, kent);
	
		System.out.println("jobitem.getTotalPrice() --> " + jobitem.getTotalPrice());
		System.out.println("jobitem.getQuantity() --> " + jobitem.getQuantity());
		System.out.println("jobitem.getUnitPrice() --> " + jobitem.getUnitPrice());
		System.out.println("jobitem.getEmployee().getRate() --> " + jobitem.getEmployee().getRate());
		
	}

}
