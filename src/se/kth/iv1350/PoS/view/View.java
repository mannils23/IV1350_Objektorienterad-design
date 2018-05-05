package se.kth.iv1350.PoS.view;

import java.text.DecimalFormat;

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
		startNewSale();
		enterItemToSaleByID(0);
		enterItemToSaleByID(1);
		enterItemToSaleByID(3);
		noMoreItems();
		pay();
		
		
	}
	
	private void startNewSale() {
		controller.startNewSale();
	}
	
	private ItemIdentifierDTO createID(int value) {
		ItemIdentifierDTO itemInfo = new ItemIdentifierDTO(value);
		return itemInfo;
	}
	
	private void enterItemToSaleByID(int IDnumber) {
		saleInfo = controller.enterItem(createID(IDnumber));
		System.out.println("	    .ENTERING ITEMS.");
		printSaleInfo();
	}
	
	private void noMoreItems() {
		controller.indicateDone();
		System.out.println("	   .ALL ITEMS ENTERED.");
		printSaleInfo();
	}
	
	private void pay() {
		PaymentDTO payment = new PaymentDTO(new Amount(20));
		saleInfo = controller.pay(payment);
		System.out.println("	   .PAYMENT RECIEVED.");
		printSaleInfo();
	}
	
	private void printSaleInfo() {
		System.out.println("	Current Sale Information: ");
		for(Item item : saleInfo.getItems()) {
			System.out.println("Item ID: " + item.getIdentifier().getIdentifierValue() + "  |  " 
								+ "Item description: " + item.getDescription() + "  |  " 
								+ "Price: " + item.getPrice().getValue());
		}
		DecimalFormat df = new DecimalFormat("#.##");
		double total = saleInfo.getTotalPrice().getAmount().getValue();
		System.out.println("	TotalPrice: " + df.format(total));
		System.out.println("	Tax Rate: " + saleInfo.getTaxes().getTaxRate() * 100 + "%");
		System.out.println("	Paid: " + saleInfo.getPayment().getAmount().getValue());
		System.out.println("	Change: " + saleInfo.getChange().getChangeAmount().getValue());
		System.out.println();
	}

}
