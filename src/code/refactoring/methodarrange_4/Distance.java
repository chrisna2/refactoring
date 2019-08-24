package code.refactoring.methodarrange_4;

public class Distance {

	private int _primaryForce = 10;
	private int _secondaryForce = 20;
	private int _mass = 3; 
	private int _delay = 1;
	
	//to-be
	// 매서드 정리 : 하나의 변수에 여러개의 용도로 사용하지 마라
	public double getDistanceTravelled (int time) {
		
		double result;
		
		//첫번째 변수 : final로 설정 하면 해당 변수에 다른 값을 셋팅할 수 없다.
		final double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		
		int secondaryTime = time - _delay;
		
		if (secondaryTime > 0) {
			double primaryVel = primaryAcc * _delay;
			//두번째 변수
			final double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
		}
		
		return result;
	}	
	
	/*
	//as-is
	public double getDistanceTravelled (int time) {
		
		double result;
		double acc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * acc * primaryTime * primaryTime;
		
		int secondaryTime = time - _delay;
		if (secondaryTime > 0) {
			double primaryVel = acc * _delay;
			acc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
		}
		return result;
	}
	 */
	
}

