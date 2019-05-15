package chapter11;

public class CheckingAccount extends Account{

	private int overdraft = 0;
	
	public CheckingAccount() {
		this.id  = 0;
	    this.balance = 0;
	}
	
	public CheckingAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if((this.balance - amount < 0) && overdraft >= 2) {
			System.out.println("Insufficient funds");
		}
		else if(this.balance - amount < 0 && overdraft < 2) {
			this.balance -= amount;
			this.overdraft++;
		}
		else {
			this.balance -= amount;
		}
	}
	
	public String toString() {
		return "Checking Account: " + this.id;
	}
}
