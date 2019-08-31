package code.refactoring.complex_3;

public class Childerns extends PriceCode {


	@Override
	public int getPricCode() {
		return Movie.CHILDERNS;
	}

	@Override
	public double getRantalCharge(int getDayRanted) {
		double thisAmount = 1.5;
		if(getDayRanted > 3) {
			thisAmount += (getDayRanted-3) * 1.5;
		}
		return thisAmount;
	}

	@Override
	public int getRantalPoint(int getDayRanted) {
		return 1;
	}


	
}
