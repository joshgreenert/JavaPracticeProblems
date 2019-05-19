package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Write a program that prompts the user to enter an integer
 * and finds the smallest integer such that m * n is a perfect
 * square.
 */
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Ask for user integer.
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		int n = 1;
		ArrayList<Integer> list = new ArrayList<>();
		
		// Methods to get the smallest ints.
		findFactors(list, m);
		multiplyRemainders(list, n);
		
		// Find result and print it.
		m *= n;
		System.out.println("The smallest number n for m * n to be a perfect square is " +n);
		System.out.println("m * n is " +m);

	}
	
	// Find all possible factors of m.
	public static void findFactors(ArrayList<Integer> list, int m) {
		
		// Todo: Once I understand what the hell needs to be done here I will be back.
		
		for(int i = 2; i <= m; i++) {
			if(m % i == 0) {
				list.add(i);
				System.out.print(i + " ");
				m /= i;
			}
		}
		
		
	}
	
	public static void multiplyRemainders(ArrayList<Integer> list, int n) {
		for(int i = 0; i < list.size(); i++) {
			n *= list.get(i);
		}
	}

}
