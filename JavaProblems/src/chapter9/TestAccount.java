package chapter9;
/*
 * Create an class called Account that supports the balance
 * and id variables.  This class will display a test of the
 * Account class to ensure data accuracy.
 */
public class TestAccount {

	public static void main(String[] args) {
		
		Account test = new Account(1122, 20000);
		String date = test.getDate().toString();
		
		// Test the methods in the class.
		test.setAnnualInterestRate(4.5);
		test.withdraw(2500);
		test.deposit(3000);
		
		// Print balance, monthly interest, and date created.
		System.out.printf("Balance: $%2.2f \nMonthly Interest: %1.3f \n"
				+ "Date Created: %s", test.getBalance(), test.getMonthlyInterestRate(), date);

	}

}
