package code.refactoring.methodsimple_7;

public class AccountTest {
	
	public static void main(String[] args) { 
	 
		Account account= new Account();
	
		int amount = 150;
		if (account.canWithdraw(amount) == -1)
			handleOverdrawn();
		else {
			account.canWithdraw(amount);
			doTheUsualThing();
		}
	}

	private static void doTheUsualThing() {
		System.out.println( "doTheUsualThing() -->" ); 
		
	}

	private static void handleOverdrawn() {
		System.out.println( "handleOverdrawn() -->" ); 
		
	}
}
