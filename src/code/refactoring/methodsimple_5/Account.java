package code.refactoring.methodsimple_5;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Account {
	
	//자바에서는 동적인 길이로 여러 데이터형을 저장하기 위해 Vector 클래스를 제공한다. Vector 클래스는 가변 길이의 배열이라고 할 수 있다.
	Vector _entries = new Vector();
	
	//to-be
	//두 날짜 사이의 계좌입출금 현황을 알아내는 메서드
	double getFlowBetween (DateRange dateRange) {
		double result = 0;
		
		entriesAddElement();
		
		//Enumeration 인터페이스는 객체들의 집합(Vector)에서 각각의 객체들을 한순간에 하나씩 처리할 수 있는 메소드를 제공하는 켈렉션이다.
		Enumeration e = _entries.elements();

		while (e.hasMoreElements()) {
			
			Entry each = (Entry) e.nextElement();
			
			if (dateRange.chkDate(each.getDate())){
				result += each.getValue();
			}
		}
		return result;
	}

	private void entriesAddElement() {
		_entries.addElement(new Entry(10, new Date(2016, 1, 2)));
		_entries.addElement(new Entry(20, new Date(2016, 1, 3)));
		_entries.addElement(new Entry(30, new Date(2016, 1, 4)));
	}

	/*
	//as-is2
	//이것도 분리해서 객체로 빼놓는 다면 파라미터를 하나 더 줄일수 있다.
	private boolean chkDate(DateRange dateRange, Entry each) {
		return each.getDate().equals(dateRange.getStart()) ||
				each.getDate().equals(dateRange.getEnd()) ||
				(each.getDate().after(dateRange.getStart()) && each.getDate().before(dateRange.getEnd()));
	}

	//as-is
	// 두 날짜 사이의 계좌입출금 현황을 알아내는 메서드
	double getFlowBetween (Date start, Date end) {
		double result = 0;
		_entries.addElement(new Entry(10, new Date(2016, 1, 2)));
		_entries.addElement(new Entry(20, new Date(2016, 1, 3)));
		_entries.addElement(new Entry(30, new Date(2016, 1, 4)));
		
		Enumeration e = _entries.elements();

		while (e.hasMoreElements()) {
			Entry each = (Entry) e.nextElement();
			if (each.getDate().equals(start) ||
					each.getDate().equals(end) ||
					(each.getDate().after(start) && each.getDate().before(end)))
			{
				result += each.getValue();
			}
		}
		return result;
	}*/
}
