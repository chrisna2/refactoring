package code.refactoring.conditionsimple_3;

public class Capital {
	
	private static final double ADJ_FACTOR = 1.2;
	private double _capital = 100;
	private double _intRate = 0.3;
	private double _duration = 12;

	public Capital () {}
	
	/*
	//as-is
	public double getAdjustedCapital(double _income) {
		double result = 0.0;
		if (_capital > 0.0) {
			if (_intRate > 0.0 && _duration > 0.0) {
				result = (_income / _duration) * ADJ_FACTOR;
			}
		}
		
		return result;
	}
	*/
	
	
	//to-be : 감시절 if 문
	public double getAdjustedCapital(double _income) {
		double result = 0.0;
		
		if (_capital <= 0.0) {
			return result;
		}
		if (_intRate <= 0.0 || _duration <= 0.0) {
			return result;
		}
		return getOutRslt(_income);
	}

	private double getOutRslt(double _income) {
		return (_income / _duration) * ADJ_FACTOR;
	}

}
