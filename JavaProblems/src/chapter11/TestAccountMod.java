package chapter11;
/*
 * This class will test the AccountMOd and Transaction classes
 * to ensure that they are properly set up without errors.
 */
public class TestAccountMod {

	public static void main(String[] args) {
		
		AccountMod account = new AccountMod("George", 1122, 1000);
		account.setRate(1.5);
		
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		
		// Display account and information.
		System.out.println(account.toString());
		
		for(int i = 0; i < account.transaction.size(); i++) {
			System.out.println(account.transaction.get(i).toString());
		}

	}

}
