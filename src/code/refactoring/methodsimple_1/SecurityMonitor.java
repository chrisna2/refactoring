package code.refactoring.methodsimple_1;

public class SecurityMonitor {

  // ħ���� �̸��� �˷��ְ� ���޽����� ����
  public void checkSecurity(String[] people) {
	  //String[] found = foundMiscreant(people);
	  sendAlert(people);
	  String[] found = foundPerson(people);
	  someLaterCode(found);
  }
  
  // to-be : �ۿ��� �������� �ϳ��ΰ� ������ �ȿ����� �ٸ� ������ ��ħ �ΰ��� ��������
  private void sendAlert(String[] people) {
	  for (int i = 0; i < people.length; i++) {
		  sendAlertMsg();
	  }
  }
  // to-be : �ۿ��� �������� �ϳ��ΰ� ������ �ȿ����� �ٸ� ������ ��ħ �ΰ��� ��������
  private String[] foundPerson(String[] people) {
	  String[] found = new String[people.length];
	  
	  for (int i = 0; i < people.length; i++) {
		  if (people[i].equals ("Don")){
			  found[i] = "Don";
		  }
		  if (people[i].equals ("John")){
			  found[i] = "John";
		  }
	  }
	  return found;
  }

  //as-is
  private String[] foundMiscreant(String[] people){
	  
	  String[] found = new String[people.length];
	  
	  for (int i = 0; i < people.length; i++) {
		  if (people[i].equals ("Don")){
			  sendAlertMsg();
			  found[i] = "Don";
		  }
		  if (people[i].equals ("John")){
			  sendAlertMsg();
			  found[i] = "John";
		  }
	  }
	  return found;
  }
  
  private void sendAlertMsg(){
	  System.out.println( "Alert" );	 
  }

  private void someLaterCode(String[] found) {
	  for (int i=0; i < found.length ; i++) {
		  System.out.println( "People --> " + found[i] );
	  }
  }

}
