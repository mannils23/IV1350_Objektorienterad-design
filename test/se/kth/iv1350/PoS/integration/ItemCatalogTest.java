package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.kth.iv1350.PoS.model.Amount;
import se.kth.iv1350.PoS.model.Item;
import se.kth.iv1350.PoS.model.ItemIdentifierDTO;

class ItemCatalogTest {

	private ItemCatalog itemCatalog;
	@BeforeEach
	void setUp() throws Exception {
		itemCatalog = new ItemCatalog();
	}

	@AfterEach
	void tearDown() {
		itemCatalog = null;
	}

	@Test
	void testGetItem() {
		ItemIdentifierDTO expected = new ItemIdentifierDTO(5);
		Item foundItem = itemCatalog.getItem(expected);
		ItemIdentifierDTO actual = foundItem.getIdentifier();
		assertEquals("Found Item has wrong identifier.", expected, actual);
	}
	
	@Test
	void testAddItem() throws Exception {
		Item itemToAdd = createItem(40, "test item", 20);
		itemCatalog.addItem(itemToAdd);
		Item itemAdded = itemCatalog.getItem(new ItemIdentifierDTO(40));
		assertEquals("Added item not same as item to add.", itemToAdd, itemAdded);
	}
	
	@Test
	void testAddNullItem() throws Exception {
		try {
			Item nullItem = null;
			itemCatalog.addItem(nullItem);
		}catch(Exception e){
			return;
		}
		fail("null item added to ItemCatalog");
	}
	
	@Test
	void testItemDontExist() {
		ItemIdentifierDTO itemToFindID = new ItemIdentifierDTO(1000);
		Item item = itemCatalog.getItem(itemToFindID);
		boolean emptyItem = (item.getDescription() == null && item.getIdentifier() == null && item.getPrice() == null);
		assertTrue("empty item not returned", emptyItem);
	}
	
	private Item createItem(int idNumber, String desc, int itemPrice) {
		ItemIdentifierDTO id = new ItemIdentifierDTO(idNumber);
		Amount price = new Amount(itemPrice);
		return new Item(id, desc, price);
	}

}
