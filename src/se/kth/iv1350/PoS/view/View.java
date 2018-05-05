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
	
	/**
	 * Runs simulated sale in the system as placeholder for the real view layer.
	 */
	public void trySale() {
		controller.startNewSale();
		saleInfo = controller.enterItem(createID(0));
		printSaleInfo();
		saleInfo = controller.enterItem(createID(1));
		printSaleInfo();
		controller.indicateDone();
		
		
	}
	
	private ItemIdentifierDTO createID(int value) {
		ItemIdentifierDTO itemInfo = new ItemIdentifierDTO(value);
		return itemInfo;
	}
	
	private void printSaleInfo() {
		for(Item item : saleInfo.getItems()) {
			System.out.println("	Current Sale Information: ");
			System.out.println("Item ID: " + item.getIdentifier() + "  |  " 
								+ "Item description: " + item.getDescription() + "  |  " 
								+ "Price: " + item.getPrice().getValue());
		}
		System.out.println("	Total price: " + saleInfo.getTotalPrice().getAmount().getValue());
		System.out.println("	Paid: " + saleInfo.getPayment().getAmount().getValue());
		System.out.println("	Change: " + saleInfo.getChange().getChangeAmount().getValue());
	}

}
