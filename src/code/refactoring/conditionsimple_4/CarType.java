package code.refactoring.conditionsimple_4;

public abstract class CarType {
	
	public static final int COMPACTCAR = 1;
	public static final int SEDANCAR = 2;
	public static final int SPORTCAR = 3;

	//다시 말하지만 앞으로의 코딩은 먼저 선언을 해놓고 여기서 클래스하고 메서드를 만들어서 나아간다.
	public static CarType setType(int key) {

		switch(key) {
		case COMPACTCAR :
			// child class로 로직 변경
			return new CompactCar();
			
		case SEDANCAR :
			// child class로 로직 변경
			return new SedanCar();
			
		case SPORTCAR :
			// child class로 로직 변경
			return new SportCar();
			
		default :
			throw new IllegalArgumentException("잘못된 값을 입력 하셨습니다. :"+key);
		}
		
	}
	
	//추상 클래스로 선언만 해놓으면 됨 : 추상 클래스는 바디가 없음!
	public abstract int speedUp();

}
