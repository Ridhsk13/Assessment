package que3;

public class Account {
	private int accountNumber;
	private int balance;
	private static int totalAccounts = 0;
	
	public Account(int accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		totalAccounts++;
	}
	
	public void deposit (int amount) throws InvalidAmountException{
		if(amount > 0) {
			balance += amount;
			System.out.println("Current Balance : "+ balance);
		} else {
			throw new InvalidAmountException();
		}
		
	}
	
	public void withdraw(int amount) throws InvalidAmountException, InsufficientFundsException{
		if(amount > 0) {
			if((balance -= amount) > 0 ) {
				balance -= amount;
				System.out.println("Current Balance : "+ balance);
			} else {
				throw new InsufficientFundsException();
			}
			
		} else {
			throw new InvalidAmountException();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Account account1 = new Account(111, 100);
		Account account2 = new Account(222, 200);
		Account account3 = new Account(333, 100);
		
		
		try {
			account1.deposit(200);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			account2.withdraw(300);
		} catch (InvalidAmountException | InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			account3.deposit(-100);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Total number of accounts : "+ totalAccounts);
	}
	
	
}
