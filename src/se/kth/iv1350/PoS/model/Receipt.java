package se.kth.iv1350.PoS.model;

import java.util.ArrayList;

import se.kth.iv1350.PoS.integration.Printer;

/**
 * Represent the {@link Sale} information for a receipt.
 *
 */
public class Receipt {

	private TotalPrice totalPrice;

	private Change change;

	private ArrayList items;

	private PaymentDTO payment;

	private Printer printer;

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

}
