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
	
	private CustomerDiscounts customerDiscounts;
	
	private ExternalSystems externalSystems;
	
	private Printer printer;

	private Item item;

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
		customerDiscounts = catalogs.getCustomerDiscounts();
		externalSystems = externalSystemsCreator.getExternalSystems();
		printer = externalSystemsCreator.getPrinter();
	}
	/**
	 * Tries to enter specified <code>Item</code> to the current sale.
	 * @param itemIdentifier Specifies the <code>Item</code> object to add.
	 * @return Returns information about a the sale as a <code>SaleDTO</code> object.
	 */
	public SaleDTO enterItem(ItemIdentifierDTO itemIdentifier) {
		ItemInformation itemInfo = itemCatalog.getItemInformation(itemIdentifier);
		Item item = new Item(itemInfo);
		sale.addItem(item);
		SaleDTO saleInfo = sale.getSaleInformation();
		return saleInfo;
	}
	/**
	 * Creates the <code>Sale</code> object representing the active sale.
	 */
	public void startNewSale() {
		sale = new Sale();

	}

	public SaleInformation increaseQuantity(ItemIdentifierDTO itemIdentifier) {
		return null;
	}
/**
 * Returns the total price for the sale.
 * @return The total price.
 */
	public TotalPrice indicateDone() {
		return sale.getTotalPrice();
	}

	public SaleDTO requestDiscount(CustomerDTO ID) {
		return null;
	}

	public Amount pay(PaymentDTO payment) {
		return null;
	}

	public SaleDTO enterItemWithQuantity(ItemIdentifierDTO itemIdentifier, int quantity) {
		return null;
	}
	
	public ItemCatalog getItemCatalog() {
		return itemCatalog;
	}
	
	public CustomerDiscounts getCustomerDiscounts() {
		return customerDiscounts;
	}
	
	public ExternalSystems getExternalSystems() {
		return externalSystems;
	}
	
	public Printer getPrinter() {
		return printer;
	}
	
	public Sale getSale() {
		return sale;
	}

}
