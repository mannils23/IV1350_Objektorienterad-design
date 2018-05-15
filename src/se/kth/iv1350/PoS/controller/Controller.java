package se.kth.iv1350.PoS.controller;

import java.util.ArrayList;
import java.util.List;

import se.kth.iv1350.PoS.exception.ItemCatalogException;
import se.kth.iv1350.PoS.exception.ItemDoesNotExistException;
import se.kth.iv1350.PoS.exception.OperationFailedException;
import se.kth.iv1350.PoS.integration.*;
import se.kth.iv1350.PoS.model.*;
import se.kth.iv1350.PoS.view.TotalRevenueView;

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
	
	private TotalRevenueView totalRevenueView;
	
	private List<SaleObserver> saleObservers = new ArrayList<>();

	/**
	 * Creates a new instance of Controller
	 * 
	 * @param catalogs
	 *            The placeholders for the external catalogs.
	 * @param externalSystemsCreator
	 *            The placeholder for the external systems.
	 */
	public Controller(CatalogCreator catalogs, ExternalSystemsCreator externalSystemsCreator) {
		itemCatalog = catalogs.getItemCatalog();
		externalSystems = externalSystemsCreator.getExternalSystems();
	}
	
	public void addSaleObserver(SaleObserver obs) {
		saleObservers.add(obs);
	}

	/**
	 * Creates the <code>Sale</code> object representing the active sale.
	 */
	public void startNewSale() {
		sale = new Sale();
		sale.addSaleObservers(saleObservers);
	}

	/**
	 * Tries to enter the <code>Item</code> belonging to the specified identifier to the current sale.
	 * 
	 * @param itemIdentifier Specifies the <code>Item</code> object to add.
	 * @return Returns information about a the sale as a <code>SaleDTO</code>
	 *         object.
	 * @throws OperationFailedException if item could not be entered for any other reason than the item not existing.
	 * @throws ItemDoesNotExistException if the item to enter does not exist.
	 */
	public SaleDTO enterItem(ItemIdentifierDTO itemIdentifier) throws OperationFailedException, ItemDoesNotExistException {
		try {
			Item item = itemCatalog.getItem(itemIdentifier);
			sale.addItem(item);
			SaleDTO saleInfo = sale.getSaleInformation();
			return saleInfo;
			
		} catch(ItemCatalogException catalogExc){
			throw new OperationFailedException("Could not enter item.", catalogExc);
		} 
	}

	/**
	 * Indicates to the system the {@link Sale} is finished and returns sale information {@link SaleDTO}.
	 * 
	 * @return The <code>SaleDTO</code>.
	 */
	public SaleDTO indicateDone() {
		return sale.getSaleInformation();
	}

	/**
	 * Pays the current <code>Sale</code>, records it and returns a
	 * <code>Change</code> object.
	 * 
	 * @param payment
	 *            Information about the payment.
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
