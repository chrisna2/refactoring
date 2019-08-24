package code.refactoring.methodsimple_4;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}
	
	//to-be
	public double getPrice() {
		int basePrice = _quantity * _itemPrice;
		return discountedPice(basePrice);
	}

	private double discountedPice(int basePrice) {
		if (getDiscoutLvl() == 2) {
			return basePrice * 0.1;
		}
		else {
			return basePrice * 0.05;
		}
	}
	
	private int getDiscoutLvl() {
		if (_quantity > 100) {
			return 2;
		}
		else {
			return 1;
		}
		
	}
	
	/*
	//as-is
	public double getPrice() {
		int basePrice = _quantity * _itemPrice;
		int discountLevel;
		
		if (_quantity > 100) discountLevel = 2;
		else discountLevel = 1;
		
		double finalPrice = discountedPice(basePrice, discountLevel);
		
		return finalPrice;
	}

	private double discountedPice(int basePrice, int discountLevel) {
		if (discountLevel == 2) return basePrice * 0.1;
		else return basePrice * 0.05;
	}
	*/
}
