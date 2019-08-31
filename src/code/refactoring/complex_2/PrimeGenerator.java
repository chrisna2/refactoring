package code.refactoring.complex_2;

public class PrimeGenerator {

	public static int[] generate(int NUMBER_OF_PRIMES) {
		
		final int ORDMAX = 30;
		
		int P[] = new int[NUMBER_OF_PRIMES+1];
		int J = 1;
		int K = 1;
		boolean JPRIME;
		int ORD = 2;
		int SQUARE = 9;
		int N;
		int MULT[] = new int[ORDMAX+1];
		
		P[1] = 2;
		while(K < NUMBER_OF_PRIMES) {	// 소수 Max 개수까지 반복
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
		return P;
	}

}
