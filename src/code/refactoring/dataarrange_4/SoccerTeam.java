package code.refactoring.dataarrange_4;

/**
 * 데이터 구조화 3 : 배열형태의 데이터는  데이터 객체로 전환
 * @author kosta
 *
 */
public class SoccerTeam {

	 public static void main(String[] args){ 
		 
		 //to-be
		 Performence gamePerformence = new Performence();
		 
		 gamePerformence.setTeamName("리버풀");
		 gamePerformence.setWinsGame(15);
		 
		 String name = gamePerformence.getTeamName();
		 int wins = gamePerformence.getWinsGame();
		 
		 System.out.println("name --> " + name);
		 System.out.println("wins --> " + wins);
		 
		 /*as-is
		 String[] row = new String[3];
		 
		 row[0] = "리버풀";
		 row[1] = "15";
		 
		 String name = row[0];
		 int wins = Integer.parseInt(row[1]);
		 
		 System.out.println("name --> " + name);
		 System.out.println("wins --> " + wins);
		 */
	 }
}
