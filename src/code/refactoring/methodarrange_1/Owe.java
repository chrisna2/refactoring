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
	
}
