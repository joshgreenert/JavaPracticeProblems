package chapter5;

import java.util.Scanner;

public class MaxNumCounter {

	public static void main(String[] args) {
		/*
		 * Write a program that reads integers, finds the biggest one,
		 * and counts them.  '0' will end the input.  Use max and count to solve.
		 */
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Variables and user request.
		System.out.print("Enter numbers: ");
		int max = 0, count = 0;
		int num = input.nextInt();
		
		// Check largest number and count it.
		while(num != 0) {
			if(num == max) { count += 1;}
			if(num > max) {
				max = num;
				count = 1;
			}
			
			num = input.nextInt();
		}
		
		// Display the results.
		System.out.println("the largest number is " + max);
		System.out.println("The occurrence of the largest number is " +count);

	}

}
