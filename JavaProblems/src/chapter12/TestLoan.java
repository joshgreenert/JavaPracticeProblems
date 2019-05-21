package chapter12;

public class TestLoan {

	public static void main(String[] args) {
		
		Loan loan = new Loan();
		
		loan.setNumOfYears(3);
		loan.setRate(5.5);
		loan.setLoanAmount(3000);
		
		System.out.println(loan.getTotalPayment());

	}

}
