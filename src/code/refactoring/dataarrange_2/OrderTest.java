package code.refactoring.dataarrange_2;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrder() {
      int result = 0;
      Vector orderV = new Vector();
      Order order1 = new Order("박찬호"); 
      Order order2 = new Order("강정호");
      Order order3 = new Order("추신수");
      
      orderV.addElement(order1);
      orderV.addElement(order2);
      orderV.addElement(order3);
      
      Iterator iter = orderV.iterator();
      while (iter.hasNext()) {
          Order each = (Order) iter.next();
          System.out.println(" each.getCustomerName() --->  " + each.getCustomerName());
      }
	}

}
