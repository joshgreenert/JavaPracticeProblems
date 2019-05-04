package chapter9;
/*
 * This class will test the location by creating a double array,
 * finding the maximum value, and prints the message of it.
 */
import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		
		int row = 0, col = 0;
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns in the array: ");
		row = input.nextInt();
		col = input.nextInt();
		
		double[][] array = new double[row][col];
		
		// Ask the user to enter the array.
		System.out.println("Enter the array: ");
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		// Create a location object.
		Location test = locateLargest(array);
		System.out.println(test.toString());

	}
	
	// Create the method for the locate largest.
	public static Location locateLargest(double[][] array) {
		int row = 0, col = 0;
		double max = array[0][0];
		
		for(int i = 0; i < array.length; i++) {
			for(int k = 0; k < array[i].length; k++) {
				
				if(array[i][k] > max) {
					max = array[i][k];
					row = i;
					col = k;
				}
			}
		}
		
		return new Location(row, col, max);
	}

}
