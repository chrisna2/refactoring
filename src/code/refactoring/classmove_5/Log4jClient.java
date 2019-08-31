package code.refactoring.classmove_5;

/**
 * ��ü����ȭ 5 : ������ ��� Ȯ�� Ŭ���� ���
 * @author kosta
 *
 */
public class Log4jClient {

	public static void main(String[] args) {
		
		//to-be
		//wrapper class ����
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
