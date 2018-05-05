package se.kth.iv1350.PoS.model;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import se.kth.iv1350.PoS.integration.Taxes;

public class TotalPriceTest {

	TotalPrice test;
	
	@Before
	public void setUp() {
		Amount amount = new Amount(10);
		test = new TotalPrice(amount);
	}

	@Test
	public void testApplyTaxes() {
		Taxes taxes = new Taxes();
		test.applyTaxes(taxes);
		double expected = 13;
		double actual = test.getAmount().getValue();
		assertEquals(expected, actual, 0.00001);
	}

}
