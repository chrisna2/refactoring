package code.refactoring.methodsimple_7;

public class Account {
	private int _balance=100;
	
	int canWithdraw(int amount) {
		if (amount > _balance)
        	return -1;
    	else {
        	_balance -= amount;
        	return 0;
    	}
	}

}
