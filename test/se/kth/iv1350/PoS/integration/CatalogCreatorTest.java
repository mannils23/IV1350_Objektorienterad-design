package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatalogCreatorTest {

	CatalogCreator test;
	
	@BeforeEach
	public void setUp() {
		test = new CatalogCreator();	
	}
	
	@AfterEach
	public void tearDown() {
		test = null;
	}
	
	@Test
	public void testConstructor() {
		assertNotNull("No ItemCatalog created", test.getItemCatalog());
		assertTrue("ItemCatalog is wrong type", test.getItemCatalog() instanceof ItemCatalog);
	}

}
