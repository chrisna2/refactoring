package code.refactoring.complex_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testStatementRegular() {
		Customer customer = new Customer("kim");
		
		Movie movie = new Movie("Forrest Gump", 0);
		Rental rental = new Rental(movie, 2);
		
		Movie movie2 = new Movie("Speed", 1);
		Rental rental2 = new Rental(movie2, 2);
		
		Movie movie3 = new Movie("Hatty Pattor", 1);
		Rental rental3 = new Rental(movie3, 2);
		
		customer.addRental(rental);
		customer.addRental(rental2);
		customer.addRental(rental3);
		
		System.out.println("statement ---> " + customer.statement());
		
	}
	
	
	@Test
	public void testStatementNew() {
		Customer customer = new Customer("kim");
		Movie movie = new Movie("Speed", 1);
		Rental rental = new Rental(movie, 2);
		
		customer.addRental(rental);
		System.out.println("statement ---> " + customer.statement());
		
	}
	
	@Test
	public void testStatementChild() {
		Customer customer = new Customer("kim");
		Movie movie = new Movie("Disney Miki", 2);
		Rental rental = new Rental(movie, 2);
		
		customer.addRental(rental);
		System.out.println("statement ---> " + customer.statement());
		
	}

}
