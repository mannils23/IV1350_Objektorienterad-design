package se.kth.iv1350.PoS.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AmountTest {

	Amount amount;
	@BeforeEach
	void setUp() throws Exception {
		amount = new Amount(10);
	}

	@Test
	void addAmountTest() {
		Amount input = new Amount(5);
		amount.addAmount(input);
		double actual = amount.getValue(); 
		double expected = 15;
		
		assertEquals(expected, actual);
	}

}
