package code.refactoring.methodarrange_3;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}

	/*
	// as-is
	public double price() {
		//결제액(price) = 총구매액(base price) - 대량구매할인(discount) + 배송비(shipping)
		return _quantity * _itemPrice - 
				Math.max(0,  _quantity - 500) * _itemPrice * 0.05 + 
				Math.min(_quantity * _itemPrice * 0.1,  1000.0);
	}
	*/
	
	// to-be
	// 매서드 정리 : 직관적 임시 변수 사용 : 사용된 수식이 복잡할 때 수식의 결과, 일부를 임시변수로 처리한다.
	public double price() {
		//결제액(price) = 총구매액(base price) - 대량구매할인(discount) + 배송비(shipping)
		
		//범위지정 > refactor > extract local variable
		int basePrice = _quantity * _itemPrice;
		double discount = Math.max(0,  _quantity - 500) * _itemPrice * 0.05;
		double shipping = Math.min(basePrice * 0.1,  1000.0);
		
		return basePrice - discount + shipping;
	}
	
	
	
}
