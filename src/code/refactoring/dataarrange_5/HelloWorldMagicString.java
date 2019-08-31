package code.refactoring.dataarrange_5;

/*
 * ������ ����ȭ 6 : �ϵ� �ڵ��� ���� ��ȯ
 * 1) ����� ���� �ǹ��ִ� ��Ī �ο�
 * 2) ���α׷��� �и� 
 * 	-IP
 * 	-ID/PW
 * 	-���丮 ���
 * 	... ���   => config ���� ���Ͽ� �ش� ����� �����ؾ� ��
 * 			=> ���� ��Ģȭ�� �����ϸ� DB���̺� ���� ����
 * 3) �⺻���� ��Ģ�� �ϵ��ڵ��� �������� �ڵ�� �и��Ѵ�. �׸��� �ʿ��� ������ �׻� �Է� �޴´�.
 * 
 */
public class HelloWorldMagicString {
	
	//�ϵ� �ڵ� �� �κ��� ����� �и� final �ٿ��� ���� ������� ���ϰ� ����
	private static final String FIRST_WORD = "Hello";
	private static final String SECOND_WORD = "World";
	
    public static void main(String[] args) {
    	//as-is : �̷��� �ϸ� ���뼺�� ���� ����.
        //System.out.println("Hello World");
    	
    	//����
    	MakeSentence makeSntce = new MakeSentence(FIRST_WORD, SECOND_WORD);
    	makeSntce.print();

    }

}
