package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import se.kth.iv1350.PoS.integration.ExternalSystemsCreator;

class ExternalSystemsCreatorTest {

	@Test
	public void test() {
		ExternalSystemsCreator test = new ExternalSystemsCreator();
		assertTrue("created externalSystems is wrong type", (test.getExternalSystems() instanceof ExternalSystems) );
		assertFalse("no externalSystems created", test.getExternalSystems() == null);
		
		assertTrue("created printer is wrong type", (test.getPrinter() instanceof Printer) );
		assertFalse("no printer created", test.getPrinter() == null);
	}

}
