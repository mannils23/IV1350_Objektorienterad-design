package se.kth.iv1350.PoS.integration;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.*;

import se.kth.iv1350.PoS.model.Receipt;
import se.kth.iv1350.PoS.model.Sale;
import se.kth.iv1350.PoS.model.SaleDTO;

class PrinterTest {

	private Printer printer;
	@BeforeEach
	void setUp() {
		printer = new Printer();
	}

	@AfterEach
	void tearDown() {
		printer = null;
	}

	@Test
	void testPrintReceipt() {
		Receipt receipt = null;
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    printer.printReceipt(receipt);
	    String expectedOutput  = "Receipt sent to printer.";
	    
	    assertEquals(expectedOutput, outContent.toString());
	}

}
