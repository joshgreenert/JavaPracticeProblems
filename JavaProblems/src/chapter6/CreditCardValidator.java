package chapter6;

import java.util.Scanner;

/*
 * This program validates a credit card number with math.
 * 1. a credit card must have between 13 - 16 characters.
 * 2. 4 starts a Visa.
 * 3. 5 starts a Master card.
 * 4. 6 starts a Discover card.
 * 5. 37 starts a American Express card.
 */

public class CreditCardValidator {

	public static void main(String [] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Print request.
		System.out.println("Enter a credit card number: ");
		
		// Variable.
		final long card = input.nextLong();
		
		// Method check for card.
		if(isValid(card)) {
			System.out.println(card + " is valid");
		}
		else {
			System.out.println(card + " is invalid");
		}
	}

	// IsValid method that returns true of the card is valid.
	private static boolean isValid(long number) {
		
		if(getSize(number) >= 13 && getSize(number) <= 16) {
			
			// Store the result of both methods from 2,3
			int evenCount = sumOfDoubleEvenPlace(number);
			int oddCount = sumOfOddPlace(number);
			int sum = evenCount + oddCount;
			
			// Check if divisible by 10.
			if(sum % 10 == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	
	// Provide getSize method.
	public static int getSize(long d) {
		
		// Convert string from long to determine size.
		String sizeString = Long.toString(d);
		int size = sizeString.length();
		
		return size;
	}
	
	// Provide the sumOfDoubleEvenPlace method.
	public static int sumOfDoubleEvenPlace(long number) {
		
		// Create variables to use within method.
		int total = 0;
		String numString = Long.toString(number);
		String refString = "";
		
		// Use for loop to determine total.
		for(int i = (numString.length()) - 1; i > 0; i = i - 2) {
			
			// Convert to int, double value, check if greater than 9
			// then split and count, otherwise count.
			refString = numString.substring(i-1, i);
			int num = Integer.parseInt(refString);
			num *= 2;
			
			if(num > 9) {
				
				total += (num % 10);
				num = (num / 10);
				total += (num % 10);
			}
			else {
				total += num;
			}
		}

		return total;
	}
	
	// Provide the sumOfOddPlace method.
	public static int sumOfOddPlace(long number) {
		
		// Provide variables.
		int total = 0;
		String numString = Long.toString(number);
		String refString = "";

		// for loop backwards.
		for(int i = numString.length(); i > 0;i = i -2 ) {
			
			refString = numString.substring(i - 1, i);
			int num = Integer.parseInt(refString);
			
			total += num;
		}
		
		
		return total;
	}
}



















