package se.kth.iv1350.PoS.integration;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.kth.iv1350.PoS.model.SaleDTO;

class ExternalSystemsTest {
	
	ExternalSystems exSys;
	
	@BeforeEach
	void setUp() throws Exception {
		exSys = new ExternalSystems();
	}

	@AfterEach
	void tearDown() throws Exception {
		exSys = null;
	}

	@Test
	void testRecordSale() {
		SaleDTO saleInfo = null;
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    exSys.recordSale(saleInfo);
	    String expectedOutput  = "Sale recorded in external systems.";
	    
	    assertEquals(expectedOutput, outContent.toString());
	}
}
