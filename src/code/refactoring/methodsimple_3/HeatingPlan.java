package code.refactoring.methodsimple_3;

public class HeatingPlan {
	private TempRange _range = new TempRange();
	
	//to-be
	boolean withinRange (TempRange roomRage) {
	    return (roomRage.getLow() >= _range.getLow() && roomRage.getHigh() <= _range.getHigh());
	}
	
	/*
	//as-is
	boolean withinRange (int low, int high) {
	    return (low >= _range.getLow() && high <= _range.getHigh());
	}
	*/
}
