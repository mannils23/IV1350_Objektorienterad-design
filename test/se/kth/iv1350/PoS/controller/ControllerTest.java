package se.kth.iv1350.PoS.controller;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import org.junit.Ignore;

import se.kth.iv1350.PoS.integration.*;

class ControllerTest {
	
	Controller controller;
	
	@BeforeEach
	public void setUp() {
		CatalogCreator catalogCreator = new CatalogCreator();
		ExternalSystemsCreator externalSystemsCreator = new ExternalSystemsCreator();
		controller = new Controller(catalogCreator, externalSystemsCreator);
		System.out.println("controller +");
	}
	
	@AfterEach
	public void tearDown() {
		controller = null;
		System.out.println("controller -");
	}
	
	/*@Ignore ("test not updated")
	@Test
	public void constructorTest() {
		assertNotNull("Null ItemCatalog", controller.getItemCatalog());
		assertTrue("ItemCatalog wrong type", controller.getItemCatalog() instanceof ItemCatalog);
		
		assertNotNull("Null ExternalSystems", controller.getExternalSystems());
		assertTrue("ExternalSystems wrong type", controller.getExternalSystems() instanceof ExternalSystems);
		
		assertNotNull("Null Printer", controller.getPrinter());
		assertTrue("Printer wrong type", controller.getPrinter() instanceof Printer);
	}*/
	
	
	/*@Test
	public void startNewSaleTest() {
		controller.startNewSale();
		assertNotNull("Null Controller", controller);
		assertNotNull("Null Sale", controller.getSale());
	}*/

}
