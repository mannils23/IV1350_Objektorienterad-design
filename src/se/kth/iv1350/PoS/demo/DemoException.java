package se.kth.iv1350.PoS.demo;

import se.kth.iv1350.PoS.view.View;

/**
 * Demonstrates the public interface (exceptions) of the Point-of-Sale system
 *
 */
public class DemoException {
	
	/**
	 * Runs simulated sale in the system as placeholder for the real view layer.
	 */
	public static void trySaleProcess(View view) {
		System.out.println("#######################");
		System.out.println("## DEMO2: Exceptions ##");
		System.out.println("####################### \n");
		view.startNewSale();
		
		System.out.println("################################################################");
		System.out.println("## DEMO MESSAGE: adding items to sale: item ID does not exist ##");
		System.out.println("################################################################ \n");
		view.enterItemToSaleByID(-1);
		view.enterItemToSaleByID(500);		// ADDING ITEMS BY NON-EXISTENT ID
		
		System.out.println("###################################################################");
		System.out.println("## DEMO MESSAGE: Adding itemID 18 demonstrating database failure ##");
		System.out.println("################################################################### \n");
		view.enterItemToSaleByID(18);
		
		System.out.println("####################");
		System.out.println("## DEMO2 Finished ##");
		System.out.println("####################");
		
	}
}