package se.kth.iv1350.PoS.exception;

public class OperationFailedException extends Exception{
	
	
	public OperationFailedException(String msg, Exception cause) {
		super(msg, cause);
	}
}
