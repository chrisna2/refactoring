package code.refactoring.classmove_2;

public class Account {
	
	private AccountType _type = new AccountType();
	//private double _interestRate = 4.53;
	
	public Account(double rate) {
		//this._interestRate = rate;
		_type.set_interestRate(rate);
	}
	
	public double interestForAmount_days(double amount, int days) {
		//return _interestRate * amount * days / 365;
		return _type.get_interestRate() * amount * days / 365;
	}
	

}
