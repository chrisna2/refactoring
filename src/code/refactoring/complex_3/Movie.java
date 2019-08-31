package code.refactoring.complex_3;

//자식 클래스 장르 추가
public class Movie {
	
	public static final int CHILDERNS = 2;
	public static final int REQULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	private PriceCode _priceCode;
	
	
	//#1
	public double getRantalCharge(int getDayRanted) {
		return getPriceCode().getRantalCharge(getDayRanted);
	}
	
	
	//#2
	public int getFrequentRentalPoint(int getDayRanted) {
		return getPriceCode().getRantalPoint(getDayRanted);
	}
	
	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}
	
	public PriceCode getPriceCode() {
		return _priceCode;
	}
	
	public void setPriceCode(int arg){
		
		switch(arg) {
		
		case Movie.REQULAR:
			_priceCode = new Reqular();
			break;
			
		case Movie.NEW_RELEASE:
			_priceCode = new NewRelease();
			break;
			
		case Movie.CHILDERNS:
			_priceCode = new Childerns();
			break;
		}
		
	}
	
	public String getTitle() {
		return _title;
	}
}
