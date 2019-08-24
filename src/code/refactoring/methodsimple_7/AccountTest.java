package code.refactoring.methodsimple_7;

public class AccountTest {
	
	public static void main(String[] args) { 
		Account account= new Account();
		int amount = 150;
		try {
			account.canWithdraw(amount);
			doTheUsualThing();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			handleOverdrawn();
			// <!> try ~ catch 이후 로직을 추가하게 되면 애러나도 그대로 실행된다.
		}
	}
	
	
	/*
	//as-is
	public static void main(String[] args) { 
	 
		Account account= new Account();
	
		int amount = 150;
		if (account.canWithdraw(amount) == -1)
			handleOverdrawn();
		else {
			account.canWithdraw(amount);
			doTheUsualThing();
		}
	}*/

	private static void doTheUsualThing() {
		System.out.println( "doTheUsualThing() -->" ); 
		
	}

	private static void handleOverdrawn() {
		System.out.println( "handleOverdrawn() -->" ); 
		
	}
}
