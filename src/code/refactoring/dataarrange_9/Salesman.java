package code.refactoring.dataarrange_9;

//�ǹ��� �ϴ� �ֵ�
public class Salesman extends EmployeeType {

	@Override
	public int payAmount() {
		return _monthlySalary + _commission;
	}

}
