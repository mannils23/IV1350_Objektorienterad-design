package se.kth.iv1350.PoS.model;

/**
 * Represents a value used for identifying an {@link Item}.
 *
 */
public class ItemIdentifierDTO { 

	private final int identifierValue;
	
	/**
	 * Creates instance representing a value used for identifying an {@link Item}.
	 * @param value The value identifying a specific <code>Item</code>.
	 */
	public ItemIdentifierDTO(int value) {
		identifierValue = value;
	}
	
	/**
	 * Returns the value identifying a specific {@link Item}.
	 * @return The value identifying a specific <code>Item</code>.
	 */
	public int getIdentifierValue() {
		return identifierValue;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if( !(o instanceof ItemIdentifierDTO)) {
			return false;
		}
		ItemIdentifierDTO otherID = (ItemIdentifierDTO) o;
		
		return Integer.compare(this.identifierValue, otherID.identifierValue) == 0;
	}
}
