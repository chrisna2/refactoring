package code.refactoring.general_3;

public abstract class Party {

	private String _name;
	//규약 만들기
	protected abstract int getAnnualCost();
	
	//생성자
	public Party(String _name) {
		this._name = _name;
	}
	
	//필요 메서드
	public String getName() {
		return _name;
	}

}
