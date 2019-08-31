package code.refactoring.complex_3;

public class NewRelease extends PriceCode {


	@Override
	public int getPricCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getRantalCharge(int getDayRanted) {
		return (getDayRanted) * 3;
	}

	@Override
	public int getRantalPoint(int getDayRanted) {
		
		// 적립 포인트를 1 포인트 증가
		int frequentRenterPoints = 1;
		
		//최신물을 이틀이상 대여하면 보너스포인트 지급
		if((getPricCode() == Movie.NEW_RELEASE) && getDayRanted > 1) {
			frequentRenterPoints ++;
		}
		
		return frequentRenterPoints;
	}


}
