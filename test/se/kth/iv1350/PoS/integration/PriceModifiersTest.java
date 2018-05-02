package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

import se.kth.iv1350.PoS.model.CustomerDTO;

class PriceModifiersTest {
	
	PriceModifiers priceModifiers;
	@BeforeEach
	public void setUp() {
		priceModifiers = new PriceModifiers();
	}

	@AfterEach
	public void tearDown() {
		priceModifiers = null;
	}
	@Test
	public void constructorTest() {
		assertNotNull("null Taxes", priceModifiers.getTaxes());
		CustomerDTO ID = new CustomerDTO();
		assertNotNull("null Discount", priceModifiers.getDiscount(ID));
	}

}
