package code.refactoring.methodarrange_1;

import java.util.Enumeration;
import java.util.Vector;

public class Owe {
	
	private String _name ;
	private Vector _orders = new Vector();
	
    public Owe(String _name){
 		   this._name=_name;
    }
   
    public void addOrder(Order arg) {
	   _orders.addElement(arg);
    }
	
	public void printOwing(double previousAmount) {

	    double outstanding = previousAmount*1.2;
	    
	    // 역활0 : 프린팅
	    printBanner();

	    // 역활1 : 외상액 계산
	    outstanding = getOutStanding(outstanding);

	    // 역활2 :  세부내역 출력
	    printDtlInfo(outstanding);

	}

	//이클립스 리펙토링 기능 : 분리할 메소드 로직 드래그 > refactor > extract Method
	private void printBanner() {
		System.out.println("************************");
	    System.out.println("*******고객 외상*******");
	    System.out.println("************************");
	}
	
	//단축키 : alt + shift + m
	private double getOutStanding(double outstanding) {
		/* <!> 고려대상 발생 : Enumeration e 해당 변수는 getOutStanding()메서드에서만 사용하기 때문에
		 * 이 부분은 내부 메서드로  전환시키는게 좋다.
		 */
		Enumeration e = _orders.elements();
		
		while(e.hasMoreElements()) {
			Order each = (Order)e.nextElement();
			outstanding += each.getAmount();
		}
		return outstanding;
	}
	
	//항상 메인 로직의 순서대로 정리
	private void printDtlInfo(double outstanding) {
		System.out.println("name: " + _name);
	    System.out.println("amount: " + outstanding);
	}

	
	/* 
	//as-is
	public void printOwing(double previousAmount) {

	    Enumeration e = _orders.elements();
	    double outstanding = previousAmount*1.2;
	    System.out.println("************************");
	    System.out.println("*******고객 외상*******");
	    System.out.println("************************");

	    // 외상액 계산
	    while(e.hasMoreElements()) {
	        Order each = (Order)e.nextElement();
	        outstanding += each.getAmount();
	    }

	    // 세부내역 출력
	    System.out.println("name: " + _name);
	    System.out.println("amount: " + outstanding);

	}
	 */
	
	
}
