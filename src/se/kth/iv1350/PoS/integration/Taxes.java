package se.kth.iv1350.PoS.integration;

/**
 * Represents the current taxes in a {@link Sale}.
 *
 */
public class Taxes {

	private static final double taxRate = 0.3;

	/**
	 * Returns the current <code>taxRate</code> as a decimal precentage.
	 * @return The <code>taxRate</code> as a decimal percentage. 
	 */
	public double getTaxRate() {
		return taxRate;
	}

}
