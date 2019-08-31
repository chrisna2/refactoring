package code.refactoring.classmove_4;

/**
 * ��ü ����ȭ 4 : �븮 ��ü ���� <-> ���� �߰� �޼��� ����[�ݴ��� ���]
 * @author kosta
 *
 */
public class Person {
	
	Department _department = new Department();
	
	//TO-BE
	public void setDepartment(Department arg) {
		this._department = arg;
	}
	
    public String getManager() {
        return _department.getManager();
    }
	
	
	/*AS-IS
	Department _department = new Department();

	public Department getDepartment() {
		return _department;
	}

	public void setDepartment(Department arg) {
		this._department = arg;
	}*/
}
