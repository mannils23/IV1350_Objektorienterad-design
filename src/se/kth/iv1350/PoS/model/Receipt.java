package se.kth.iv1350.PoS.model;

import se.kth.iv1350.PoS.integration.Printer;

public class Receipt {

	private int numberOfItems;

	private Amount totalPrice;

	private Amount change;

	private String currency;

	//private ArrayList items;

	private Amount payment;

	private Printer printer;

	public Receipt(SaleDTO saleInfo) {

	}

	public void printReceipt() {

	}

}
