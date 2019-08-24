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
		String result = getName() + " ������ �뿩���\n";
		
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental)rentals.nextElement();
			
			// ���� ������ �뿩�� ���
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
			// ���� ����Ʈ�� 1 ����Ʈ ����
			frequentRenterPoints ++;
			//�ֽŹ��� ��Ʋ�̻� �뿩�ϸ� ���ʽ�����Ʈ ����
			if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
				frequentRenterPoints ++;
			
			//�̹��� �뿩�ϴ� ���������� �뿩�Ḧ ���
			result += "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(thisAmount) + "\n";
			//������� ������ �� �뿩��
			totalAmount += thisAmount;
			//Ǫ���� �߰�
			result += "���� �뿩��: " + String.valueOf(totalAmount) + "\n";
			result += "���� ����Ʈ: " + String.valueOf(frequentRenterPoints) + "\n";
			return result;
			
			
		}
		
		
		return _name;
	}
}
