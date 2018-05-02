package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import se.kth.iv1350.PoS.integration.ExternalSystemsCreator;

class ExternalSystemsCreatorTest {

	@Test
	public void testFields() {
		ExternalSystemsCreator test = new ExternalSystemsCreator();
		assertNotNull("no externalSystems created", test.getExternalSystems());
		assertTrue("created externalSystems is wrong type", (test.getExternalSystems() instanceof ExternalSystems) );
		
		
		assertNotNull("no printer created", test.getPrinter());
		assertTrue("created printer is wrong type", (test.getPrinter() instanceof Printer) );
	}

}
