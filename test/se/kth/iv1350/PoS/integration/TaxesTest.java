package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TaxesTest {
	private Taxes taxes;

	@Before
	public void setUp() throws Exception {
		taxes = new Taxes();
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
