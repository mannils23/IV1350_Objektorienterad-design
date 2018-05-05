package se.kth.iv1350.PoS.model;
/**
 * Represents a number or a value.
 *
 */
public class Amount {

	private double value;
	
	/**
	 * Creates instance with <code>null</code> representing a number or value.
	 */
	public Amount() {
		
	}
	/**
	 * Creates instance representing a given number or value. Negative input sets value to 0.
	 * @param value The number or value to represent.
	 */
	public Amount(double value) {
		if(value < 0) {
			value = 0;
		} else {
			this.value = value;
		}
	}
	
	/**
	 * Returns the represented value.
	 * @return The represented value.
	 */
	public double getValue() {
		return value;
	}
	/**
	 * Adds the value of this {@link Amount} with a given {@link Amount}.
	 * @param amountToAdd The <code>Amount</code> to add.
	 */
	public void addAmount(Amount amountToAdd) {
		value += amountToAdd.getValue();
	}
	
	/**
	 * Sets a the value of the {@link Amount} to the given value. Negative input sets value to 0.
	 * @param newValue The new value for the <code>Amount</code>.
	 */
	public void setValue(double newValue) {
		if(newValue < 0) {
			value = 0;
		} else {
			value = newValue;
		}
	}
}
