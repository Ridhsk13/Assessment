package que3;

public class InvalidAmountException extends Exception {
	
	public InvalidAmountException() {
		super("You have given invalid amount. We cannot process this transaction");
	}
}
