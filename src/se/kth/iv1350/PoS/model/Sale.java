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

	private Taxes taxes;

	private SaleDTO saleDTO;

	private TotalPrice totalPrice;

	private Change change;
	
	private PaymentDTO payment;
	
	
	/**
	 * Creates a new instance, representing a sale.
	 */
	public Sale() {
		taxes = new Taxes();
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

	public TotalPrice getTotalPrice() {
		TotalPrice totalPrice = new TotalPrice(runningTotal);
		totalPrice.applyTaxes(taxes);
		return totalPrice;
	}

	public void pay(PaymentDTO payment) {
		this.payment = payment;
		return;
	}

	public Change getChange() {
		change = new Change(payment, totalPrice);
		return change;
	}
}
