package code.refactoring.dataarrange_4;

/**
 * ������ ����ȭ 3 : �迭������ �����ʹ�  ������ ��ü�� ��ȯ
 * @author kosta
 *
 */
public class SoccerTeam {

	 public static void main(String[] args){ 
		 
		 //to-be
		 Performence gamePerformence = new Performence();
		 
		 gamePerformence.setTeamName("����Ǯ");
		 gamePerformence.setWinsGame(15);
		 
		 String name = gamePerformence.getTeamName();
		 int wins = gamePerformence.getWinsGame();
		 
		 System.out.println("name --> " + name);
		 System.out.println("wins --> " + wins);
		 
		 /*as-is
		 String[] row = new String[3];
		 
		 row[0] = "����Ǯ";
		 row[1] = "15";
		 
		 String name = row[0];
		 int wins = Integer.parseInt(row[1]);
		 
		 System.out.println("name --> " + name);
		 System.out.println("wins --> " + wins);
		 */
	 }
}
