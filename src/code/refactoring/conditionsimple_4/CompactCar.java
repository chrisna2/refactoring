package code.refactoring.conditionsimple_4;

public class CompactCar extends CarType {

	@Override
	public int speedUp() {
		int currentSpeed = 10;
		System.out.println("경차가 선택되었습니다.");
		return currentSpeed;
	}

}
