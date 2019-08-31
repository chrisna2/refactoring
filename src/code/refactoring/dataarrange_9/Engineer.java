package code.refactoring.dataarrange_9;

//실무를 하는 애들
public class Engineer extends EmployeeType {

	@Override
	public int payAmount() {
		return _monthlySalary;
	}

}
