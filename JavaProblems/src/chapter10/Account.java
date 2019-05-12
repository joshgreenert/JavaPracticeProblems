package chapter10;

import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account() {
		this.id = 0;
		this.balance = 0;
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void setID(int iD) {
		id = iD;
	}
	
	public int getID() {
		return id;
	}
	
	public void setBalance(double Balance) {
		balance = Balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setAnnualInterestRate(double air) {
		annualInterestRate = air;
	}
	
	public double getAnnualInterestRate() {
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
	
	public void withdraw(double Balance) {
		balance -= Balance;
	}
	
	public void deposit(double Balance) {
		balance += Balance;
	}
}




















