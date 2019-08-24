package code.refactoring.methodsimple_5;

import java.util.Date;

public class DateRange {
	
	private Date start;
	private Date end;
	
	public DateRange(Date start, Date end) {
		this.start = start;
		this.end = end;
	}
	
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	
	//추가!!! 꼭 복습하자!!
	
//	public boolean chkDate(Entry each) {
//		return each.getDate().equals(getStart()) ||
//				each.getDate().equals(getEnd()) ||
//				(each.getDate().after(getStart()) && each.getDate().before(getEnd()));
//	}  --> 의존성이 심하다!
	
	public boolean chkDate(Date date) {
		return date.equals(getStart()) ||
				date.equals(getEnd()) ||
				(date.after(getStart()) && date.before(getEnd()));
	}


}
