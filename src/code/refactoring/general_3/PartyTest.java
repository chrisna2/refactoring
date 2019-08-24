package code.refactoring.general_3;

public class PartyTest {
	
	public static void main(String[] args) {
		
		Department department = new Department("Kim");
	
		System.out.println("department.getName() --> " + department.getName());
		System.out.println("department.getAnnualCost() --> " + department.getTotalAnnualCost());
	}
}
