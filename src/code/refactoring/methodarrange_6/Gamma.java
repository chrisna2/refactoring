package code.refactoring.methodarrange_6;

//TO-BE
/**
 * 생성자를 통해 해당 로직 이동
 * @author kosta
 *
 */
public class Gamma {
	
	//멤버변수 선언
	private int inputVal;
	private int quantity;
	private int yearToDate;
	private  Account account;
	
	//생성자 정의
	public Gamma(int inputVal, int quantity, int yearToDate, Account account) {
		this.inputVal = inputVal;
		this.quantity = quantity;
		this.yearToDate = yearToDate;
		this.account = account;
	}
	
	//필요 메서드 생성 
	public int compute() {
	
		int importantValue1 = (inputVal * quantity) + account.delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		
		if ((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}

		int importantValue3 = importantValue2 * 7;
		
		//  중략...		
		
		return importantValue3 -2 * importantValue1;
	}
	
}
