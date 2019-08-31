package code.refactoring.general_1;

public class Employee {
	
	protected String _name;
	protected String _id;
	
	public Employee(String _name, String _id) {
		this._name = _name;
		this._id = _id;
	}
	
	//���� Ŭ������ ����� �޼ҵ� : protected ��ӵ� Ŭ������ ������ ����, �ܺο����� private�� ���������� ���� �Ұ���
	protected void initialize() {
		if (isPriviliged()) {
			assignCar();   //  ��� ����Ŭ������ ������
		}
	}
	
	boolean isPriviliged() {
		return false;
		
	}
	
	void assignCar() {
		
	}

}
