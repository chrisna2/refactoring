package code.refactoring.classmove_2;

/**
 * ��ü����ȭ2 : �ʵ��̵�
 * Ŭ������ �ʵ尡 �ٸ� �ʵ忡�� ���� ���Ǵ� ��� �ش� ������ �ʵ�� DTO Ŭ������ ��ȯ�Ͽ� ����ϴ� ���� �Ǵ�.
 * 
 * @author kosta
 *
 */
public class Account {
	
	//to-be
	AccountType type = new AccountType();
	
	public Account(double rate) {
		type.set_interestRate(rate);
	}
	
	public double interestForAmount_days(double amount, int days) {
		return type.get_interestRate() * amount * days / 365;
	}
	
	
	/* AS-IS
	private double _interestRate = 4.53;
	
	public Account(double rate) {
		this._interestRate = rate;
	}
	
	public double interestForAmount_days(double amount, int days) {
		return _interestRate * amount * days / 365;
	}
	*/

}
