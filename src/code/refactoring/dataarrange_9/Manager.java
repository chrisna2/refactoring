package code.refactoring.dataarrange_9;

//�ǹ��� �ϴ� �ֵ�
public class Manager extends EmployeeType {

	@Override
	public int payAmount() {
		return _monthlySalary + _bonus;
	}

}
