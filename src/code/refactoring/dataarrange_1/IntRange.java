package code.refactoring.dataarrange_1;

public class IntRange {

	private int _low, _high;
	
    IntRange (int low, int high) {
        _low = low;
        _high = high;
    }

    boolean includes (int arg) {
        return arg >= _low && arg <= _high;
    }

    void grow(int factor) {
    	_high = _high * factor;
    }

	public int getHigh() {
		return _high;
	}
}
