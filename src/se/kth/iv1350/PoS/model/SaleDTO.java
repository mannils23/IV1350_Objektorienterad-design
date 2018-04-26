package se.kth.iv1350.PoS.model;

import se.kth.iv1350.PoS.integration.Discount;

public class SaleDTO {

	private int numberOfItems;

	private Amount totalPrice;

	private Discount discount;

	private Amount change;

	private String currency;

	//private ArrayList items;

	private Amount payment;

	public SaleDTO SaleDTO() {
		return null;
	}

	public int getNumberOfItems() {
		return 0;
	}

	public Amount getTotalPrice() {
		return null;
	}

	public Discount getDiscount() {
		return null;
	}

	public Amount getChange() {
		return null;
	}

	public Amount getCurrency() {
		return null;
	}

	/*public ArrayList getItems() {
		return null;
	}*/

	public Amount getPayment() {
		return null;
	}

}
