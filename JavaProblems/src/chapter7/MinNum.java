package chapter7;
/*
 * Write a method that finds the smallest element in
 * an array of double values.  Write a program that 
 * prompts the user to enter 10 numbers, invokes the
 * method, and returns the smallest value to display.
 */
import java.util.Scanner;
public class MinNum {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Variables.
		double[] array = new double[10];
		double minNum = 0.0;
		
		// Ask user for numbers.
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < 10; i++) {
			array[i] = input.nextDouble();
		}
		
		// Method call.
		minNum = min(array);
		
		System.out.println("The minimum number is " + minNum);

	}
	
	// Min method to find smallest number.
	public static double min(double[] array) {
		
		// Create a variable to hold.
		double low = 0;
		
		for(int i = 0; i < 10; i++) {
			if(i == 0) {
				low = array[i];
				continue;
			}
			if(array[i] < low) {
				low = array[i];
			}
		}
		
		return low;
	}

}
