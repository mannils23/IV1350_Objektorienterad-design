package se.kth.iv1350.PoS.model;

/**
 * Represents an item to be added to a {@link Sale}.
 *
 */
public class Item {
	
	private final ItemIdentifierDTO identifier;

	private final String description;

	private final Amount price;

	/**
	 * Creates instance of an {@link Item} with parameters.
	 * @param identifier Used to identify the <code>Item</code>.
	 * @param description Used to describe the <code>Item</code>.
	 * @param price Describes how much the <code>Item</code> costs.
	 */
	public Item(ItemIdentifierDTO identifier, String description, Amount price) {
		this.identifier = identifier;
		this.description = description;
		this.price = price;
	}
	
	/**
	 * Returns the identifier for the <code>Item</code>.
	 * @return The identifier for the <code>Item</code>.
	 */
	public ItemIdentifierDTO getIdentifier() {
		return identifier;
	}
	/**
	 * Returns the {@link String} describing the <code>Item</code>.
	 * @return The <code>String</code> describing the <code>Item</code>.
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Returns the {@link Amount} describing the price of the <code>Item</code>.
	 * @return
	 */
	public Amount getPrice() {
		return price;
	}

}
