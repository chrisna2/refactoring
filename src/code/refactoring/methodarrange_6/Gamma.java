package code.refactoring.methodarrange_6;

//TO-BE
/**
 * �����ڸ� ���� �ش� ���� �̵�
 * @author kosta
 *
 */
public class Gamma {
	
	//������� ����
	private int inputVal;
	private int quantity;
	private int yearToDate;
	private  Account account;
	
	//������ ����
	public Gamma(int inputVal, int quantity, int yearToDate, Account account) {
		this.inputVal = inputVal;
		this.quantity = quantity;
		this.yearToDate = yearToDate;
		this.account = account;
	}
	
	//�ʿ� �޼��� ���� 
	public int compute() {
	
		int importantValue1 = (inputVal * quantity) + account.delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		
		if ((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}

		int importantValue3 = importantValue2 * 7;
		
		//  �߷�...		
		
		return importantValue3 -2 * importantValue1;
	}
	
}
