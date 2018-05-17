package se.kth.iv1350.PoS.integration;

/**
 * Creates the classes responsible for handling external catalogs.
 * @author Marcus
 *
 */
public class CatalogCreator {

	private ItemCatalog itemCatalog;

	/**
	 * Creates a new instance with classes handling external catalogs.
	 */
	public CatalogCreator() {
		itemCatalog = ItemCatalog.getItemCatalog();
	}
	
	/**
	 * Returns the {@link ItemCatalog}.
	 * @return The <code>ItemCatalog</code>.
	 */
	public ItemCatalog getItemCatalog() {
		return itemCatalog;
	}
	
}

