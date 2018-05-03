package se.kth.iv1350.PoS.model;

public class Amount {

	private double value;
	
	public Amount() {
		
	}
	
	public Amount(double value) {
		this.value = value;
	}
	

	public double getValue() {
		return value;
	}
	
	public void addAmount(Amount amountToAdd) {
		value += amountToAdd.getValue();
	}
	
	public void setValue(double newValue) {
		value = newValue;
	}

}
