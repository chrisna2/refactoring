package code.refactoring.complex_1;

/**
 * �� Ŭ������ ����ڰ� ������ �ִ� ������ �Ҽ��� �����Ѵ�. ���� �˰����� ��������׽��� ü��.
 * <P>
 * �������׳׽� : ����� 276�⿡ ����� Ű���׿��� ���, ����� 194�� ���
 * ���� �ѷ��� ���ʷ� ����� ������� �޷¿� ������ ������ ���
 * �˷���帮�� ���������� ����
 * <P>
 * �˰����� ����� �ܼ��ϴ�. 2���� �����ϴ� ���� �迭�� �������
 * 2�� ����� ��� �����Ѵ�. ������ ���� ������ ã�� �� ������ ����� ��� �����.
 * �ִ� ���� �������� �� ������ �̸� �ݺ��Ѵ�.
 * 
 * @author Bob
 * @version 2012.02.13
 *
 */
public class GeneratePrimes {
	/*
	//as-is
	public int getPrimes(int maxValue) {
		
		int primesCount=0;
	    		
		if (maxValue >= 2) { //�����ϰ� ��ȿ�� ���
			// ����
			boolean[] crossedOut = new boolean[maxValue + 1];
			int i;
			
			// �迭�� ������ �ʰ�ȸ
			for (i=0; i<crossedOut.length; i++) 
			    crossedOut[i] = true;
			// �Ҽ��� �ƴ� �˷��� ���ڸ� ����
			crossedOut[0] = crossedOut[1]= false;
			
			int j;
			
			for(i=2; i<Math.sqrt(crossedOut.length)+1; i++) {
				if(crossedOut[i]) {	// i�� �����ִ� ���ڶ�� �� ������ ����� ���Ѵ�.
					for (j=2*i; j<crossedOut.length; j+=i) {
					    crossedOut[j] = false; // ����� �Ҽ��� �ƴϴ�.
					}
				}
			}
			
			//�ҽ� ������?
			for (i=0; i<crossedOut.length; i++) {
				if (crossedOut[i]) {
					primesCount++; //ī��Ʈ ����
				}
			}
			
			int[] primes = new int[primesCount];
			
			
			
			//�Ҽ��� ��� �迭�� �̵��Ѵ�.
			for(i=0, j=0; i<crossedOut.length; i++) {
				if (crossedOut[i])	// �Ҽ��ϰ�쿡
					primes[j++] = i;
			}
			
			
			System.out.println("primes ���� " + primes.length + "�� �Դϴ�.");
		}
		else	// maxValue < 2
		    System.out.println("primes ���� 0 �� �Դϴ�.");
		
		return primesCount;
	}
	*/
	
	private boolean[] crossedOut;
	int[] primesCnt;
	
	public int getPrimes(int maxValue) {
		
		int primesCount=0;
		
		if (maxValue >= 2) { //�����ϰ� ��ȿ�� ���
			
			// �� �κ��� 3�ٷ� �ٲܰ�!
			// �迭�� ������ �ʰ�ȸ
			initArray(maxValue);
			primesCount = checkPrime();
			putParamRslt();
			
			System.out.println("primes ���� " + primesCnt.length + "�� �Դϴ�.");
		}
		else	
		    System.out.println("primes ���� 0 �� �Դϴ�.");
		
		return primesCount;
	}

	private void putParamRslt() {
		int i;
		int j;
		//�Ҽ��� ��� �迭�� �̵��Ѵ�.
		for(i=0, j=0; i<crossedOut.length; i++) {
			if (crossedOut[i])	// �Ҽ��ϰ�쿡
				primesCnt[j++] = i;
		}
	}

	private int checkPrime() {
		int i;
		int primesCount = 0;
		//�ҽ� ������?
		for (i=0; i<crossedOut.length; i++) {
			if (crossedOut[i]) {
				primesCount++; //ī��Ʈ ����
			}
		}
		primesCnt = new int[primesCount];
		
		return primesCount;
	}

	private void initArray(int maxValue) {
		
		int i;
		int j;

		crossedOut = new boolean[maxValue + 1];
		
		for (i=0; i<crossedOut.length; i++) 
		    crossedOut[i] = true;
		// �Ҽ��� �ƴ� �˷��� ���ڸ� ����
		crossedOut[0] = crossedOut[1]= false;
		
		for(i=2; i<Math.sqrt(crossedOut.length)+1; i++) {
			if(crossedOut[i]) {	// i�� �����ִ� ���ڶ�� �� ������ ����� ���Ѵ�.
				for (j=2*i; j<crossedOut.length; j+=i) {
				    crossedOut[j] = false; // ����� �Ҽ��� �ƴϴ�.
				}
			}
		}
	}
}
