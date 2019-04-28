package chapter7;
/*
 * Write a program that reads integers between 1 and 100 and counts
 * the occurrences of each. Assume input ends with '0'.
 */
import java.util.Scanner;

public class UserNumCounter {

	public static void main(String[] args) {

		// Determine variables.
		System.out.print("Enter the integers between 1 - 100: ");

		int[] userNums = createArray();

		// Display the results.
		displayCounts(userNums);
	}



	// Create the array with the user input.
	public static int[] createArray() {

		int [] array = new int[100];

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Add an item to the list.
		int num = input.nextInt();
		array[num]++;

		// while statement to add all numbers that are not 0.
		while(num != 0) {
			num = input.nextInt();

			if(num != 0) {
				array[num]++;
			}
		}

		return array;
	}


	// Display the counts of the method.
	public static void displayCounts(int[] counts) {

		for(int i = 0; i < counts.length; i++) {

			if(counts[i] != 0) {
				if(counts[i] > 1) {
					System.out.println(i+ " occurs " +counts[i]+ " times");
				}
				else {
					System.out.println(i+ " occurs " +counts[i]+ " time");
				}
			}
		}
	}
}




