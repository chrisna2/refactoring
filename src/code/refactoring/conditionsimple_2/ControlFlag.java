package code.refactoring.conditionsimple_2;

public class ControlFlag {
	
	/*생략합니다. 집에서 해볼것*/
	public ControlFlag() {}
	
	public void checkSecurity(String[] people) {
		String found = "";
		for (int i = 0; i < people.length; i++) {
			if (found.equals("")) {
				if (people[i].equals("Don")) {
					sendAlert(people[i]);
					found = "Don";
				}
				if (people[i].equals("John")) {
					sendAlert(people[i]);
					found = "John";
				}
			}
		}
	
	}

	private void sendAlert(String user) {
		System.out.println(user + " Access Permitted!!");
		
	}

}
