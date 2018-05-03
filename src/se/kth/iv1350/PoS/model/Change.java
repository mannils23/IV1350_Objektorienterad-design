package se.kth.iv1350.PoS.model;

public class Change {

	private Amount change;

	public Change(PaymentDTO payment, TotalPrice totalPrice) {
		Amount paidAmount = payment.getAmount();
		Amount totalAmount = totalPrice.getAmount();
		change = new Amount(paidAmount.getValue() - totalAmount.getValue());
	}

	public Amount getChange() {
		return change;
	}

}
