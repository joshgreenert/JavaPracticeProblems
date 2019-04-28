package chapter8;
/*
 * Write a method that returns the sum of all the elements
 * in a specified column using methods.  Request a 3 x 4
 * matrix and return the sum of each column.
 */
import java.util.Scanner;
public class MatrixCounter {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Variables.
		double [] [] matrix = new double[3][4];
		
		// Get user input.
		System.out.print("Enter a 3-by-4 matrix row by row: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		
		// Display each matrix.
		System.out.println("Sum of the elements at column 0 is " +sumColumn(matrix, 0));
		System.out.println("Sum of the elements at column 1 is " +sumColumn(matrix, 1));
		System.out.println("Sum of the elements at column 2 is " +sumColumn(matrix, 2));
		System.out.println("Sum of the elements at column 3 is " +sumColumn(matrix, 3));

	}
	
	// sumColumn method that counts columns.
	public static double sumColumn(double[][] matrix, int index) {
		
		double total = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				if(j == index) {
					total += matrix[i][j];
				}
			}
		}
		
		return total;
	}

}











