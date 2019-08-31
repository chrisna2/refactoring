package code.refactoring.classmove_1;

public class AccountType {

	public boolean isPremium() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public double overdraftCharge(int daysOverdrawn) {
		
		if (isPremium()) {
			double result = 10;
			if(daysOverdrawn > 7) result += (daysOverdrawn - 7) *0.85;
				return result;			
		}
		else return daysOverdrawn * 1.75;
	}

}
