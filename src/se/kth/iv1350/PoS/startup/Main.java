package se.kth.iv1350.PoS.startup;

import se.kth.iv1350.PoS.controller.Controller;
import se.kth.iv1350.PoS.view.View;
import se.kth.iv1350.PoS.integration.*;

/**
 * Holds the <code>main</code> method. Performs all startup of the application.
 * @author Marcus
 *
 */
public class Main {
	
	private View view;
	private Controller controller;
	private ExternalSystemsCreator externalSystemsCreator;
	private CatalogCreator catalogCreator;

	/**
	 * Starts the application and runs a demo.
	 * @param args The application does not take any command line parameters.
	 * 
	 */
	public void main(String[] args) {
		externalSystemsCreator = new ExternalSystemsCreator();
		catalogCreator = new CatalogCreator();
		controller = new Controller(catalogCreator,externalSystemsCreator);
		view = new View(controller);
		
		view.trySale();
		
	}

}
