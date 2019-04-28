package chapter7;
/*
 * Write a bubble sort that swaps pairs that are not in order.
 * Ask the user for 10 double numbers, invoke the method, and 
 * display sorted.
 */
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Variables.
		double [] list = new double[10];
		
		// Ask user for input.
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < 10; i++) {
			list[i] = input.nextDouble();
		}
		
		bubbleSort(list);
		
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

	}
	
	// Bubble Sort method to provide order.
	public static void bubbleSort(double[] list) {
		
		boolean needPass = true;
		
		// for loop.
		for(int i = 0; i < list.length - 1 && needPass; i++) {
			
			needPass = false;
			
			for(int k = 0; k < list.length - i -1; k++) {
				if(list[k] > list[k + 1]) {
					double temp = list[k];
					list[k] = list[k + 1];
					list[k + 1] = temp;
					
					needPass = true;
				}
			}
		}
	}

}













