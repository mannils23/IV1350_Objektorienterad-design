package se.kth.iv1350.PoS.view;

import se.kth.iv1350.PoS.controller.Controller;
import se.kth.iv1350.PoS.model.*;

/**
 * Holds the <code>view</code> method. Simulates an external system interacting with <code>Controller</code>
 * @author Marcus
 *
 */
public class View {

	private Controller controller;
	private SaleDTO saleInfo;
	

/**
 * Interacts with controller as an external system.
 * @param controller The <code>Controller</code> object to interact with.
 */
	public View(Controller controller) {
		this.controller = controller;
	}
	
	public void trySale() {
		controller.startNewSale();
		saleInfo = controller.enterItem(createID(0));
		saleInfo = controller.enterItem(createID(1));
		
	}
	
	public ItemIdentifierDTO createID(int value) {
		ItemIdentifierDTO itemInfo = new ItemIdentifierDTO(value);
		return itemInfo;
	}

}
