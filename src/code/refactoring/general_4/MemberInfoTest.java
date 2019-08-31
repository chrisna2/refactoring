package code.refactoring.general_4;

/**
 * 일반화 처리 4 : 인터페이스 추출
 * @author kosta
 *
 */
public class MemberInfoTest {

	public static void main(String[] args) {
		
		//as-is
		//MemberInfoImpl memberInfo = new MemberInfoImpl();
		
		//to-be : 인터페이서 거처서 참조, 완충효과
		IMemberInfo memberInfo = new MemberInfoImpl();
		
		//영향도 감소
		memberInfo.searchInform("홍사원", "010-1234-5678");
		memberInfo.runService(11, 100);		
	}
}
