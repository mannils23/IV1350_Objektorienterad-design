package se.kth.iv1350.PoS.model;
public class PaymentDTO {

	private Amount paidAmount;

	public PaymentDTO(Amount paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Amount getAmount() {
		return paidAmount;
	}

}
