package code.refactoring.classmove_5;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

//TO-BE
//복잡한 외부라이브러리에 접근하는 부분을 최소화 시키는 것
//외부에서 직접 접근하는 것보다 이렇게 wrapper 클레스를 만들어 접근하게 하는 것이 외부라이브러리와 클래스간에 영향도 최소화 시킴
public class Log4jWrapper {
	
	public static Log4jWrapper _instance;
	public static Logger logger;
	
	
	public static void getInstance() {
		if(_instance == null) {
			_instance = new Log4jWrapper();
		}
	}
	
	public Log4jWrapper() {
		logger = Logger.getLogger("MyLogger");
		logger.removeAllAppenders();
		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n"), ConsoleAppender.SYSTEM_OUT));
		
	}

	public static void info(String string) {
		logger.info(string);
	}
	
	
}
