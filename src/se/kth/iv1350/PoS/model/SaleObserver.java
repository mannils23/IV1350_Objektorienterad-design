package se.kth.iv1350.PoS.model;

/**
 * A listener interface for receiving notifications about the total amount paid.
 * The class interested in such notifications implements this interface, and the object created with that class
 * is registered with {@link se.kth.iv1350.PoS.controller.Controller#addSaleObserver(SaleObserver)}.
 * When the total amount paid changes, that object's {@link #newAmount newAmount} method is invoked.
 */
public interface SaleObserver {
	
/**
 * Invoked when a sale has been paid.
 * @param sale The sale that was paid.
 */
	void newAmount(Amount revenue);
}
