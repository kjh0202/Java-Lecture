package OpenChallenge_01;

public class IncorectPasswordException extends Exception {
	public IncorectPasswordException() { }
	public IncorectPasswordException(String message) {
		super(message);
	}
}
