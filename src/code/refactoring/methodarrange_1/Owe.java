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
	    
	    // ��Ȱ0 : ������
	    printBanner();

	    // ��Ȱ1 : �ܻ�� ���
	    outstanding = getOutStanding(outstanding);

	    // ��Ȱ2 :  ���γ��� ���
	    printDtlInfo(outstanding);

	}

	//��Ŭ���� �����丵 ��� : �и��� �޼ҵ� ���� �巡�� > refactor > extract Method
	private void printBanner() {
		System.out.println("************************");
	    System.out.println("*******�� �ܻ�*******");
	    System.out.println("************************");
	}
	
	//����Ű : alt + shift + m
	private double getOutStanding(double outstanding) {
		/* <!> ������ �߻� : Enumeration e �ش� ������ getOutStanding()�޼��忡���� ����ϱ� ������
		 * �� �κ��� ���� �޼����  ��ȯ��Ű�°� ����.
		 */
		Enumeration e = _orders.elements();
		
		while(e.hasMoreElements()) {
			Order each = (Order)e.nextElement();
			outstanding += each.getAmount();
		}
		return outstanding;
	}
	
	//�׻� ���� ������ ������� ����
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
	    System.out.println("*******�� �ܻ�*******");
	    System.out.println("************************");

	    // �ܻ�� ���
	    while(e.hasMoreElements()) {
	        Order each = (Order)e.nextElement();
	        outstanding += each.getAmount();
	    }

	    // ���γ��� ���
	    System.out.println("name: " + _name);
	    System.out.println("amount: " + outstanding);

	}
	 */
	
	
}
