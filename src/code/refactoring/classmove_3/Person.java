package code.refactoring.classmove_3;

/**
 * 객체구조화 3 : 클래스 추출
 * 만약 상속으로 처리할 경우 공통으로 묶는 것을 기본으로 한다. 지금 과 같은 케이스는 조금 결이 다른 경우..
 */
public class Person {
	
	//TO-BE 너무 방대해진 클래스를 줄이기 위한 기법
	private String name;
	private TelephoneNumber telNumber = new TelephoneNumber();
	
	public String getOfficeAreaCode() {
		return telNumber.getOfficeAreaCode();
	}
	public void setOfficeAreaCode(String officeAreaCode) {
		telNumber.setOfficeAreaCode(officeAreaCode);
	}
	public String getOfficeNumber() {
		return telNumber.getOfficeNumber();
	}
	public void setOfficeNumber(String officeNumber) {
		telNumber.setOfficeNumber(officeNumber);
	}
	public String getTelephoneNumber() {
		return telNumber.getTelephoneNumber();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*AS-IS
	private String name;
	private String officeAreaCode;
	private String officeNumber;
	
	public String getOfficeAreaCode() {
		return officeAreaCode;
	}
	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTelephoneNumber() {
		return ("(" + officeAreaCode + ")" + officeNumber);
	}*/
}
