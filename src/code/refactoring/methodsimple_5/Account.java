package code.refactoring.methodsimple_5;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Account {
	
	//�ڹٿ����� ������ ���̷� ���� ���������� �����ϱ� ���� Vector Ŭ������ �����Ѵ�. Vector Ŭ������ ���� ������ �迭�̶�� �� �� �ִ�.
	Vector _entries = new Vector();
	
	//to-be
	//�� ��¥ ������ ��������� ��Ȳ�� �˾Ƴ��� �޼���
	double getFlowBetween (DateRange dateRange) {
		double result = 0;
		
		entriesAddElement();
		
		//Enumeration �������̽��� ��ü���� ����(Vector)���� ������ ��ü���� �Ѽ����� �ϳ��� ó���� �� �ִ� �޼ҵ带 �����ϴ� �̷����̴�.
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
	//�̰͵� �и��ؼ� ��ü�� ������ �ٸ� �Ķ���͸� �ϳ� �� ���ϼ� �ִ�.
	private boolean chkDate(DateRange dateRange, Entry each) {
		return each.getDate().equals(dateRange.getStart()) ||
				each.getDate().equals(dateRange.getEnd()) ||
				(each.getDate().after(dateRange.getStart()) && each.getDate().before(dateRange.getEnd()));
	}

	//as-is
	// �� ��¥ ������ ��������� ��Ȳ�� �˾Ƴ��� �޼���
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
