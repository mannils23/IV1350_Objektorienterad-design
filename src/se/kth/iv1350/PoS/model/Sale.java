package se.kth.iv1350.PoS.model;

import java.util.*;
import se.kth.iv1350.PoS.integration.*;

/**
 * Represent an active sale
 *
 */
public class Sale {

	private List<Item> items;

	private Amount runningTotal;

	private Discount discount;

	private Taxes taxes;

	private SaleDTO saleDTO;

	private TotalPrice totalPrice;

	private Change change;
	
	private PriceModifiers priceModifiers;
	
	/**
	 * Creates a new instance, representing a sale.
	 */
	public Sale() {
		priceModifiers = new PriceModifiers();
		items = new ArrayList<Item>();
	}
	/**
	 * Adds an <code>Item</code> to the sale.
	 * @param item The item to be added.
	 */
	public void addItem(Item item) {
		items.add(item);
	}
	/**
	 * Returns the list of all items in the current sale.
	 * @return The list of items.
	 */
	public List<Item> getItems() {
		return items;
	}
	/**
	 * Returns a <code>SaleDTO</code> object with information from the sale.
	 * @return The <code>SaleDTO</code> with sale information.
	 */
	public SaleDTO getSaleInformation() {
		SaleDTO saleInfo = new SaleDTO();
		return saleInfo;
	}

	public void increaseQuantity(ItemIdentifierDTO itemIdentifier) {

	}

	public TotalPrice getTotalPrice() {
		TotalPrice totalPrice = new TotalPrice(runningTotal);
		totalPrice.addPriceModifiers(priceModifiers);
		return totalPrice;
	}

	public void addDiscounts(Discount discounts) {

	}

	public void pay(PaymentDTO payment) {

	}

	public Amount getChange() {
		return null;
	}

	public void addItemWithQuantity(Item item, int quantity) {

	}

	public int getDiscount() {
		return 0;
	}
	public PriceModifiers getPriceModifiers() {
		return priceModifiers;
	}

}
