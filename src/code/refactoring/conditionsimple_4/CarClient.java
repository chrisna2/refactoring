package code.refactoring.conditionsimple_4;

import java.util.Scanner;

public class CarClient {
	
	/*
	//as-is
	public static final int COMPACTCAR = 1;
	public static final int SEDANCAR = 2;
	public static final int SPORTCAR = 3;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		int currentSpeed = 0; 
		  
		switch(key) {
		case COMPACTCAR :
			currentSpeed = currentSpeed + 10;
			System.out.println("경차가 선택되었습니다.");
			break;
		case SEDANCAR :
			currentSpeed = currentSpeed + 20;
			System.out.println("중형차가 선택되었습니다.");
			break;
		case SPORTCAR :
			currentSpeed = currentSpeed + 30;
			System.out.println("스포츠카가 선택되었습니다.");
			break;
		}
		
		System.out.println("선택한 자동차의 현재속도는 "+currentSpeed+ " 입니다.");
	}
	*/
	
	//개발자는 이러한 스위치 문이 기~~일어 지는 것을 너무 너무 싫어한다.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		CarType carType = null;
		
		int key = input.nextInt();
		
		// 1.setting
		carType = CarType.setType(key);
		
		// 2.공통메서드 : speedUp()
		int currentSpeed = carType.speedUp();
		 
		//앞으로의 코딩은 먼저 선언을 해놓고 여기서 클래스하고 메서드를 만들어서 나아간다.
		System.out.println("선택한 자동차의 현재속도는 "+currentSpeed+ " 입니다.");
	}
	
	
}
