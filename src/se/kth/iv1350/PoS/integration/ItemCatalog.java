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
			itemList.add(new Item(identifier, "item" + i, price));
		}
	}
	/**
	 * Tries to return the <code>Item</code> with the specified <code>IdentidierDTO</code>.
	 * Failing returns an <code>Item</code> with null fields.
	 * @param itemIdentifier Specifies what <code>Item</code> to get.
	 * @return The <code>Item</code> specified.
	 */
	public Item getItem(ItemIdentifierDTO itemIdentifier) {
		for(int i = 0; i < itemList.size(); i++) {
			ItemIdentifierDTO itemToFindID = itemList.get(i).getIdentifier();
			if(itemToFindID.getIdentifierValue() == itemIdentifier.getIdentifierValue()) {
				return itemList.get(i);
			}
		}
		Item nullFieldsItem = new Item();
		return nullFieldsItem;
	}

}
