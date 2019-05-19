package chapter11;

import java.util.Collections;

/*
 * Write a test program that prompts the user for 5 numbers,
 * stores them in an arrayList, and displays them in 
 * increasing order.
 */
public class SortArrayList {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
		System.out.print("Enter 5 integers: ");
		
		// Get numbers from the user.
		for(int i = 0; i < 5; i++) {
			int userNum = input.nextInt();
			list.add(userNum);
		}
		
		// Sort the list and display the results.
		sort(list);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(list.get(i) + " ");
		}
	}
	
	public static void sort(java.util.ArrayList<Integer> list) {
		java.util.Collections.sort(list);
	}

}
