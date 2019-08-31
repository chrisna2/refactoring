package code.refactoring.dataarrange_9;


public class Employee {

	private EmployeeType _type;
	
	//클라이언트는 호출만 하라
    public Employee(int type) {
    	_type = EmployeeType.setType(type);
    }
    
    int payAmount() {
    	return _type.payAmount();

    }
    
    /*as-is
    public Employee(int type) {
    	_type = type;
    }
    
    int payAmount() {
        switch (_type) {
            case ENGINEER:
               return _monthlySalary;
            case SALESMAN:
               return _monthlySalary + _commission;
            case MANAGER:
               return _monthlySalary + _bonus;
            default:
               throw new RuntimeException("Incorrect Employee");
        }
    }*/
}
