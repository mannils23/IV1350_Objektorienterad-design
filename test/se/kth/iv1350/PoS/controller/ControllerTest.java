package se.kth.iv1350.PoS.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import se.kth.iv1350.PoS.integration.CatalogCreator;
import se.kth.iv1350.PoS.integration.ExternalSystemsCreator;
import se.kth.iv1350.PoS.model.*;

public class ControllerTest {
	
	private Controller controller;
	

	@Before
	public void setUp() {
		ExternalSystemsCreator exSys = new ExternalSystemsCreator();
		CatalogCreator catalogs = new CatalogCreator();
		controller = new Controller(catalogs, exSys);
		controller.startNewSale();
	}

	@Test
	public void testPay() {
		PaymentDTO payment = new PaymentDTO(new Amount(10));
		controller.indicateDone();
		SaleDTO saleInfo = controller.pay(payment);
		double actual = saleInfo.getPayment().getAmount().getValue();
		double expected = 10;
		assertEquals(expected, actual, 0.0001);
		
	}
	
	@Test
	public void testAddItem() {
		ItemIdentifierDTO id = new ItemIdentifierDTO(5);
		SaleDTO saleInfo = controller.enterItem(id);
		ArrayList<Item> items = saleInfo.getItems();
		for(Item item : items) {
			if(item.getIdentifier().getIdentifierValue() == 5){
				return;
			}
		}
		fail("Item not found in list");
	}

}
