package code.refactoring.complex_3;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	
	private String _name;
	private Vector _rentals = new Vector();
	
	public Customer(String name) {
		_name = name;
	}
	
	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}
	
	public String getName() {
		return _name;
	}
	
	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = getName() + " 고객님의 대여기록\n";
		
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental)rentals.nextElement();
			
			// 비디오 종류별 대여료 계산
			switch(each.getMovie().getPriceCode()) {
			case Movie.REQULAR:
				thisAmount += 2;
				if(each.getDaysRented() > 2)
					thisAmount += (each.getDaysRented()-2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				thisAmount += (each.getDaysRented()) * 3;
				break;
			case Movie.CHILDERNS:
				thisAmount += 1.5;
				if(each.getDaysRented() > 3)
					thisAmount += (each.getDaysRented()-3) * 1.5;
				break;
			}
			// 적립 포인트를 1 포인트 증가
			frequentRenterPoints ++;
			//최신물을 이틀이상 대여하면 보너스포인트 지급
			if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
				frequentRenterPoints ++;
			
			//이번에 대여하는 비디오정보와 대여료를 출력
			result += "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(thisAmount) + "\n";
			//현재까지 누적된 총 대여료
			totalAmount += thisAmount;
			//푸터행 추가
			result += "누적 대여료: " + String.valueOf(totalAmount) + "\n";
			result += "적립 포인트: " + String.valueOf(frequentRenterPoints) + "\n";
			return result;
			
			
		}
		
		
		return _name;
	}
}
