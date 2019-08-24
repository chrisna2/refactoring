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
			System.out.println("������ ���õǾ����ϴ�.");
			break;
		case SEDANCAR :
			currentSpeed = currentSpeed + 20;
			System.out.println("�������� ���õǾ����ϴ�.");
			break;
		case SPORTCAR :
			currentSpeed = currentSpeed + 30;
			System.out.println("������ī�� ���õǾ����ϴ�.");
			break;
		}
		
		System.out.println("������ �ڵ����� ����ӵ��� "+currentSpeed+ " �Դϴ�.");
	}
	*/
	
	//�����ڴ� �̷��� ����ġ ���� ��~~�Ͼ� ���� ���� �ʹ� �ʹ� �Ⱦ��Ѵ�.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		CarType carType = null;
		
		int key = input.nextInt();
		
		// 1.setting
		carType = CarType.setType(key);
		
		// 2.����޼��� : speedUp()
		int currentSpeed = carType.speedUp();
		 
		//�������� �ڵ��� ���� ������ �س��� ���⼭ Ŭ�����ϰ� �޼��带 ���� ���ư���.
		System.out.println("������ �ڵ����� ����ӵ��� "+currentSpeed+ " �Դϴ�.");
	}
	
	
}
