package se.kth.iv1350.PoS.controller;

import se.kth.iv1350.PoS.integration.*;
import se.kth.iv1350.PoS.model.*;

/**
 * The controller layer which is responsible for all interactions between the
 * <code>View</code> and <code>Model</code> layers.
 *
 */
public class Controller {

	private ItemCatalog itemCatalog;
	
	private ExternalSystems externalSystems;
	
	private Sale sale;

	private Receipt receipt;
	
	/**
	 * Creates a new instance of Controller
	 * 
	 * @param catalogs The placeholders for the external catalogs.
	 * @param externalSystemsCreator The placeholder for the external systems.
	 */
	public Controller(CatalogCreator catalogs, ExternalSystemsCreator externalSystemsCreator) {
		itemCatalog = catalogs.getItemCatalog();
		externalSystems = externalSystemsCreator.getExternalSystems();
	}
	
	/**
	 * Creates the <code>Sale</code> object representing the active sale.
	 */
	public void startNewSale() {
		sale = new Sale();

	}
	
	/**
	 * Tries to enter specified <code>Item</code> to the current sale.
	 * @param itemIdentifier Specifies the <code>Item</code> object to add.
	 * @return Returns information about a the sale as a <code>SaleDTO</code> object.
	 */
	public SaleDTO enterItem(ItemIdentifierDTO itemIdentifier) {
		Item item = itemCatalog.getItem(itemIdentifier);
		sale.addItem(item);
		SaleDTO saleInfo = sale.getSaleInformation();
		return saleInfo;
	}

	/**
 	* Returns the total price for the sale.
 	* @return The total price.
 	*/
	public SaleDTO indicateDone() {
		return sale.getSaleInformation();
	}
	/**
	 * Pays the current <code>Sale</code>, records it and returns a <code>Change</code> object.
	 * @param payment Information about the payment.
	 * @return Information about the change as <code>Change</code>.
	 */
	public SaleDTO pay(PaymentDTO payment) {
		sale.pay(payment);
		sale.getChange();
		recordSale();
		return sale.getSaleInformation();
	}

	private void recordSale() {
		SaleDTO saleInfo = sale.getSaleInformation();
		printReceipt(saleInfo);
		externalSystems.recordSale(saleInfo);
	}
	
	private void printReceipt(SaleDTO saleInfo) {
		receipt = new Receipt(saleInfo);
		receipt.printReceipt();
	}
}
