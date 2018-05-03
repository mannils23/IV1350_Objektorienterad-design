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
		itemCatalog = new ItemCatalog();
	}
	
	/**
	 * Returns this objects' <code>ItemCatalog</code>.
	 * @return The <code>ItemCatalog</code>.
	 */
	public ItemCatalog getItemCatalog() {
		return itemCatalog;
	}
	
}

