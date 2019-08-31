package code.refactoring.general_4;

/**
 * 일반화 처리 4 : 인터페이스 추출
 * @author kosta
 *
 */
public class MemberInfoImpl implements IMemberInfo{

	public void searchInform(String name, String phoneNum) {
		System.out.println(name + " 사용자의 정보를 찾았습니다.");
		
	}
	
	public void runService(int memberID, int requestID) {
		System.out.println(memberID + " 님의 요청 서비스를 수행합니다.");
		
	}

}
