package code.refactoring.classmove_3;

/**
 * ��ü����ȭ 3 : Ŭ���� ����
 * ���� ������� ó���� ��� �������� ���� ���� �⺻���� �Ѵ�. ���� �� ���� ���̽��� ���� ���� �ٸ� ���..
 */
public class Person {
	
	//TO-BE �ʹ� ������� Ŭ������ ���̱� ���� ���
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
