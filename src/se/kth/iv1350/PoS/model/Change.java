package se.kth.iv1350.PoS.model;

/**
 * Represents the change to be given back from a {@link Sale}.
 *
 */
public class Change {

	private Amount change;

	public Change() {
		change = new Amount(0);
	}
	
	/**
	 * Creates an instance representing the change from a {@link Sale}.
	 * @param payment
	 * @param totalPrice
	 */
	public Change(PaymentDTO payment, TotalPrice totalPrice) {
		double valuePaid = payment.getAmount().getValue();
		double valueTotal = totalPrice.getAmount().getValue();
		change = new Amount(valuePaid - valueTotal);
	}

	/**
	 * Returns the change {@link Amount}.
	 * @return The <code>Amount</code> of change.
	 */
	public Amount getChangeAmount() {
		return change;
	}

}
