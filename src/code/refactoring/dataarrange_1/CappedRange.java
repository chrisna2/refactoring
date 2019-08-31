package code.refactoring.dataarrange_1;

public class CappedRange extends IntRange{
	
	private int _cap;

	CappedRange(int low, int high, int cap) {
		super(low, high);
		
		this._cap = cap;
	}
	
	@Override
	public int getHigh() {
		return Math.min(super.getHigh(), getCap());
	}

	private int getCap() {
		
		return 0;
	}
	
	
}
