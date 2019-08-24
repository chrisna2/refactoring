package code.refactoring.methodsimple_5;

import java.util.Date;

public class Entry {
	private Date _chargeDate;
	private double _value;
	
	Entry (double value, Date chargeDate) {
		_value = value;
		_chargeDate = chargeDate;
	}
	Date getDate(){
		return _chargeDate;
	}
	double getValue(){
		return _value;
	}
}
