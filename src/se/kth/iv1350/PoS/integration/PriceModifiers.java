package se.kth.iv1350.PoS.integration;

/**
 * Keeps track of price modifiers for a sale
 * 
 */
public class PriceModifiers {

	private Taxes taxes;

/**
 * Creates a new instance with placeholders for future modifiers
 */
	public PriceModifiers() {
		taxes = new Taxes();
	}
	/**
	 * Returns discount for the specified customer.
	 * @param ID Customer to get discount for.
	 * @return The discount for the specified customer.
	 */
	
	/**
	 * Returns a object of <code>Taxes</code> representing the taxes to be considered in the sale.
	 * @return The <code>Taxes</code> object with information about the taxes.
	 */
	public Taxes getTaxes() {
		return taxes;
	}

}
