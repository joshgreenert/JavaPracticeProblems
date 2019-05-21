package chapter12;
/*
 * Modify the loan class in 10.2 to throw exception if the loan
 * amount, rate, or years are less than or equal to 0.
 */
public class Loan {

	private double annualInterestRate;
	private double loanAmount;
	private int numOfYears;
	private java.util.Date loanDate;
	
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	public Loan(double annualInterestRate, int numOfYears, double loanAmount) {
		try{
			this.annualInterestRate = annualInterestRate;
			this.numOfYears = numOfYears;
			this.loanAmount = loanAmount;
			loanDate = new java.util.Date();
		}
		catch(IllegalArgumentException ex) {
			System.out.print("No item can be set to 0");
		}
	}
	
	// Setters with catch statements.
	public void setRate(double annualInterestRate) throws IllegalArgumentException{
		if(annualInterestRate <= 0) {
			throw new IllegalArgumentException("Rate cannot be less than or equal to 0!");
		}
		else 
			this.annualInterestRate = annualInterestRate;
	}
	public void setNumOfYears(int numOfYears) {
		if(numOfYears <= 0) {
			throw new IllegalArgumentException("Years cannot be less than or equal to 0!");
		}
		else
			this.numOfYears = numOfYears;
	}
	public void setLoanAmount(double loanAmount) {
		if(loanAmount <= 0) {
			throw new IllegalArgumentException("Loan cannot be less than or equal to 0!");
		}
		else
			this.loanAmount = loanAmount;
	}
	
	// Getters.
	public double getRate() {
		return annualInterestRate;
	}
	public int getNumOfYears() {
		return numOfYears;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public double getMonthlyPayment() {
		double monInterestRate = annualInterestRate / 1200;
		double monPayment = loanAmount * monInterestRate / (1 - (1 / Math.pow(1 + monInterestRate, numOfYears * 12)));
		return monPayment;
	}
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numOfYears * 12;
		return totalPayment;
	}
	public java.util.Date getLoanDate(){
		return loanDate;
	}
	
	
}










