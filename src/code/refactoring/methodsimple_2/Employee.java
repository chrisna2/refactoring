package code.refactoring.methodsimple_2;

public class Employee {

	private double salary=100;

	//to-be : 각각에 메서드로 분리되어 합친다음 고정된 값을 직접 입력하도록 하여 유연성을 높여라
	public void percentRaise(double factor) {
		salary = salary * (1+factor);
		System.out.println("PercentRaise --> " + salary );
	}
	
	//as-is
	void tenPercentRaise () {
		salary *= 1.1;
		System.out.println("tenPercentRaise --> " + salary );
	}
	
	//as-is
	void fivePercentRaise () {
		salary *= 1.05;
		System.out.println("fivePercentRaise --> " + salary );
	}
	
	double baseCharge() {
		
		double result = Math.min(lastUsage(), 100) * 0.03;
		if (lastUsage() > 100) {
			result += (Math.min(lastUsage(), 200)-100) * 0.05;
		}
		if (lastUsage() > 200) {
			result += (lastUsage()-200) * 0.07;
		}
		
		System.out.println("result --> " + result );
		return result;
	}

	private int lastUsage() {
		return 300;
	}

}
