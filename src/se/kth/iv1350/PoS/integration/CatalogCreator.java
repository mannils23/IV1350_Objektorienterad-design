package se.kth.iv1350.PoS.integration;

public class CatalogCreator {

	private ItemCatalog itemCatalog;

	private CustomerDiscounts customerDiscounts;

	public CatalogCreator() {
		itemCatalog = new ItemCatalog();
		customerDiscounts = new CustomerDiscounts();
	}
	
	public ItemCatalog getItemCatalog() {
		return itemCatalog;
	}
	
	public CustomerDiscounts getCustomerDiscounts() {
		return customerDiscounts;
	}

}

