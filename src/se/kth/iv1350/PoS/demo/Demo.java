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
		System.out.println("DEMO1: Process Sale \n");
		view.startNewSale();
		
		System.out.println("DEMO MESSAGE: adding items to sale: normal \n");
		view.enterItemToSaleByID(0);
		view.enterItemToSaleByID(1);		// ADDING ITEMS
		view.enterItemToSaleByID(3);
		
		System.out.println("DEMO MESSAGE: adding items to sale: item ID does not exist \n");
		view.enterItemToSaleByID(-1);
		view.enterItemToSaleByID(500);		// ADDING ITEMS BY NON-EXISTENT ID
		
		System.out.println("DEMO MESSAGE: indicate no more items \n");
		view.noMoreItems();
		
		System.out.println("DEMO MESSAGE: send payment of 20 \n");
		view.pay(20);
		
		System.out.println("DEMO1 Finished.");
		System.out.println("DEMO2: Database Failure \n");
		
		System.out.println("DEMO MESSAGE: Adding item demonstrating database failure \n");
		view.enterItemToSaleByID(18);
	}
}
