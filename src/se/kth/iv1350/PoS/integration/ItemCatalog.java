package se.kth.iv1350.PoS.integration;

import java.util.ArrayList;
import java.util.Optional;

import se.kth.iv1350.PoS.model.Amount;
import se.kth.iv1350.PoS.model.Item;
import se.kth.iv1350.PoS.model.ItemIdentifierDTO;

/**
 * Placeholder for the external system containing information about items.
 * Creates a catalog  with all items available for purchase.
 *
 */
public class ItemCatalog {

	private ArrayList<Item> itemList;
	
	/**
	 * Creates an instance of ItemCatalog.
	 * When created, fills with <code>Item</code> objects.
	 * (identifier(i), "item" + i, price(i + 1)
	 * @throws Exception 
	 */
	public ItemCatalog() {
		itemList = new ArrayList<Item>();
		addPredefinedItems();
	}
	
	/**
	 * Tries to return the <code>Item</code> with the specified <code>IdentidierDTO</code>.
	 * Failing returns an <code>Item</code> with null fields.
	 * @param itemIdentifier Specifies what <code>Item</code> to get.
	 * @return The <code>Item</code> specified.
	 */
	public Item getItem(ItemIdentifierDTO itemToFindID) {
		/*for(Item itemInList : itemList) {
			if(matchesID(itemInList, itemToFindID)) {
				return itemInList;
			}
		}*/
		Optional <Item> item = itemList.stream().filter(itemInList -> matchesID(itemInList, itemToFindID)).findFirst();
		if(item.isPresent()) {
			return item.get();
		} else {
			throw new IllegalArgumentException();
		}
	}
	/**
	 * Adds an <code>Item</code> to the catalog.
	 * @param item The <code>Item</code> to add.
	 * @throws Exception 
	 */
	public void addItem(Item item) throws Exception {
		if(item == null) {
			throw new IllegalArgumentException("null item");
		}
		itemList.add(item);
	}
	
	private boolean matchesID(Item itemInList, ItemIdentifierDTO itemToFindID) {
		ItemIdentifierDTO itemInListID = itemInList.getIdentifier();
		return itemInListID.getIdentifierValue() == itemToFindID.getIdentifierValue();
	}
	
	private void addPredefinedItems() {
		for(int i = 0; i < 20; i++) {
			ItemIdentifierDTO identifier = new ItemIdentifierDTO(i);
			Amount price = new Amount(i + 1);
			Item itemToAdd = new Item(identifier, "item" + i, price);
			try {
				addItem(itemToAdd);
			}catch (Exception e) {}
		}
	}
}

