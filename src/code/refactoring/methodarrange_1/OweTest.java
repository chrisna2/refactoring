package code.refactoring.methodarrange_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OweTest {

	@Before
	public void setUp() throws Exception {
	}

	
	/**
	 * 리펙토링 이후 항상 테스트를 진행 해야 한다.
	 */
	@Test
	public void testPrintOwing() {
		Owe owe = new Owe("홍길동");
		Order order1=new Order(1000); 
		owe.addOrder(order1);
		owe.printOwing(200);
	}

}
