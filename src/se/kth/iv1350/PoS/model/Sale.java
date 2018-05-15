package se.kth.iv1350.PoS.model;

import java.util.*;
import se.kth.iv1350.PoS.integration.*;

/**
 * Represents an active sale.
 *
 */
public class Sale {

	private ArrayList<Item> items;
	
	private List<SaleObserver> saleObservers = new ArrayList<>();

	private Amount runningTotal;

	private Taxes taxes;

	private TotalPrice totalPrice;

	private Change change;
	
	private PaymentDTO payment;
	
	/**
	 * Creates a new instance, representing a sale.
	 */
	public Sale() {
		taxes = new Taxes();
		items = new ArrayList<Item>();
		runningTotal = new Amount(0);
		change = new Change(payment, totalPrice);
		payment = new PaymentDTO(null);
	}
	
	public void addSaleObserver(SaleObserver obs) {
		saleObservers.add(obs);
	}
	
	public void addSaleObservers(List<SaleObserver> saleObservers) {
		this.saleObservers = saleObservers;
	}
	
	private void notifyObservers() {
		for(SaleObserver obs : saleObservers) {
			obs.newAmount(calculateRevenue());
		}
	}
	/**
	 * Adds an {@link Item} to the {@link Sale} and updates the <code>runningTotal</code>.
	 * @param item The <code>item</code> to be added.
	 */
	public void addItem(Item item) {
		if(item != null) {
			items.add(item);
			updateRunningTotal();
			return;
		}
		throw new IllegalArgumentException();
	}
	
	/**
	 * Returns the {@link ArrayList} of all {@link Items} in the current {@link Sale}.
	 * @return The <code>ArrayList</code> of items.
	 */
	public ArrayList<Item> getItems() {
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
		totalPrice = new TotalPrice(runningTotal);
		totalPrice.applyTaxes(taxes);
		return totalPrice;
	}
	/**
	 * Pays the current {@link Sale} with a {@link PaymentDTO};
	 * @param payment The <code>PaymentDTO</code> representing the payment.
	 */
	public void pay(PaymentDTO payment) {
		this.payment = payment;
		generateChange();
		notifyObservers();
	}
	/**
	 * Returns the {@link Change} of the current {@link Sale}.
	 * @return The <code>Change</code> representing the change of the <code>Sale</code>.
	 */
	public Change getChange() {
		return change;
	}
	/**
	 * Returns the payment information as a {@link PaymentDTO}
	 * @return The <code>PaymentDTO</code> representing the payment for the <code>Sale</code>.
	 */
	public PaymentDTO getPayment() {
		return payment;
	}
	
	private void updateRunningTotal() {
		runningTotal = new Amount();
		for(Item item : items) {
			runningTotal.addAmount(item.getPrice());
		}
	}
	
	private void generateChange() {
		change = new Change(payment, totalPrice);
	}
	
	private Amount calculateRevenue() {
		Amount revenue = new Amount(payment.getAmount().getValue() - change.getChangeAmount().getValue());
		return revenue;
	}
}
	

