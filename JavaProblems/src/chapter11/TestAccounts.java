package chapter11;

public class TestAccounts {

	public static void main(String[] args) {
		
		// Instantiate accounts.
		CheckingAccount cAccount = new CheckingAccount(1, 100);
		SavingsAccount sAccount = new SavingsAccount(2, 100);
		Account account = new Account(3, 100);
		
		// Test checking and savings first.
		cAccount.withdraw(200);
		cAccount.withdraw(200);
		cAccount.withdraw(200);
		
		sAccount.withdraw(200);
		
		// To String for each account.
		System.out.println(cAccount.toString());
		System.out.println(sAccount.toString());
		System.out.println(account.toString());

	}

}
