package code.refactoring.general_4;

/**
 * �Ϲ�ȭ ó�� 4 : �������̽� ����
 * @author kosta
 *
 */
public class MemberInfoTest {

	public static void main(String[] args) {
		
		//as-is
		//MemberInfoImpl memberInfo = new MemberInfoImpl();
		
		//to-be : �������̼� ��ó�� ����, ����ȿ��
		IMemberInfo memberInfo = new MemberInfoImpl();
		
		//���⵵ ����
		memberInfo.searchInform("ȫ���", "010-1234-5678");
		memberInfo.runService(11, 100);		
	}
}
