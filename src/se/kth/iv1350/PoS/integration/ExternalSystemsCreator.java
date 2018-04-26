package se.kth.iv1350.PoS.integration;

public class ExternalSystemsCreator {

	private ExternalSystems externalSystems;

	private Printer printer;

	public ExternalSystemsCreator() {
		printer = new Printer();
		externalSystems = new ExternalSystems();
	}
	
	public Printer getPrinter() {
		return printer;
	}
	
	public ExternalSystems getExternalSystems() {
		return externalSystems;
	}

}
