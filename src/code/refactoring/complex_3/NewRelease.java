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
		
		// ���� ����Ʈ�� 1 ����Ʈ ����
		int frequentRenterPoints = 1;
		
		//�ֽŹ��� ��Ʋ�̻� �뿩�ϸ� ���ʽ�����Ʈ ����
		if((getPricCode() == Movie.NEW_RELEASE) && getDayRanted > 1) {
			frequentRenterPoints ++;
		}
		
		return frequentRenterPoints;
	}


}
