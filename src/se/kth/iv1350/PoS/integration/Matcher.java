package se.kth.iv1350.PoS.integration;

import java.util.List;

import se.kth.iv1350.PoS.exception.ItemDoesNotExistException;
import se.kth.iv1350.PoS.model.Item;
import se.kth.iv1350.PoS.model.ItemIdentifierDTO;

public interface Matcher {

	Item match(ItemIdentifierDTO i, List<Item> itemList) throws ItemDoesNotExistException;
}
