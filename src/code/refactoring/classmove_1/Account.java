package code.refactoring.classmove_1;

/**
 * ��ü ����ȭ
 * �޼��� �̵� : �޼��尡 �ٸ� Ŭ������ ��� ������ �� ����� �� �ٸ� Ŭ������ �̵��Ѵ�.
 * 
 * @author chrisna2
 *
 */
public class Account {
	
	//to-be
	private AccountType _type = new AccountType();
	private int _daysOverdrawn;
	
	public Account(int daysOverdrawn) {
		this._daysOverdrawn = daysOverdrawn;

	}
	
	//�׽�Ʈ �ڵ�(�ܺ�)���� ����� �ǹǷ� : �������̼� ó���� ���ش�
	public double overdraftCharge() {
		// �̷��� ���ٸ� ���ְ� �ٸ� �޼��带 ȣ�� �ϴ� �ڵ���� �ִµ� ���� deligation ó����� �Ѵ�.
		return _type.overdraftCharge(_daysOverdrawn);
	}
	
	double bankCharge() {
		double result = 4.5;
		if(_daysOverdrawn > 0) {
			result += _type.overdraftCharge(_daysOverdrawn);
		}
		return result;	
	}
	
	/* AS-IS
	private AccountType _type = new AccountType();
	private int _daysOverdrawn;
	
	public Account(int daysOverdrawn) {
		this._daysOverdrawn = daysOverdrawn;

	}
	
	public double overdraftCharge() {
		
		if (_type.isPremium()) {
			double result = 10;
			if(_daysOverdrawn > 7) result += (_daysOverdrawn - 7) *0.85;
				return result;			
		}
		else return _daysOverdrawn * 1.75;
	}
	
	double bankCharge() {
		double result = 4.5;
		if(_daysOverdrawn > 0) result += overdraftCharge();
		return result;	
	}
	*/
}
