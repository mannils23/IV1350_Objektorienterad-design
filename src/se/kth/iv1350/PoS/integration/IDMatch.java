package se.kth.iv1350.PoS.integration;

import java.util.List;
import java.util.Optional;

import se.kth.iv1350.PoS.exception.ItemDoesNotExistException;
import se.kth.iv1350.PoS.model.Item;
import se.kth.iv1350.PoS.model.ItemIdentifierDTO;

public class IDMatch implements Matcher {
	
	IDMatch(){
	}

	@Override
	public Item match(ItemIdentifierDTO itemToFindID, List<Item> itemList) throws ItemDoesNotExistException {
			Optional <Item> item = itemList.stream().filter(itemInList -> matchesID(itemInList, itemToFindID)).findFirst();
			if(item.isPresent()) {
				return item.get();
			} else {
				throw new ItemDoesNotExistException(itemToFindID);
			}
		
	}
	
	private boolean matchesID(Item itemInList, ItemIdentifierDTO itemToFindID) {
		ItemIdentifierDTO itemInListID = itemInList.getIdentifier();
		return itemInListID.getIdentifierValue() == itemToFindID.getIdentifierValue();
	}

}
