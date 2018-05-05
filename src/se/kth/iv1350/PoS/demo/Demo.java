package se.kth.iv1350.PoS.demo;

import se.kth.iv1350.PoS.view.View;

/**
 * Demonstrates the public interface of the Point-of-Sale system
 *
 */
public class Demo {
	
	/**
	 * Runs simulated sale in the system as placeholder for the real view layer.
	 */
	public static void trySaleProcess(View view) {
		view.startNewSale();
		view.enterItemToSaleByID(0);
		view.enterItemToSaleByID(1);
		view.enterItemToSaleByID(3);
		view.enterItemToSaleByID(-1);
		view.enterItemToSaleByID(500);
		view.noMoreItems();
		view.pay(20);
	}
}
