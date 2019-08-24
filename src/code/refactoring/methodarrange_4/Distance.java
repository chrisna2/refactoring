package code.refactoring.methodarrange_4;

public class Distance {

	private int _primaryForce = 10;
	private int _secondaryForce = 20;
	private int _mass = 3; 
	private int _delay = 1;
	
	//to-be
	// �ż��� ���� : �ϳ��� ������ �������� �뵵�� ������� ����
	public double getDistanceTravelled (int time) {
		
		double result;
		
		//ù��° ���� : final�� ���� �ϸ� �ش� ������ �ٸ� ���� ������ �� ����.
		final double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		
		int secondaryTime = time - _delay;
		
		if (secondaryTime > 0) {
			double primaryVel = primaryAcc * _delay;
			//�ι�° ����
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

