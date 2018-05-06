package se.kth.iv1350.PoS.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AmountTest {

	Amount amount;
	@Before
	public void setUp() throws Exception {
		amount = new Amount(10);
	}
	
	@Test
	public void testcreateNegativeAmount() {
		amount = new Amount(-5);
		double actual = amount.getValue();
		double expected = 0;
		assertEquals(expected, actual, 0.00001);
	}
	
	@Test
	public void testCreateLargeAmount() {
		amount = new Amount(Integer.MAX_VALUE);
		double actual = amount.getValue();
		double expected = Integer.MAX_VALUE;
		
		assertEquals(actual, expected, 0.00001);
		
		amount = new Amount(Double.MAX_VALUE);
		actual = amount.getValue();
		expected = Double.MAX_VALUE;
		
		assertEquals(expected, actual, 0.00001);
	}

	@Test
	public void testAddAmount() {
		Amount input = new Amount(5);
		amount.addAmount(input);
		double actual = amount.getValue(); 
		double expected = 15;
		
		assertEquals(expected, actual, 0.00001);
	}

}
