package se.kth.iv1350.PoS.integration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaxesTest {
	private Taxes taxes;

	@BeforeEach
	void setUp() throws Exception {
		taxes = new Taxes();
	}

	@AfterEach
	void tearDown() throws Exception {
		taxes = null;
	}

	@Test
	public void testTaxRateHigherThanOne() {
		if(taxes.getTaxRate() > 1) {
			fail("Invalid TaxRate: Decimal TaxRate higher than 1.");
		}
	}
	
	@Test
	public void testTaxRateLowerThanZero() {
		if(taxes.getTaxRate() < 0) {
			fail("Invalid TaxRate: Decimal TaxRate lower than 0.");
		}
	}
}
