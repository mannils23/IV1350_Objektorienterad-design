package se.kth.iv1350.PoS.controller;

import se.kth.iv1350.PoS.integration.ItemCatalog;
import se.kth.iv1350.PoS.model.Item;
import se.kth.iv1350.PoS.model.Sale;
import se.kth.iv1350.PoS.integration.ExternalSystems;
import se.kth.iv1350.PoS.model.Receipt;
import se.kth.iv1350.PoS.integration.CustomerDiscounts;
import se.kth.iv1350.PoS.integration.CatalogCreator;
import se.kth.iv1350.PoS.integration.ExternalSystemsCreator;
import se.kth.iv1350.PoS.model.SaleDTO;
import se.kth.iv1350.PoS.model.ItemIdentifierDTO;
import se.kth.iv1350.PoS.model.SaleInformation;
import se.kth.iv1350.PoS.model.TotalPrice;
import se.kth.iv1350.PoS.model.CustomerDTO;
import se.kth.iv1350.PoS.model.Amount;
import se.kth.iv1350.PoS.model.PaymentDTO;

public class Controller {

	private ItemCatalog itemCatalog;

	private Item item;

	private Sale sale;

	private ExternalSystems externalSystems;

	private Receipt receipt;

	private CustomerDiscounts customerDiscounts;

	public Controller Controller(CatalogCreator catalogs, ExternalSystemsCreator externalSystems) {
		return null;
	}

	public SaleDTO enterItem(ItemIdentifierDTO itemIdentifier) {
		return null;
	}

	public void startNewSale() {

	}

	public SaleInformation increaseQuantity(ItemIdentifierDTO itemIdentifier) {
		return null;
	}

	public TotalPrice indicateDone() {
		return null;
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

}
