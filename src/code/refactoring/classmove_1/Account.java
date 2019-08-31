package code.refactoring.classmove_1;

/**
 * 객체 구조화
 * 메서드 이동 : 메서드가 다른 클래스의 기능 변수를 더 사용할 때 다른 클래스로 이동한다.
 * 
 * @author chrisna2
 *
 */
public class Account {
	
	//to-be
	private AccountType _type = new AccountType();
	private int _daysOverdrawn;
	
	public Account(int daysOverdrawn) {
		this._daysOverdrawn = daysOverdrawn;

	}
	
	//테스트 코드(외부)에서 사용이 되므로 : 델리게이션 처리를 해준다
	public double overdraftCharge() {
		// 이렇게 한줄만 써있고 다른 메서드를 호출 하는 코드들이 있는데 용어로 deligation 처리라고 한다.
		return _type.overdraftCharge(_daysOverdrawn);
	}
	
	double bankCharge() {
		double result = 4.5;
		if(_daysOverdrawn > 0) {
			result += _type.overdraftCharge(_daysOverdrawn);
		}
		return result;	
	}
	
	/* AS-IS
	private AccountType _type = new AccountType();
	private int _daysOverdrawn;
	
	public Account(int daysOverdrawn) {
		this._daysOverdrawn = daysOverdrawn;

	}
	
	public double overdraftCharge() {
		
		if (_type.isPremium()) {
			double result = 10;
			if(_daysOverdrawn > 7) result += (_daysOverdrawn - 7) *0.85;
				return result;			
		}
		else return _daysOverdrawn * 1.75;
	}
	
	double bankCharge() {
		double result = 4.5;
		if(_daysOverdrawn > 0) result += overdraftCharge();
		return result;	
	}
	*/
}
