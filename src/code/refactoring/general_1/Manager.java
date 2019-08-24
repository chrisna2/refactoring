package code.refactoring.general_1;

public class Manager extends Employee {
	
	private int _grade;
	
	public Manager (String name, String id, int grade) {
		_name = name;
		_id = id;
		_grade = grade;
		
		if (isPriviliged()) assignCar();   //  모든 하위클래스의 공통기능
	}
	
	boolean isPriviliged() {
		return _grade > 4;
	}

}
