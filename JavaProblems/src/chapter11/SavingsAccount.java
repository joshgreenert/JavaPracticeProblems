package chapter11;

public class SavingsAccount extends Account{

	public SavingsAccount() {
		this.id = 0;
		this.balance = 0;
	}
	
	public SavingsAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if(this.balance - amount < 0) {
			System.out.println("Insufficient funds");
		}
		else {
			this.balance -= amount;
		}
	}
	
	public String toString() {
		return "Savings Account: " +this.id;
	}
}
