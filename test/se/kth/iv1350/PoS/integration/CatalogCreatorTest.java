package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CatalogCreatorTest {

	CatalogCreator test;
	
	@Before
	public void setUp() {
		test = new CatalogCreator();	
	}
	
	@After
	public void tearDown() {
		test = null;
	}
	
	@Test
	public void testConstructor() {
		assertNotNull("No ItemCatalog created", test.getItemCatalog());
		assertTrue("ItemCatalog is wrong type", test.getItemCatalog() instanceof ItemCatalog);
	}

}
