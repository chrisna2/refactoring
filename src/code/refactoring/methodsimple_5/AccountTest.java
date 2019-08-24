package code.refactoring.methodsimple_5;

import java.util.Date;

public class AccountTest {
	
	public static void main(String[] args) { 
	 
		Date TOD=new Date();

		// client code...
		Date startDate = new Date(2016, 1, 1);  
		Date endDate = new Date(2016, 1, 5);   
		Account anAccount = new  Account();
		double flow = anAccount.getFlowBetween(startDate, endDate);
		System.out.println(flow);
}

}
