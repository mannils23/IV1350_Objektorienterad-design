package se.kth.iv1350.PoS.exception;

/**
 * Thrown when something goes wrong and the exception is not suitable for the view layer.
 *
 */
public class OperationFailedException extends Exception{
	
	/**
	 * Creates exception with a error message and the exception not suitable for the view.
	 * @param msg The error message.
	 * @param cause The exception not suitable for the view.
	 */
	public OperationFailedException(String msg, Exception cause) {
		super(msg, cause);
	}
}
