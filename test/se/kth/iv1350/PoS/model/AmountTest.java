package se.kth.iv1350.PoS.model;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

public class AmountTest {

	Amount amount;
	@Before
	public void setUp() throws Exception {
		amount = new Amount(10);
	}

	@Test
	public void addAmountTest() {
		Amount input = new Amount(5);
		amount.addAmount(input);
		double actual = amount.getValue(); 
		double expected = 15;
		DecimalFormat df = new DecimalFormat("#.##");
		
		
		assertEquals(expected, actual, 0.00001);
	}

}
