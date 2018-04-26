package se.kth.iv1350.PoS.model;

import se.kth.iv1350.PoS.integration.Discount;
import se.kth.iv1350.PoS.integration.Printer;

public class Receipt {

	private int numberOfItems;

	private Amount totalPrice;

	private Discount discounts;

	private Amount change;

	private String currency;

	//private ArrayList items;

	private Amount payment;

	private Printer printer;

	public Receipt Receipt(SaleDTO saleInfo) {
		return null;
	}

	public void printReceipt() {

	}

}
