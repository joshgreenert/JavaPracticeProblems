package chapter5;

import java.util.Scanner;

public class PosNegNumChecker {

	public static void main(String[] args) {
		/*
		 * Write a program that reads an unspecified number of integers,
		 * determines how many are positive or negative, computes the 
		 * total and average (not counting 0's).  The program ends with
		 * '0'.
		 */

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Create variables.
		int total = 0, counter = 0;
		float avg = 0.0f;
		int pos = 0, neg = 0;
		
		// Prompt user.
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int num = input.nextInt();
		
		while(num != 0) {
			
			total += num;
			counter += 1;
			
			// Check if neg or pos.
			if(num > 0) { pos += 1;}
			else { neg += 1;}
			
			num = input.nextInt();
			
		}
		
		// Check if no numbers were entered.
		if(counter == 0) {
			System.out.println("No numbers were entered except 0");
		}
		else {
			System.out.println("The number of positives is " + pos);
			System.out.println("The number of negatives is " + neg);
			double tot = Double.valueOf(total);
			System.out.println("The total is " + tot);
			avg = total / counter;
			System.out.println("The average is " + avg);
		}
	}

}





















