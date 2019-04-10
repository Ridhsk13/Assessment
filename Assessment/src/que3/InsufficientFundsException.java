package que3;

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException() {
		super("In sufficient funds in your account ");
	}
}
