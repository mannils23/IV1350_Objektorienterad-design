package se.kth.iv1350.PoS.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ChangeTest {

	private Change test;
	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testTotalLargerThanPayment() {
		int paidValue = 50;
		PaymentDTO payment = new PaymentDTO(new Amount(paidValue));
		int totalValue = 100;
		TotalPrice total = new TotalPrice(new Amount(totalValue));
		
		test = new Change(payment, total);
		double actual = test.getChangeAmount().getValue();
		double expected = 0;
		
		assertEquals(expected, actual, 0.00001);
	}

}
