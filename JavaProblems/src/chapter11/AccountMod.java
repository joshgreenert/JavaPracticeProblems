package chapter11;

import java.util.ArrayList;
import java.util.Date;

/*
 * Redesign the account class to include transactions.
 */
public class AccountMod extends Transaction {

	private int id;
	private double balance, annualInterestRate;
	private Date dateCreated = new Date();
	private String name;
	ArrayList<Transaction> transaction = new ArrayList<Transaction>();
	
	public AccountMod() {
		this.id = 1;
		this.balance = 0;
		this.annualInterestRate = 1;
		this.dateCreated = new Date();
		this.name = "name";
	}
	
	public AccountMod(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public AccountMod(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	// Setters for id, balance, rate and name.
	public void setID(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setRate(double rate) {
		this.annualInterestRate = rate;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Getters for id, balance, rate, date, monthly rate, monthly interest.
	public int getID() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getRate() {
		return annualInterestRate;
	}
	public Date getDate() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}
	public double getMonthlyInterest() {
		double air = getMonthlyInterestRate();
		return balance * air;
	}
	
	// New withdraw and deposit methods.
	public void withdraw(double amount) {
		this.balance -= amount;
		
		Transaction tranny= new Transaction(dateCreated, 'W', amount, balance, "withdrawl made");
		transaction.add(tranny);
	}
	public void deposit(double amount) {
		this.balance += amount;
		
		Transaction tranny = new Transaction(dateCreated, 'D', amount, balance, "deposit made");
		transaction.add(tranny);
	}
	
	public String toString() {
		return "ID: " +this.id+ "\nName: " +this.name+ "\nBalance: " +this.balance+ "\nInterest Rate: " 
				+this.annualInterestRate;
	}
}
