package chapter6;
/*
 * Write a program that prompts the user to enter a valid password.  
 * If valid, display valid; else, display invalid.
 */

import java.util.Scanner;

public class PasswdCheck {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Enter string to check.
		System.out.print("Please enter a password: ");
		String pwd = input.nextLine();

		// Method check.
		checkPassword(pwd);

	}

	private static void checkPassword(String pwd) {
		// Variables.
		int counter = 0;
		String valid = "Valid Password";
		String invalid = "Invalid Password";
		char check;

		if(pwd.length() >= 8) {

			for(int i = 0; i < pwd.length(); i++) {

				// Check all other digits.
				check = pwd.charAt(i);

				// Check if the character is a digit or letter; count the digits.
				if(Character.isLetterOrDigit(check)) {
					if(Character.isDigit(check)) {
						counter += 1;
					}
				}
				else { 
					System.out.println(invalid);
				}
				
				// Check for last digit and provide result.
				if(i == pwd.length() - 1) {
					if(counter >= 2) {
						System.out.println(valid);
						break;
					}
					else { 
						System.out.println(invalid);
						break;
					}
				}


			}
		}
		else {
			System.out.println(invalid);
		}

	}

}
















