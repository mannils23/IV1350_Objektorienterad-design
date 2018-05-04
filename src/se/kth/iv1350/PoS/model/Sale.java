package se.kth.iv1350.PoS.model;

import java.util.*;
import se.kth.iv1350.PoS.integration.*;

/**
 * Represents an active sale.
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
	 * Adds an {@link Item} to the {@link Sale}.
	 * @param item The <code>item</code> to be added.
	 */
	public void addItem(Item item) {
		items.add(item);
	}
	/**
	 * Returns the {@link List} of all {@link Items} in the current {@link Sale}.
	 * @return The <code>List</code> of items.
	 */
	public List<Item> getItems() {
		return items;
	}
	/**
	 * Returns a {@link SaleDTO} object with information from the {@link Sale}.
	 * @return The <code>SaleDTO</code> with <code>Sale</code> information.
	 */
	public SaleDTO getSaleInformation() {
		SaleDTO saleInfo = new SaleDTO(this);
		return saleInfo;
	}
	/**
	 * Returns the {@link TotalPrice} of a {@link Sale}.
	 * @return The <code>TotalPrice</code> of the current <code>Sale</code>.
	 */
	public TotalPrice getTotalPrice() {
		TotalPrice totalPrice = new TotalPrice(runningTotal);
		totalPrice.applyTaxes(taxes);
		return totalPrice;
	}
	/**
	 * Pays the current {@link Sale} with a {@link PaymentDTO};
	 * @param payment The <code>PaymentDTO</code> representing the payment.
	 */
	public void pay(PaymentDTO payment) {
		this.payment = payment;
		return;
	}
	/**
	 * Returns the {@link Change} of the current {@link Sale}.
	 * @return The <code>Change</code> representing the change of the <code>Sale</code>.
	 */
	public Change getChange() {
		change = new Change(payment, totalPrice);
		return change;
	}
	/**
	 * Returns the payment information as a {@link PaymentDTO}
	 * @return The <code>PaymentDTO</code> representing the payment for the <code>Sale</code>.
	 */
	public PaymentDTO getPayment() {
		return payment;
	}
}
