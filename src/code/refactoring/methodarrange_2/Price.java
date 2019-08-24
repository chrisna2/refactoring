package code.refactoring.methodarrange_2;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}

	public double getPrice() {
		int basePrice = _quantity * _itemPrice;
		double discountFactor;
		
		if(basePrice > 1000) discountFactor = 0.95;
		else discountFactor = 0.98;
		return basePrice * discountFactor;
	}

}
