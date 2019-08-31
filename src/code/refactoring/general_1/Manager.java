package code.refactoring.general_1;

/*
 * �Ϲ�ȭ ó�� 1 : ������ ���� ����
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
		
		if (isPriviliged()) assignCar();   //  ��� ����Ŭ������ ������
	}
	*/
	boolean isPriviliged() {
		return _grade > 4;
	}
}
	
