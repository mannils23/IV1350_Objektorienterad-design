package se.kth.iv1350.PoS.integration;

import se.kth.iv1350.PoS.model.SaleDTO;

/**
 * Handles iteractions with any external systems.
 * @author Marcus
 *
 */
public class ExternalSystems {
	
	/**
	 * Creates instance that handles interaction with any external systems.
	 */
	public ExternalSystems() {
	}
	/**
	 * Sends information about a {@link Sale} to any external systems.
	 * @param saleInfo The information about a <code>Sale</code>.
	 */
	public void recordSale(SaleDTO saleInfo) {
			System.out.print("Sale recorded in external systems.");
	}

}
