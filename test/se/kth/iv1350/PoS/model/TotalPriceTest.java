package se.kth.iv1350.PoS.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.kth.iv1350.PoS.integration.Taxes;

class TotalPriceTest {

	TotalPrice test;
	
	@BeforeEach
	void setUp() {
		Amount amount = new Amount(10);
		test = new TotalPrice(amount);
	}

	@Test
	void testApplyTaxes() {
		Taxes taxes = new Taxes();
		test.applyTaxes(taxes);
		double expected = 7;
		double actual = test.getAmount().getValue();
		assertEquals(expected, actual);
	}

}
