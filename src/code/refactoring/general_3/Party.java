package code.refactoring.general_3;

public abstract class Party {

	private String _name;
	//�Ծ� �����
	protected abstract int getAnnualCost();
	
	//������
	public Party(String _name) {
		this._name = _name;
	}
	
	//�ʿ� �޼���
	public String getName() {
		return _name;
	}

}
