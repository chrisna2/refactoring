package code.refactoring.conditionsimple_3;

public class Capital {
	
	private static final double ADJ_FACTOR = 1.2;
	private double _capital = 100;
	private double _intRate = 0.3;
	private double _duration = 12;

	public Capital () {}
	
	public double getAdjustedCapital(double _income) {
		double result = 0.0;
		if (_capital > 0.0) {
			if (_intRate > 0.0 && _duration > 0.0) {
				result = (_income / _duration) * ADJ_FACTOR;
			}
		}
		
		return result;
	}
	
	

}
