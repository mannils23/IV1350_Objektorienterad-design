package se.kth.iv1350.PoS.model;

import java.util.ArrayList;

import se.kth.iv1350.PoS.integration.Printer;

/**
 * Represent the {@link Sale} information for a receipt.
 *
 */
public class Receipt {

	private final TotalPrice totalPrice;

	private final Change change;

	private final ArrayList items;

	private final PaymentDTO payment;

	private final Printer printer;

	/**
	 * Creates instance representing the {@link Sale} information for the {@link Receipt}.
	 * @param saleInfo The information for the <code>Receipt</code>.
	 */
	public Receipt(SaleDTO saleInfo) {
		totalPrice = saleInfo.getTotalPrice();
		change = saleInfo.getChange();
		items = saleInfo.getItems();
		payment = saleInfo.getPayment();
		printer = new Printer();
	}
	/**
	 * Prints the receipt through an external {@link Printer}.
	 */
	public void printReceipt() {
		printer.printReceipt(this);
	}
	
	/**
	 * Returns the {@link TotalPrice} from the finished {@link Sale}.
	 * @return The <code>TotalPrice</code>.
	 */
	public TotalPrice getTotalPrice() {
		return totalPrice;
	}
	
	/**
	 * Returns the {@link Change} from the finished {@link Sale}.
	 * @return The <code>Change</code>.
	 */
	public Change getChange() {
		return change;
	}
	
	/**
	 * Returns the {@link Item}s from the finished {@link Salen}.
	 * @return The <code>Item</code>s.
	 */
	public ArrayList<Item> getItems() {
		return items;
	}
	
	/**
	 * Returns the {@link PaymentDTO} from the finished {@link Sale}.
	 * @return The <code>PaymentDTO</code>.
	 */
	public PaymentDTO getPayment() {
		return payment;
	}

}
