package se.kth.iv1350.PoS.exception;

import se.kth.iv1350.PoS.model.ItemIdentifierDTO;

/**
 * 
 * @author Marcus
 *
 */
public class ItemDoesNotExistException extends Exception {
	
	private ItemIdentifierDTO invalidIdentifier;
	
	public ItemDoesNotExistException(ItemIdentifierDTO invalidIdentifier){
		super("Unable to find " + invalidIdentifier.getIdentifierValue() + ", since it is not in the catalog.");
		this.invalidIdentifier = invalidIdentifier;
	}
	
	public ItemIdentifierDTO getInvalidIdentifier() {
		return invalidIdentifier;
	}
}
