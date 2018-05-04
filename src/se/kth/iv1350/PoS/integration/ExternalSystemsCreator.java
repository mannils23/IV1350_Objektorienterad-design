package se.kth.iv1350.PoS.integration;

/**
 * Responsible for creating instances of the classes interactng with any external systems.
 *
 */
public class ExternalSystemsCreator {

	private ExternalSystems externalSystems;

	private Printer printer;
	
	/**
	 * Creates instance responsible for creating instances of the classes interacting with external systems.
	 */
	public ExternalSystemsCreator() {
		printer = new Printer();
		externalSystems = new ExternalSystems();
	}
	
	/**
	 * Returns the {@link Printer} object interacting with the external printer.
	 * @return
	 */
	public Printer getPrinter() {
		return printer;
	}
	
	/**
	 * Returns the {@link ExternalSystems} object interacting with external systems.
	 * @return
	 */
	public ExternalSystems getExternalSystems() {
		return externalSystems;
	}

}
