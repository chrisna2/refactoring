package code.refactoring.complex_3;

public class Rental {
	
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}
	
	//#1
	public double getRantalCharge() {
		return _movie.getRantalCharge(getDaysRented());
	}

	//#2
	public int getFrequentRentalPoint() {
		return _movie.getFrequentRentalPoint(getDaysRented());
	}

}
