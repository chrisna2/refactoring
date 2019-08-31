package code.refactoring.complex_2;

public class PrintPrimes {

	
	public static void main(String[] args) {
		
		final int NUMBER_OF_PRIMES = 1000;	// ����� �ҽ�����
		final int ROWS_PER_PAGE = 50;		// �������� Rows
		final int COLUMNS_PER_PAGE = 4;		// �������� Columns
		
		int primes[] = PrimeGenerator.generate(NUMBER_OF_PRIMES);
		
		RowColumnPagePrinter printPrime = new RowColumnPagePrinter(ROWS_PER_PAGE, COLUMNS_PER_PAGE);
		//my version
		printPrime.print(primes);
		
	}
}
