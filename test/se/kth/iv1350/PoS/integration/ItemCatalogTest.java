package se.kth.iv1350.PoS.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import exception.ItemDoesNotExistException;
import se.kth.iv1350.PoS.model.Amount;
import se.kth.iv1350.PoS.model.Item;
import se.kth.iv1350.PoS.model.ItemIdentifierDTO;

public class ItemCatalogTest {

	private ItemCatalog itemCatalog;

	@Before
	public void setUp() throws Exception {
		itemCatalog = new ItemCatalog();
	}

	@Test
	public void testGetItem() {
		ItemIdentifierDTO expected = new ItemIdentifierDTO(5);
		Item foundItem = null;
		try {
			foundItem = itemCatalog.getItem(expected);
		} catch (ItemDoesNotExistException e) {
			fail("Exception was thrown.");
		}
		ItemIdentifierDTO actual = foundItem.getIdentifier();
		assertEquals("Found Item has wrong identifier.", expected, actual);
	}

	@Test
	public void testAddItem() throws Exception {
		Item itemToAdd = createItem(40, "test item", 20);
		itemCatalog.addItem(itemToAdd);
		Item itemAdded = itemCatalog.getItem(new ItemIdentifierDTO(40));
		assertEquals("Added item not same as item to add.", itemToAdd, itemAdded);
	}

	@Ignore
	@Test
	public void testAddNullItem() throws Exception {
		try {
			Item nullItem = null;
			itemCatalog.addItem(nullItem);
		} catch (Exception e) {
			return;
		}
		fail("null item added to ItemCatalog");
	}

	@Test
	public void testItemDontExist() {
		ItemIdentifierDTO itemToFindID = new ItemIdentifierDTO(1000);
		try {
			Item item = itemCatalog.getItem(itemToFindID);
		} catch (ItemDoesNotExistException e) {
			return;
		}
		fail();
	}

	private Item createItem(int idNumber, String desc, int itemPrice) {
		ItemIdentifierDTO id = new ItemIdentifierDTO(idNumber);
		Amount price = new Amount(itemPrice);
		return new Item(id, desc, price);
	}

}
