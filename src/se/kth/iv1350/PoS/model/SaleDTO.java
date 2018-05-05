package se.kth.iv1350.PoS.model;

import java.util.ArrayList;

import se.kth.iv1350.PoS.integration.Taxes;

/**
 * Contains information about a <code>Sale</code> at a current time. Instances are immutable.
 *
 */
public class SaleDTO {
	
	private final TotalPrice totalPrice;

	private final Change change;

	private final ArrayList<Item> items;

	private final PaymentDTO payment;
	
	private final Taxes taxes;

	
	/**
	 * Creates an instance with the current information in {@link Sale}.
	 * @param sale The <code>Sale</code> object to take information from.
	 */
	public SaleDTO(Sale sale) {
		totalPrice = sale.getTotalPrice();
		change = sale.getChange();
		items = sale.getItems();
		payment = sale.getPayment();
		taxes = totalPrice.getTaxes();
		
	}
	/**
	 * Returns the {@link TotalPrice}.
	 * @return The <code>TotalPrice</code>.
	 */
	public TotalPrice getTotalPrice() {
		return totalPrice;
	}
	/**
	 * Returns the {@link Change}.
	 * @return The <code>Change</code>.
	 */
	public Change getChange() {
		return change;
	}
	/**
	 * Returns all the {@link Item} objects in a {@link List}.
	 * @return All <code>Item</code> objects in a <code>List</code>.
	 */
	public ArrayList<Item> getItems() {
		return items;
	}
	/**
	 * Returns the {@link PaymentDTO}.
	 * @return The <code>PaymentDTO</code>.
	 */
	public PaymentDTO getPayment() {
		return payment;
	}
	
	/**
	 * Returns the {@link Taxes} applied for this {@link Sale}.
	 * @return The <code>Taxes</code> for the <code>Sale</code>.
	 */
	public Taxes getTaxes() {
		return taxes;
	}
}
