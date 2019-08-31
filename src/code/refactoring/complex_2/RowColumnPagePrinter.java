package code.refactoring.complex_2;

public class RowColumnPagePrinter {
	
	private int ROWS_PER_PAGE;
	private int COLUMNS_PER_PAGE;
	
	public RowColumnPagePrinter(int ROWS_PER_PAGE, int COLUMNS_PER_PAGE) {
		this.ROWS_PER_PAGE = ROWS_PER_PAGE;
		this.COLUMNS_PER_PAGE = COLUMNS_PER_PAGE;
	}

	//my version
	public void print(int[] primes) {
		
		int NUMBER_OF_PRIMES = primes.length - 1;
		
		int PAGENUMBER;
		int PAGEOFFSET;
		int ROWOFFSET;
		int C;
		
		PAGENUMBER = 1;
		PAGEOFFSET = 1;
		while(PAGEOFFSET <= NUMBER_OF_PRIMES) {
			System.out.println("The First" + NUMBER_OF_PRIMES + "Prime Numbers --- Page " + PAGENUMBER);  //페이지 헤더 (변경될수 있으므로 Input을 받아야함
			System.out.println("");
			// 페이지단위 프린트
			for(ROWOFFSET = PAGEOFFSET; ROWOFFSET < PAGEOFFSET + ROWS_PER_PAGE; ROWOFFSET++) {
				for(C=0; C < COLUMNS_PER_PAGE; C++)
					if (ROWOFFSET + C * ROWS_PER_PAGE <= NUMBER_OF_PRIMES)
						System.out.format("%10d", primes[ROWOFFSET + C * ROWS_PER_PAGE]);
				System.out.println("");
			}
			System.out.println("\f");
			PAGENUMBER = PAGENUMBER + 1;
			PAGEOFFSET = PAGEOFFSET + ROWS_PER_PAGE * COLUMNS_PER_PAGE;
		}
		
	}

}
