package se.kth.iv1350.PoS.model;

/**
 * Represents the information about a payment for a {@link Sale}.
 *
 */
public class PaymentDTO {

	private Amount paidAmount;
	
	/**
	 * Creates instance representing the information about a payment for a {@link Sale}.
	 * @param paidAmount The {@link Amount} paid.
	 */
	public PaymentDTO(Amount paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	/**
	 * Returns the <code>paidAmount</code> for this payment.
	 * @return The <code>paidAmount</code>.
	 */
	public Amount getAmount() {
		return paidAmount;
	}

}
