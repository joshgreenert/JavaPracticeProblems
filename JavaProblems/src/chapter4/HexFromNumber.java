package chapter4;

import java.util.Scanner;

public class HexFromNumber {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts a user for
		 * a number 0 - 15 and display the hex.
		 * For incorrect input, state '[num] is an invalid input.'
		 */
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer value (0 - 15): ");
		
		// Variables.
		int num = input.nextInt();
		String hex = Integer.toHexString(num);
		
		// Check num and display.
		if(num >= 0 && num <= 15) {
			System.out.println("The hex number is " + hex);
		}
		else {
			System.out.println(num + " is an invalid input");
		}
	}

}
