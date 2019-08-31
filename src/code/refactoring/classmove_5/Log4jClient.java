package code.refactoring.classmove_5;

/**
 * 객체구조화 5 : 국소적 상속 확장 클래스 사용
 * @author kosta
 *
 */
public class Log4jClient {

	public static void main(String[] args) {
		
		//to-be
		//wrapper class 생성
		Log4jWrapper.getInstance();
		Log4jWrapper.info("hello");
		
		/*as-is
		Logger logger = Logger.getLogger("MyLogger");
		logger.removeAllAppenders();
		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %t %m%n"), ConsoleAppender.SYSTEM_OUT));
		logger.info("hello");
		*/
	}
}
