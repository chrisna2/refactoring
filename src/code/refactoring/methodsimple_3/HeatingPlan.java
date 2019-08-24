package code.refactoring.methodsimple_3;

public class HeatingPlan {
	private TempRange _range = new TempRange();
		
	boolean withinRange (int low, int high) {
	    return (low >= _range.getLow() && high <= _range.getHigh());
	}
}
