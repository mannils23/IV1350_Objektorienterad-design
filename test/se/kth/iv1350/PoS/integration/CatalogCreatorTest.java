package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class CatalogCreatorTest {

	@Test
	public void testFields() {
		CatalogCreator test = new CatalogCreator();
		assertNotNull("No ItemCatalog created", test.getItemCatalog());
		assertTrue("ItemCatalog is wrong type", test.getItemCatalog() instanceof ItemCatalog);
		
		assertNotNull("No CustomerDiscounts created", test.getCustomerDiscounts());
		assertTrue("CustomerDiscount is wrong type", test.getCustomerDiscounts() instanceof CustomerDiscounts);
		
	}

}
