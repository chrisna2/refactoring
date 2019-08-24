package code.refactoring.conditionsimple_6;

public class EmployeeTest {
	public static void main(String[] args) { 
        
        Employee kim=new Employee() ;
        System.out.println( kim.getExpenseLimit()  ); // 100
        System.out.println( kim.withinLimit(99)  );  // true
      
	} 
}
