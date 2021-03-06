package se.kth.iv1350.PoS.model;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import se.kth.iv1350.PoS.integration.Taxes;

public class SaleTest {

	Sale sale;
	Item item;
	
	@Before
	public void setUp() {
		sale = new Sale();
		item = createItem(5, "item added for test", 10.0);
	}

	@Test
	public void addOneItemTest() {
		sale.addItem(item);
		boolean condition = sale.getItems().contains(item);
		
		assertTrue("Added item not in list", condition);
	}
	
	@Test
	public void addManyItemTest() {
		ArrayList<Item> addedItems = new ArrayList<Item>();
		for(int i = 0; i < 100; i++) {
			Item itemToAdd = createItem(i, "manyItem no. " + i, 1);
			sale.addItem(itemToAdd);
			addedItems.add(itemToAdd);
		}
		ArrayList<Item> itemsInSale = sale.getItems();
		for(Item addedItem : addedItems) {
			if(!itemsInSale.contains(addedItem)) {
				fail("Added item not in list.");
			}
		}
	}
	
	@Test
	public void addNullItem() {
		Item item = null;
		try {
			sale.addItem(item);
		} catch(IllegalArgumentException e) {
			return;
		}
		fail("null item added to Sale Item-ArrayList");
	}
	
	@Test
	public void totalPriceNoItemsTest() {
		TotalPrice tp = sale.getTotalPrice();
		double expected = 0;
		double actual = tp.getAmount().getValue();
		assertEquals(expected, actual, 0.00001);
	}
	
	@Test
	public void totalPriceOneItemTest() {
		Taxes taxes = new Taxes();
		sale.addItem(item);
		
		double actual = sale.getTotalPrice().getAmount().getValue();
		double actual2 = sale.getTotalPrice().getAmount().getValue();
		double expected = item.getPrice().getValue() + item.getPrice().getValue() * taxes.getTaxRate();
		assertEquals(expected, actual, 0.00001);
		assertEquals(expected, actual2, 0.00001);
	}
	
	@Test
	public void totalPriceManyItemsTest() {
		for(int i = 0; i < 100; i++) {
			Item itemToAdd = createItem(i, "manyItem no. " + i, 1);
			sale.addItem(itemToAdd);
		}
		Taxes taxes = new Taxes();
		double actual = sale.getTotalPrice().getAmount().getValue();
		double expected = 100 + 100 * taxes.getTaxRate();
		assertEquals(expected, actual, 0.00001);
	}
	
	private Item createItem(int idNumber, String desc, double price) {
		Amount itemPrice = new Amount(price);
		ItemIdentifierDTO itemID = new ItemIdentifierDTO(idNumber);
		item = new Item(itemID, desc, itemPrice);
		return item;
	}
}
