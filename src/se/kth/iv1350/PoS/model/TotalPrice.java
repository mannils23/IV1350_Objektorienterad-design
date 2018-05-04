package se.kth.iv1350.PoS.model;

import se.kth.iv1350.PoS.integration.Taxes;
import se.kth.iv1350.PoS.integration.PriceModifiers;

/**
 * Represents to total price of a finished {@link Sale}.
 *
 */
public class TotalPrice {

	private Amount amount;

	private Taxes taxes;
	
	/**
	 * Creates instance representing the total price of a finished {@link Sale}.
	 * @param runningTotal The running total cost of the current <code>Sale</code>.
	 */
	public TotalPrice(Amount runningTotal) {
		amount = runningTotal;
	}
	/**
	 * Applies {@link Taxes} to the {@link TotalPrice}.
	 * @param taxes The taxes to add to the <code>TotalPrice</code>.
	 */
	public void applyTaxes(Taxes taxes) {
		this.taxes = taxes;
		double newValue = calculateValueAfterTaxes(taxes.getTaxRate());
		amount.setValue(newValue);
	}
	
	private double calculateValueAfterTaxes(double taxRate) {
		return amount.getValue() * taxRate;
	}
	
	/**
	 * Returns the {@link Amount} of the {@link TotalPrice}.
	 * @return The <code>Amount</code> of the <code>TotalPrice</code>.
	 */
	public Amount getAmount() {
		return amount;
	}
	/**
	 * Returns the {@link Taxes} added to the {@link TotalPrice}.
	 * @return The <code>Taxes</code> added to the <code>TotalPrice</code>.
	 */
	public Taxes getTaxes() {
		return taxes;
	}
}
