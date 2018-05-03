package se.kth.iv1350.PoS.model;

import se.kth.iv1350.PoS.integration.Taxes;
import se.kth.iv1350.PoS.integration.PriceModifiers;

public class TotalPrice {

	private Amount amount;

	private Taxes taxes;

	public TotalPrice(Amount runningTotal) {
		amount = runningTotal;
	}
	
	public void applyTaxes(Taxes taxes) {
		this.taxes = taxes;
		double newValue = calculateValueAfterTaxes(taxes.getTaxRate());
		amount.setValue(newValue);
	}
	
	private double calculateValueAfterTaxes(double taxRate) {
		return amount.getValue() * taxRate;
	}
	
	public Amount getAmount() {
		return amount;
	}
	
	public Taxes getTaxes() {
		return taxes;
	}
}
