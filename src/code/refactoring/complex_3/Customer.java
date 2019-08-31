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
	//몰빵된 기능들
	public String statement() {
		Enumeration rentals = _rentals.elements();
		String result = getName() + " 고객님의 대여기록\n";
		
		while (rentals.hasMoreElements()) {
			
			Rental aRental = (Rental)rentals.nextElement();
			
			//이번에 대여하는 비디오정보와 대여료를 출력
			result += "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getRantalCharge()) + "\n";
		}
		
		//푸터행 추가
		result += "누적 대여료: " + String.valueOf(getTotlaAmount()) + "\n";
		result += "적립 포인트: " + String.valueOf(getTotlaPoint()) + "\n";
		
		return result;
	}
	
	//토탈 양 -> 성능적으로 봤을때는 빵점인데 이건 순수하게 리펙토링 관점에서 적용되는 것
 	public double getTotlaAmount() {
		double totalAmount = 0;
		Enumeration rentals = _rentals.elements();
		
		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental)rentals.nextElement();
			totalAmount += aRental.getRantalCharge();
		}
		return totalAmount;
	}
 	
	//토탈 포인트
	public int getTotlaPoint() {
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		
		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental)rentals.nextElement();
			frequentRenterPoints += aRental.getFrequentRentalPoint();
		}
		return frequentRenterPoints;
	}
	
	
	
	
	
	
	//렌탈 객체로 이동
//	private int getFrequentRentalPoint(int frequentRenterPoints, Rental aRantal) {
//		// 적립 포인트를 1 포인트 증가
//		frequentRenterPoints ++;
//		
//		//최신물을 이틀이상 대여하면 보너스포인트 지급
//		if((aRantal.getMovie().getPriceCode() == Movie.NEW_RELEASE) && aRantal.getDaysRented() > 1) {
//			frequentRenterPoints ++;
//		}
//		return frequentRenterPoints;
//	}

	//렌탈 객체로 이동
//	private double getRantalCharge(double thisAmount, Rental aRantal) {
//		switch(aRantal.getMovie().getPriceCode()) {
//		case Movie.REQULAR:
//			thisAmount += 2;
//			if(aRantal.getDaysRented() > 2)
//				thisAmount += (aRantal.getDaysRented()-2) * 1.5;
//			break;
//		case Movie.NEW_RELEASE:
//			thisAmount += (aRantal.getDaysRented()) * 3;
//			break;
//		case Movie.CHILDERNS:
//			thisAmount += 1.5;
//			if(aRantal.getDaysRented() > 3)
//				thisAmount += (aRantal.getDaysRented()-3) * 1.5;
//			break;
//		}
//		return thisAmount;
//	}
}
