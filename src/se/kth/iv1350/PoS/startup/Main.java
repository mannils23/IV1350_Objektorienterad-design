package se.kth.iv1350.PoS.startup;

import se.kth.iv1350.PoS.controller.Controller;
import se.kth.iv1350.PoS.demo.DemoException;
import se.kth.iv1350.PoS.demo.DemoProcessSale;
import se.kth.iv1350.PoS.view.View;
import se.kth.iv1350.PoS.integration.*;

/**
 * Holds the <code>main</code> method. Performs all startup of the application.
 * @author Marcus
 *
 */
public class Main {
	
	private static View view;
	private static Controller controller;
	private static ExternalSystemsCreator externalSystemsCreator;
	private static CatalogCreator catalogCreator;

	/**
	 * Starts the application and runs a demo.
	 * @param args The application does not take any command line parameters.
	 * 
	 */
	public static void main(String[] args) {
		
		/*				DEMO1				*/
		externalSystemsCreator = new ExternalSystemsCreator();
		catalogCreator = new CatalogCreator();
		controller = new Controller(catalogCreator,externalSystemsCreator);
		view = new View(controller);
		DemoProcessSale.trySaleProcess(view);
		
		/*				DEMO2				*/
		/*externalSystemsCreator = new ExternalSystemsCreator();
		catalogCreator = new CatalogCreator();
		controller = new Controller(catalogCreator,externalSystemsCreator);
		view = new View(controller);
		DemoException.trySaleProcess(view);*/
	}
}