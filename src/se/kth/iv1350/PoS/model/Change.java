package se.kth.iv1350.PoS.model;

/**
 * Represents the change to be given back from a {@link Sale}.
 *
 */
public class Change {

	private Amount change;

	/**
	 * Creates an instance representing the change from a {@link Sale}.
	 * @param payment
	 * @param totalPrice
	 */
	public Change(PaymentDTO payment, TotalPrice totalPrice) {
		Amount paidAmount = payment.getAmount();
		Amount totalAmount = totalPrice.getAmount();
		change = new Amount(paidAmount.getValue() - totalAmount.getValue());
	}

	/**
	 * Returns the change {@link Amount}.
	 * @return The <code>Amount</code> of change.
	 */
	public Amount getChangeAmount() {
		return change;
	}

}
