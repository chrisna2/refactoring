package code.refactoring.methodsimple_1;

public class SecurityMonitor {
	
	// 침입자 이름을 알려주고 경고메시지를 보냄
  public void checkSecurity(String[] people) {
	  String[] found = foundMiscreant(people);
	  someLaterCode(found);
  }
	  
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
