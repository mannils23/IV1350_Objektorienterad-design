package se.kth.iv1350.PoS.model;

/**
 * Represents the change to be given back from a {@link Sale}.
 *
 */
public class Change {

	private Amount change;

	/**
	 * Creates an instance of {@link Change} where the <code>Amount</code> value is 0.
	 */
	public Change() {
		change = new Amount(0);
	}
	
	/**
	 * Creates an instance representing the change from a {@link Sale}.
	 * @param payment
	 * @param totalPrice
	 */
	public Change(PaymentDTO payment, TotalPrice totalPrice) {
		if(paymentLargerThanTotalPrice(payment, totalPrice)) {
			change = calculateAmountDifference(payment, totalPrice);
		}
		else{
			change = new Amount(0);
		}
	}

	/**
	 * Returns the change {@link Amount}.
	 * @return The <code>Amount</code> of change.
	 */
	public Amount getChangeAmount() {
		return change;
	}
	
	private boolean paymentLargerThanTotalPrice(PaymentDTO payment, TotalPrice totalPrice) {
		return (payment.getAmount().getValue() > totalPrice.getAmount().getValue());
	}
	
	private Amount calculateAmountDifference(PaymentDTO payment, TotalPrice totalPrice) {
		double valuePaid = payment.getAmount().getValue();
		double valueTotal = totalPrice.getAmount().getValue();
		return new Amount(valuePaid - valueTotal);
	}

}
