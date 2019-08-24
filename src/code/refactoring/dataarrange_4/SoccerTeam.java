package code.refactoring.dataarrange_4;

public class SoccerTeam {

	 public static void main(String[] args){ 
		 String[] row = new String[3];
		 
		 row[0] = "¸®¹öÇ®";
		 row[1] = "15";
		 
		 String name = row[0];
		 int wins = Integer.parseInt(row[1]);
		 
		 System.out.println("name --> " + name);
		 System.out.println("wins --> " + wins);

	 }
}
