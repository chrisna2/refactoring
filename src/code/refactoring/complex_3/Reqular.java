package code.refactoring.complex_3;

public class Reqular extends PriceCode {

	@Override
	public double getRantalCharge(int getDayRanted) {
		double thisAmount = 2;
		if(getDayRanted > 2) {
			thisAmount += (getDayRanted-2) * 1.5;
			
		}
		return thisAmount;
	}

	@Override
	public int getRantalPoint(int getDayRanted) {
		// 적립 포인트를 1 포인트 증가
		return 1;
	}

	@Override
	public int getPricCode() {
		// TODO Auto-generated method stub
		return Movie.REQULAR;
	}


}
