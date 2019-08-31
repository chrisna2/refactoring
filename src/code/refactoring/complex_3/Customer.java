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
	//������ ��ɵ�
	public String statement() {
		Enumeration rentals = _rentals.elements();
		String result = getName() + " ������ �뿩���\n";
		
		while (rentals.hasMoreElements()) {
			
			Rental aRental = (Rental)rentals.nextElement();
			
			//�̹��� �뿩�ϴ� ���������� �뿩�Ḧ ���
			result += "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getRantalCharge()) + "\n";
		}
		
		//Ǫ���� �߰�
		result += "���� �뿩��: " + String.valueOf(getTotlaAmount()) + "\n";
		result += "���� ����Ʈ: " + String.valueOf(getTotlaPoint()) + "\n";
		
		return result;
	}
	
	//��Ż �� -> ���������� �������� �����ε� �̰� �����ϰ� �����丵 �������� ����Ǵ� ��
 	public double getTotlaAmount() {
		double totalAmount = 0;
		Enumeration rentals = _rentals.elements();
		
		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental)rentals.nextElement();
			totalAmount += aRental.getRantalCharge();
		}
		return totalAmount;
	}
 	
	//��Ż ����Ʈ
	public int getTotlaPoint() {
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		
		while (rentals.hasMoreElements()) {
			Rental aRental = (Rental)rentals.nextElement();
			frequentRenterPoints += aRental.getFrequentRentalPoint();
		}
		return frequentRenterPoints;
	}
	
	
	
	
	
	
	//��Ż ��ü�� �̵�
//	private int getFrequentRentalPoint(int frequentRenterPoints, Rental aRantal) {
//		// ���� ����Ʈ�� 1 ����Ʈ ����
//		frequentRenterPoints ++;
//		
//		//�ֽŹ��� ��Ʋ�̻� �뿩�ϸ� ���ʽ�����Ʈ ����
//		if((aRantal.getMovie().getPriceCode() == Movie.NEW_RELEASE) && aRantal.getDaysRented() > 1) {
//			frequentRenterPoints ++;
//		}
//		return frequentRenterPoints;
//	}

	//��Ż ��ü�� �̵�
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
