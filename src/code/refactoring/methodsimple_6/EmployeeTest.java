package code.refactoring.methodsimple_6;

public class EmployeeTest {
	
	public static void main(String[] args) { 
		int _type = 1;
		final int ENGINEER = 0;
		final int SALESMAN = 1;
		final int MANAGER = 2;
		
		Employee employee = new Employee(_type);

		switch (_type) {
    		case 0:
    			employee = (Employee)new Engineer(_type);
    			break;
    		case 1:
    			employee = (Employee)new Salesman(_type);
    			break;
    		case 2:
    			employee = (Employee)new Manager(_type);
    			break;
    		default:
    			throw new IllegalArgumentException("Incorrect type code value");
		}
	}
}
