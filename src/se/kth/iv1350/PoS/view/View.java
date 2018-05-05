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
	 * Starts a new {@link Sale} process.
	 */
	public void startNewSale() {
		controller.startNewSale();
	}
	
	/**
	 * Tries to add an {@link Item} to the {@link Sale} based on ID-number
	 * @param IDnumber The ID number for the <code>Item</code>.
	 */
	public void enterItemToSaleByID(int IDnumber) {
		saleInfo = controller.enterItem(createID(IDnumber));
		System.out.println("	    .ENTERING ITEMS.");
		printSaleInfo();
	}
	
	/**
	 * Indicates to the system no more items will be added to the {@link Sale}.
	 */
	public void noMoreItems() {
		controller.indicateDone();
		System.out.println("	   .ALL ITEMS ENTERED.");
		printSaleInfo();
	}
	
	/**
	 * Finishes the {@link Sale} by sending a value representing the paid amount to the system.
	 * @param paidValue The amount paid.
	 */
	public void pay(double paidValue) {
		PaymentDTO payment = new PaymentDTO(new Amount(paidValue));
		saleInfo = controller.pay(payment);
		System.out.println("	   .PAYMENT RECIEVED.");
		printSaleInfo();
	}
	
	private ItemIdentifierDTO createID(int value) {
		ItemIdentifierDTO itemInfo = new ItemIdentifierDTO(value);
		return itemInfo;
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
