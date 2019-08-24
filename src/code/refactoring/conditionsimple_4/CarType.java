package code.refactoring.conditionsimple_4;

public abstract class CarType {
	
	public static final int COMPACTCAR = 1;
	public static final int SEDANCAR = 2;
	public static final int SPORTCAR = 3;

	//�ٽ� �������� �������� �ڵ��� ���� ������ �س��� ���⼭ Ŭ�����ϰ� �޼��带 ���� ���ư���.
	public static CarType setType(int key) {

		switch(key) {
		case COMPACTCAR :
			// child class�� ���� ����
			return new CompactCar();
			
		case SEDANCAR :
			// child class�� ���� ����
			return new SedanCar();
			
		case SPORTCAR :
			// child class�� ���� ����
			return new SportCar();
			
		default :
			throw new IllegalArgumentException("�߸��� ���� �Է� �ϼ̽��ϴ�. :"+key);
		}
		
	}
	
	//�߻� Ŭ������ ���� �س����� �� : �߻� Ŭ������ �ٵ� ����!
	public abstract int speedUp();

}
