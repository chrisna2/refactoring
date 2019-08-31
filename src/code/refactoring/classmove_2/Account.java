package code.refactoring.classmove_2;

/**
 * 객체구조화2 : 필드이동
 * 클래스의 필드가 다른 필드에서 많이 사용되는 경우 해당 데이터 필드는 DTO 클래스로 전환하여 사용하는 것이 옳다.
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
