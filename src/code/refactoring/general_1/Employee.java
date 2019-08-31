package code.refactoring.general_1;

public class Employee {
	
	protected String _name;
	protected String _id;
	
	public Employee(String _name, String _id) {
		this._name = _name;
		this._id = _id;
	}
	
	//하위 클래스의 공통된 메소드 : protected 상속된 클래스만 접근이 가능, 외부에서는 private와 마찬가지로 접근 불가능
	protected void initialize() {
		if (isPriviliged()) {
			assignCar();   //  모든 하위클래스의 공통기능
		}
	}
	
	boolean isPriviliged() {
		return false;
		
	}
	
	void assignCar() {
		
	}

}
