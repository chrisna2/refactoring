package code.refactoring.general_4;

/**
 * �Ϲ�ȭ ó�� 4 : �������̽� ����
 * @author kosta
 *
 */
public class MemberInfoImpl implements IMemberInfo{

	public void searchInform(String name, String phoneNum) {
		System.out.println(name + " ������� ������ ã�ҽ��ϴ�.");
		
	}
	
	public void runService(int memberID, int requestID) {
		System.out.println(memberID + " ���� ��û ���񽺸� �����մϴ�.");
		
	}

}
