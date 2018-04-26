package se.kth.iv1350.PoS.startup;

import se.kth.iv1350.PoS.controller.Controller;
import se.kth.iv1350.PoS.integration.CatalogCreator;
import se.kth.iv1350.PoS.integration.Printer;
import se.kth.iv1350.PoS.integration.ExternalSystems;
import se.kth.iv1350.PoS.integration.Taxes;
import se.kth.iv1350.PoS.view.View;
import se.kth.iv1350.PoS.integration.ExternalSystemsCreator;

/**
 * Holds the <code>main</code> method. Performs all startup of the application.
 * @author Marcus
 *
 */
public class Main {

	private View view;

	private Controller controller;

	private CatalogCreator catalogCreator;

	private Printer printer;

	private ExternalSystems externalSystems;

	private Taxes taxes;

	private ExternalSystemsCreator externalSystemsCreator;

	/**
	 * Starts the application
	 * @param args The application does not take any command line parameters.
	 * 
	 */
	public void main(String[] args) {
		externalSystemsCreator = new ExternalSystemsCreator();
		

	}

}
