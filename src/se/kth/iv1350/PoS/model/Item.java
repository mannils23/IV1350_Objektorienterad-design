package se.kth.iv1350.PoS.model;

public class Item {
	
	private final ItemIdentifierDTO identifier;

	private final String description;

	private final Amount price;

	public Item(ItemIdentifierDTO identifier, String description, Amount price) {
		this.identifier = identifier;
		this.description = description;
		this.price = price;
	}
	
	public Item() {
		identifier = null;
		description = null;
		price = null;
	}
	
	public ItemIdentifierDTO getIdentifier() {
		return identifier;
	}

}
