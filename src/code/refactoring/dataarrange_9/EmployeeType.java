package code.refactoring.dataarrange_9;

public abstract class EmployeeType {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    
    int  _monthlySalary=1, _commission=1,  _bonus=1;
    
    //�߰����� �ν��Ͻ��� �Ѱ��ִ� �� : ���丮 ����
	public static EmployeeType setType(int type) {
        switch (type) {
	        case ENGINEER:
	        	return new Engineer();
	        case SALESMAN:
	        	return new Salesman();
	        case MANAGER:
	        	return new Manager();
	        default:
	        	throw new RuntimeException("Incorrect Employee");
        }
	}

	public abstract int payAmount();

}
