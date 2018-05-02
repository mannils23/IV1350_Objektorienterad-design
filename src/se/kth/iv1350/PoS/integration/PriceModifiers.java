package se.kth.iv1350.PoS.integration;

import se.kth.iv1350.PoS.model.CustomerDTO;

/**
 * Keeps track of price modifiers for a sale
 * 
 */
public class PriceModifiers {

	private Taxes taxes;

	private Discount discount;
/**
 * Creates a new instance with placeholders for future modifiers
 */
	public PriceModifiers() {
		taxes = new Taxes();
		discount = new Discount();
	}
	/**
	 * Returns discount for the specified customer.
	 * @param ID Customer to get discount for.
	 * @return The discount for the specified customer.
	 */
	public Discount getDiscount(CustomerDTO ID) {
		return discount;
	}
	
	/**
	 * Returns a object of <code>Taxes</code> representing the taxes to be considered in the sale.
	 * @return The <code>Taxes</code> object with information about the taxes.
	 */
	public Taxes getTaxes() {
		return taxes;
	}

}
