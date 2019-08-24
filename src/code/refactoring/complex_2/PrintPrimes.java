package code.refactoring.complex_2;

public class PrintPrimes {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 1000;		// ����� �ҽ�����
		final int ROWS_PER_PAGE = 50;		// �������� Rows
		final int COLUMNS_PER_PAGE = 4;		// �������� Columns
		final int WW = 10;
		final int ORDMAX = 30;
		int P[] = new int[NUMBER_OF_PRIMES+1];
		int PAGENUMBER;
		int PAGEOFFSET;
		int ROWOFFSET;
		int C;
		int J = 1;
		int K = 1;
		boolean JPRIME;
		int ORD = 2;
		int SQUARE = 9;
		int N;
		int MULT[] = new int[ORDMAX+1];
		P[1] = 2;
		
		while(K < NUMBER_OF_PRIMES) {	// �Ҽ� Max �������� �ݺ�
			do {
				J = J+2;
				if(J==SQUARE) {
					ORD = ORD + 1;
					SQUARE = P[ORD] * P[ORD];
					MULT[ORD-1] = J;
				}
				N = 2;
				JPRIME = true;
				while(N<ORD && JPRIME) {
					while (MULT[N] < J)
						MULT[N] = MULT[N] + P[N] + P[N];
					if (MULT[N]==J)
						JPRIME = false;
					N = N + 1;
				}
			} while(!JPRIME);
			K = K + 1;
			P[K] = J;
		}
		
		// RowColumnPagePrinter
		{
			PAGENUMBER = 1;
			PAGEOFFSET = 1;
			while(PAGEOFFSET <= NUMBER_OF_PRIMES) {
				System.out.println("The First" + NUMBER_OF_PRIMES + "Prime Numbers --- Page " + PAGENUMBER);  //������ ��� (����ɼ� �����Ƿ� Input�� �޾ƾ���
				System.out.println("");
				// ���������� ����Ʈ
				for(ROWOFFSET = PAGEOFFSET; ROWOFFSET < PAGEOFFSET + ROWS_PER_PAGE; ROWOFFSET++) {
					for(C=0; C < COLUMNS_PER_PAGE; C++)
						if (ROWOFFSET + C * ROWS_PER_PAGE <= NUMBER_OF_PRIMES)
							System.out.format("%10d", P[ROWOFFSET + C * ROWS_PER_PAGE]);
					System.out.println("");
				}
				System.out.println("\f");
				PAGENUMBER = PAGENUMBER + 1;
				PAGEOFFSET = PAGEOFFSET + ROWS_PER_PAGE * COLUMNS_PER_PAGE;
			}
		}
	}
}
