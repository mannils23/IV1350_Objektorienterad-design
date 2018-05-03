package se.kth.iv1350.PoS.model;

import java.util.List;

/**
 * Contains static information about a <code>Sale</code> at a current time.
 *
 */
public class SaleDTO {
	
	private final TotalPrice totalPrice;

	private final Change change;

	private final List<Item> items;

	private final PaymentDTO payment;
	
	/**
	 * Creates an instance with the current information in <code>Sale</code>.
	 * @param sale The <code>Sale</code> object to take information from.
	 */
	public SaleDTO(Sale sale) {
		totalPrice = sale.getTotalPrice();
		change = sale.getChange();
		items = sale.getItems();
		payment = sale.getPayment();
		
	}
	/**
	 * Returns the <code>TotalPrice</code>.
	 * @return The <code>TotalPrice</code>.
	 */
	public TotalPrice getTotalPrice() {
		return totalPrice;
	}
	/**
	 * Returns the <code>Cangee</code>.
	 * @return The <code>Change</code>.
	 */
	public Amount getChange() {
		return null;
	}
	/**
	 * Returns all the <code>Item</code> objects in a <code>List</code>.
	 * @return All <code>Item</code> objects in a <code>List</code>.
	 */
	public List<Item> getItems() {
		return null;
	}
	/**
	 * Returns the <code>Payment</code>.
	 * @return The <code>Payment</code>.
	 */
	public PaymentDTO getPayment() {
		return payment;
	}

}
