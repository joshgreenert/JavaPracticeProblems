package chapter11;

import java.util.Date;

public class Transaction {

	private Date dateCreated = new Date();
	private char type;
	private double balance, amount;
	private String description;
	
	public Transaction() {}
	
	public Transaction(Date dateCreated, char type, double amount, double balance, String description) {
		this.dateCreated = dateCreated;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	// Setters for date and char type.
	public void setDate(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public void setType(char type) {
		this.type = type;
	}
	
	// Getters for date and type.
	public Date getDate() {
		return dateCreated;
	}
	public char getType() {
		return type;
	}
	
	// To String method for looping purposes.
	public String toString() {
		return this.dateCreated +": " +this.type+ " " +this.amount+ " Balance: " +this.balance+ " Description: " +this.description;
	}
}
