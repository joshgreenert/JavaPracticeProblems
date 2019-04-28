package chapter4;

import java.util.Scanner;

public class CitySort {

	public static void main(String[] args) {
		/* 
		 * Write a program that prompts the user to enter
		 * three cities and displays them in ascending order.
		 */
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt user.
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.print("Enter the thrid city: ");
		String city3 = input.nextLine();
		
		// Check cities by finding first, last and middle.
		String first, middle, third;
		
		// Get first city.
		if(city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0) {
			first = city1;
		}
		else if(city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0) {
			first = city2;
		}
		else { first = city3;}
		
		// Get third city.
		if(city1.compareTo(city2) > 0 && city1.compareTo(city3) > 0) {
			third = city1;
		}
		else if(city2.compareTo(city1) > 0 && city2.compareTo(city3) > 0) {
			third = city2;
		}
		else { third = city3; }
		
		// Get middle man.
		if((city1.compareTo(city2) < 0 && city1.compareTo(city3) > 0) ||
				(city1.compareTo(city2) > 0 && city1.compareTo(city3) < 0)) {
			middle = city1;
		}
		else if((city2.compareTo(city1) < 0 && city2.compareTo(city3) > 0) ||
				(city2.compareTo(city1) > 0 && city2.compareTo(city3) < 0)) {
			middle = city2;
		}
		else { middle = city3; }
		
		// Display the statement.
		System.out.println("The three cities in alphabetical order are " + first + " " + middle + " " + third);

	}


}











