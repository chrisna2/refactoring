package code.refactoring.methodsimple_1;

public class SecurityMonitorTest {
	public static void main(String[] args) { 
    
		SecurityMonitor sMonitor = new SecurityMonitor();
		String[] people={"Don", "John"};
		sMonitor.checkSecurity( people );	    
	} 	
}
