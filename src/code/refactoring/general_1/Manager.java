package code.refactoring.general_1;

/*
 * 일반화 처리 1 : 생성자 내용 상향
 * 
 */
public class Manager extends Employee {
	
	private int _grade;
	
	//to-be
	public Manager (String name, String id, int grade) {
		super(name, id);
		_grade = grade;
		initialize();
	}
	/*
	//as-is
	public Manager (String name, String id, int grade) {
		_name = name;
		_id = id;
		_grade = grade;
		
		if (isPriviliged()) assignCar();   //  모든 하위클래스의 공통기능
	}
	*/
	boolean isPriviliged() {
		return _grade > 4;
	}
}
	
