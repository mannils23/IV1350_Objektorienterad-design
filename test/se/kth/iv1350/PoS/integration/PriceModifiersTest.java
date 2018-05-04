package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

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
	}

}
