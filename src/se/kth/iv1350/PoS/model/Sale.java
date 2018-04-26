package se.kth.iv1350.PoS.model;

import se.kth.iv1350.PoS.integration.Discount;
import se.kth.iv1350.PoS.integration.Taxes;

public class Sale {

	//private ArrayList items;

	private Amount runningTotal;

	private Discount discount;

	private Taxes taxes;

	private SaleDTO saleDTO;

	private TotalPrice totalPrice;

	private Change change;

	public Sale Sale() {
		return null;
	}

	public void addItem(Item item) {

	}

	public SaleDTO getSaleInformation() {
		return null;
	}

	public void increaseQuantity(ItemIdentifierDTO itemIdentifier) {

	}

	public TotalPrice getTotalPrice() {
		return null;
	}

	public void addDiscounts(Discount discounts) {

	}

	public void pay(PaymentDTO payment) {

	}

	public Amount getChange() {
		return null;
	}

	public void addItemWithQuantity(Item item, int quantity) {

	}

	public int getDiscount() {
		return 0;
	}

}
