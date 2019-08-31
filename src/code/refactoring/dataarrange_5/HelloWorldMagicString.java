package code.refactoring.dataarrange_5;

/*
 * 데이터 구조화 6 : 하드 코딩된 값의 전환
 * 1) 상수로 선언 의미있는 명칭 부여
 * 2) 프로그램과 분리 
 * 	-IP
 * 	-ID/PW
 * 	-디렉토리 경로
 * 	... 등등   => config 설정 파일에 해당 기록을 설정해야 함
 * 			=> 업무 규칙화가 가능하면 DB테이블에 값을 저장
 * 3) 기본적인 원칙은 하드코딩은 하지말고 코드와 분리한다. 그리고 필요한 값들은 항상 입력 받는다.
 * 
 */
public class HelloWorldMagicString {
	
	//하드 코딩 된 부분은 상수로 분리 final 붙여서 값이 변경되지 못하게 막음
	private static final String FIRST_WORD = "Hello";
	private static final String SECOND_WORD = "World";
	
    public static void main(String[] args) {
    	//as-is : 이렇게 하면 재사용성이 전혀 없다.
        //System.out.println("Hello World");
    	
    	//구상
    	MakeSentence makeSntce = new MakeSentence(FIRST_WORD, SECOND_WORD);
    	makeSntce.print();

    }

}
