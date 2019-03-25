package sec10_07;

public class BalanceInsufficientException extends RuntimeException { //Exception 혹은 RuntimeException
	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) {
		super(message);
	}

}
