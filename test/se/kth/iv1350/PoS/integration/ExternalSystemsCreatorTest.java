package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ExternalSystemsCreatorTest {
	
	private ExternalSystemsCreator test;
	
	@Before
	public void setUp() {
		test = new ExternalSystemsCreator();
	}

	@Test
	public void testGetPrinter() {
		assertNotNull("no printer created", test.getPrinter());
		assertTrue("created printer is wrong type", (test.getPrinter() instanceof Printer) );
	}
	
	@Test
	public void testGetExternalSystems() {
		assertNotNull("no externalSystems created", test.getExternalSystems());
		assertTrue("created externalSystems is wrong type", (test.getExternalSystems() instanceof ExternalSystems) );
	}

}
