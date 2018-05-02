package se.kth.iv1350.PoS.model;

public class Amount {

	private double value;

	private String currency;

	public double getAmount() {
		return value;
	}
	
	public void addAmount(Amount amountToAdd) {
		value += amountToAdd.getAmount();
	}

}
