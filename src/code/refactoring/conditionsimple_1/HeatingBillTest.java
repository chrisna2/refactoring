package code.refactoring.conditionsimple_1;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class HeatingBillTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateBills() {
		HeatingBill decomposeCondition = new HeatingBill();
		
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM-dd");
			Date calDate = formatter.parse("06-30");
			double retCalBills = decomposeCondition.calculateBills(100, calDate);
			assertTrue(retCalBills == 200.0);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
