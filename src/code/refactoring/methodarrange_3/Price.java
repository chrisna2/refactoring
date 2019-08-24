package code.refactoring.methodarrange_3;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}

	public double price() {
		//결제액(price) = 총구매액(base price) - 대량구매할인(discount) + 배송비(shipping)
		return _quantity * _itemPrice - 
				Math.max(0,  _quantity - 500) * _itemPrice * 0.05 + 
				Math.min(_quantity * _itemPrice * 0.1,  1000.0);
	}

}
