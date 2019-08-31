package code.refactoring.methodarrange_6;

/**
 * 
 * @author kosta
 *
 */
public class Account {
	
	public Account() {

	}
	
	//TO-BE
	public int gamma (int inputVal, int quantity, int yearToDate) {
		
		Gamma gamma = new Gamma(inputVal, quantity, yearToDate, this);
		
		return gamma.compute();
		
	}

	public int delta() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	//as-is
	/*
	public int gamma (int inputVal, int quantity, int yearToDate) {
		
		int importantValue1 = (inputVal * quantity) + delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		
		if ((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}

		int importantValue3 = importantValue2 * 7;
		
		//  Áß·«...		
		
		return importantValue3 -2 * importantValue1;
		
	}
	
	private int delta() {
		// TODO Auto-generated method stub
		return 0;
	}*/
}

