package chapter4;

import java.util.IllegalFormatConversionException;
import java.util.Scanner;

public class LetterChecker {

	public static void main(String[] args) {
		// Write a program that prompts the user for a letter. 
		// If not a letter display invalid.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter a letter: ");
			
			// Variables.
			String letter = input.nextLine().toUpperCase();
			
			// Check string an display.
			if(letter.length() >= 2 || (!letter.matches("[A-Z]+"))){
				System.out.println(letter + " is an ivalid input");
			}
			else if(letter.equals("A") || letter.equals("B") || letter.equals("C")) {
				System.out.println("The corresponding number is 2");
			}
			else if(letter.equals("D") || letter.equals("E") || letter.equals("F")) {
				System.out.println("The corresponding number is 3");
			}
			else if(letter.equals("G") || letter.equals("H") || letter.equals("I")) {
				System.out.println("The corresponding number is 4");
			}
			else if(letter.equals("J") || letter.equals("K") || letter.equals("L")) {
				System.out.println("The corresponding number is 5");
			}
			else if(letter.equals("M") || letter.equals("N") || letter.equals("O")) {
				System.out.println("The corresponding number is 6");
			}
			else if(letter.equals("P") || letter.equals("Q") || letter.equals("R") || letter.equals("S")) {
				System.out.println("The corresponding number is 7");
			}
			else if(letter.equals("T") || letter.equals("U") || letter.equals("V")) {
				System.out.println("The corresponding number is 8");
			}
			else {
				System.out.println("The corresponding number is 9");
			}
		}
		catch(IllegalFormatConversionException ex) {
			System.out.println(ex + " is an invalid input");
		}

	}

}




























