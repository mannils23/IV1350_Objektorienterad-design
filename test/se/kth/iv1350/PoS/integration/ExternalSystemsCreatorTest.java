package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.kth.iv1350.PoS.integration.ExternalSystemsCreator;

class ExternalSystemsCreatorTest {
	
	private ExternalSystemsCreator test;
	
	@BeforeEach
	public void setUp() {
		test = new ExternalSystemsCreator();
	}

	@AfterEach
	public void tearDown() {
		test = null;
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
