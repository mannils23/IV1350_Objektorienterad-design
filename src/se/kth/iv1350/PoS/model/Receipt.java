package se.kth.iv1350.PoS.model;

import se.kth.iv1350.PoS.integration.Printer;

/**
 * Represent the {@link Sale} information for a receipt.
 *
 */
public class Receipt {

	private int numberOfItems;

	private Amount totalPrice;

	private Amount change;

	private String currency;

	//private ArrayList items;

	private Amount payment;

	private Printer printer;

	/**
	 * Creates instance representing the {@link Sale} information for the {@link Receipt}.
	 * @param saleInfo The information for the <code>Receipt</code>.
	 */
	public Receipt(SaleDTO saleInfo) {

	}
	/**
	 * Prints the receipt through an external {@link Printer}.
	 */
	public void printReceipt() {

	}

}
