package se.kth.iv1350.PoS.model;

import se.kth.iv1350.PoS.integration.Discount;
import se.kth.iv1350.PoS.integration.Taxes;
import se.kth.iv1350.PoS.integration.PriceModifiers;

public class TotalPrice {

	private Amount amount;

	private Discount discount;

	private Taxes taxes;

	private PriceModifiers priceModifiers;

	public TotalPrice(Amount runningTotal) {
		amount = runningTotal;
	}
	
	public void addPriceModifiers(PriceModifiers priceModifiers) {
		taxes = priceModifiers.getTaxes();
		amount.addAmount(taxes.getAmount());
	}

}
