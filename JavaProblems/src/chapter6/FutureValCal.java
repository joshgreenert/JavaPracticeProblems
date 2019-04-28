package chapter6;

import java.util.Scanner;

public class FutureValCal {

	public static void main(String[] args) {
		/*
		 * Write a method that computes future investment value at a 
		 * given interest rate for a specified number of years.
		 */
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Declare variables and ask user for input.
		int years = 30;
		System.out.print("Enter investment amount: ");
		double investAmount = input.nextDouble();
		System.out.print("Enter Annual interest rate: ");
		double monthInterestRate = input.nextDouble() / 100;
		
		// Use method function that is static.
		futureInvestmentValue(investAmount, monthInterestRate, years);

	}
	
	public static void futureInvestmentValue(double investmentAmount, double monthInterestRate, int years) {
		
		// Print year and future value before for loop.
		System.out.println("Years    Future Value");
		double futVal;
		
		for(int i = 1; i < 31; i++) {
			futVal = investmentAmount * (Math.pow((1 + monthInterestRate), i));
			
			System.out.printf("%d  %15.2f",i,futVal);
			System.out.println();
		}
	}

}







