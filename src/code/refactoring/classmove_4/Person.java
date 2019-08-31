package code.refactoring.classmove_4;

/**
 * 객체 구조화 4 : 대리 객체 은폐 <-> 과잉 중개 메서드 제거[반대의 경우]
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
