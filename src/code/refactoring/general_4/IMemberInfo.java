package code.refactoring.general_4;

/**
 * 일반화 처리 4 : 인터페이스 추출
 * @author kosta
 *
 */
public interface IMemberInfo {

	public void searchInform(String name, String phoneNum);
	public void runService(int memberID, int requestID);

}
