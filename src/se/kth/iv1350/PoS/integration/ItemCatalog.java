package se.kth.iv1350.PoS.integration;

import java.util.List;
import se.kth.iv1350.PoS.model.*;

/**
 * Placeholder for the external system containing information about items.
 * Creates a catalog  with all items available for purchase.
 *
 */
public class ItemCatalog {

	private List<Item> itemList;
	
	/**
	 * Creates an instance of ItemCatalog.
	 * When created, fills with <code>Item</code> objects.
	 * (identifier(i), "item" + i, price(i + 1)
	 */
	public ItemCatalog() {
		for(int i = 0; i < 20; i++) {
			ItemIdentifierDTO identifier = new ItemIdentifierDTO(i);
			Amount price = new Amount(i + 1);
			Item itemToAdd = new Item(identifier, "item" + i, price);
			addItem(itemToAdd);
		}
	}
	/**
	 * Tries to return the <code>Item</code> with the specified <code>IdentidierDTO</code>.
	 * Failing returns an <code>Item</code> with null fields.
	 * @param itemIdentifier Specifies what <code>Item</code> to get.
	 * @return The <code>Item</code> specified.
	 */
	public Item getItem(ItemIdentifierDTO itemToFindID) {
		for(int i = 0; i < itemList.size(); i++) {
			Item itemInList = itemList.get(i);
			if(hasSameID(itemInList, itemToFindID)) {
				return itemInList;
			}
		}
		Item nullFieldsItem = new Item();
		return nullFieldsItem;
	}
	/**
	 * Adds an <code>Item</code> to the catalog.
	 * @param item The <code>Item</code> to add.
	 */
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	private boolean hasSameID(Item itemInList, ItemIdentifierDTO itemToFindID) {
		ItemIdentifierDTO itemInListID = itemInList.getIdentifier();
		return itemInListID.getIdentifierValue() == itemToFindID.getIdentifierValue();
	}

}
