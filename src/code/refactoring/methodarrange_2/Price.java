package code.refactoring.methodarrange_2;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}
	
	/* 
	//AS-IS
	public double getPrice() {
		// #1
		int basePrice = _quantity * _itemPrice;
		double discountFactor;
		
		// #2
		if(basePrice > 1000) discountFactor = 0.95;
		else discountFactor = 0.98;
		return basePrice * discountFactor;
	}

	// TO-BE (my version)
	
	public double getPrice() {
		return discountFactor(basePrice());
	}
	
	private int basePrice() {
		return _quantity * _itemPrice;
	}

	//쓸데 없는 지역 변수는 지양하는 것이 좋다.
	private double discountFactor(int basePrice) {
		if(basePrice > 1000) {
			return basePrice * 0.95;
		}
		else {
			return basePrice * 0.98;
		}
	}*/
	
	// TO-BE (instructor)
	//쓸데 없는 지역 변수는 지양하는 것이 좋다.
	public double getPrice() {
		return discountFactor()*basePrice();
	}
	

	private int basePrice() {
		return _quantity * _itemPrice;
	}

	private double discountFactor() {
		if(basePrice() > 1000) {
			return 0.95;
		}
		else {
			return 0.98;
		}
	}
	
	
	
}
