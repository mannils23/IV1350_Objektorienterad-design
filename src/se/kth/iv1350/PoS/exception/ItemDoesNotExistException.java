package se.kth.iv1350.PoS.exception;

import se.kth.iv1350.PoS.model.ItemIdentifierDTO;

/**
 * Thrown when the specified identifier does not belong to any item in {@link ItemCatalog}
 *
 */
public class ItemDoesNotExistException extends Exception {
	
	private ItemIdentifierDTO invalidIdentifier;
	
	/**
	 * Creates exception with specified identifier.
	 * @param invalidIdentifier The identifier not belonging to any item.
	 */
	public ItemDoesNotExistException(ItemIdentifierDTO invalidIdentifier){
		super("Unable to find " + invalidIdentifier.getIdentifierValue() + ", since it is not in the catalog.");
		this.invalidIdentifier = invalidIdentifier;
	}
	
	/**
	 * Returns the invalid identfier causing the exception.
	 * @return The invalid identifier.
	 */
	public ItemIdentifierDTO getInvalidIdentifier() {
		return invalidIdentifier;
	}
}
