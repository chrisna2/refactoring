package code.refactoring.methodsimple_7;

public class Account {
	private int _balance=100;
	
	//TO-BE
	void canWithdraw(int amount) {
		if (amount > _balance) {
			throw new IllegalArgumentException("입력된 값이 너무 크다!");
		}
		_balance -= amount;
	}
	
	/*
	//AS-IS
	int canWithdraw(int amount) {
		if (amount > _balance)
        	return -1;
    	else {
        	_balance -= amount;
        	return 0;
    	}
	}*/

}
