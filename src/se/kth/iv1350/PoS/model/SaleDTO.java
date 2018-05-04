package se.kth.iv1350.PoS.model;

import java.util.List;

/**
 * Contains information about a <code>Sale</code> at a current time. Instances are immutable.
 *
 */
public class SaleDTO {
	
	private final TotalPrice totalPrice;

	private final Change change;

	private final List<Item> items;

	private final PaymentDTO payment;
	
	/**
	 * Creates an instance with the current information in {@link Sale}.
	 * @param sale The <code>Sale</code> object to take information from.
	 */
	public SaleDTO(Sale sale) {
		totalPrice = sale.getTotalPrice();
		change = sale.getChange();
		items = sale.getItems();
		payment = sale.getPayment();
		
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
	public Amount getChange() {
		return null;
	}
	/**
	 * Returns all the {@link Item} objects in a {@link List}.
	 * @return All <code>Item</code> objects in a <code>List</code>.
	 */
	public List<Item> getItems() {
		return null;
	}
	/**
	 * Returns the {@link PaymentDTO}.
	 * @return The <code>PaymentDTO</code>.
	 */
	public PaymentDTO getPayment() {
		return payment;
	}

}
