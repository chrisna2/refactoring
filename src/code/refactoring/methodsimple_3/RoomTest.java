package code.refactoring.methodsimple_3;

public class RoomTest {
	public static void main(String[] args) { 
		 
		Room room=new Room();
		HeatingPlan plan=new HeatingPlan();
		System.out.println("room.withinPlan(plan) --> " + room.withinPlan(plan));
    }
}
