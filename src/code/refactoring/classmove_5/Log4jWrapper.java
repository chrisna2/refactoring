package code.refactoring.classmove_5;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

//TO-BE
//������ �ܺζ��̺귯���� �����ϴ� �κ��� �ּ�ȭ ��Ű�� ��
//�ܺο��� ���� �����ϴ� �ͺ��� �̷��� wrapper Ŭ������ ����� �����ϰ� �ϴ� ���� �ܺζ��̺귯���� Ŭ�������� ���⵵ �ּ�ȭ ��Ŵ
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
