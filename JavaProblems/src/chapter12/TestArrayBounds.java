package chapter12;

import java.util.Random;
import java.util.Scanner;

/*
 * Write a program that creates an array of 100 elements,
 * prompts the user for index of element.  If index is out of bounds,
 * state "Out of Bounds".
 */
public class TestArrayBounds {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int [] array = new int[100];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt();
		}
		
		// Have user request index.
		try {
			System.out.print("Select index to display: ");
			int index = input.nextInt();
			
			System.out.println("The number is "+array[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}

	}

}
