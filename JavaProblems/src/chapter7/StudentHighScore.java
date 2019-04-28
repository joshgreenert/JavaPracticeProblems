package chapter7;
/*
 * Write a program that reads student scores, gets the best score,
 * and then assigns grades based on data ranks.
 * 
 * Ask user for input and then have user enter grades.
 */
import java.util.Scanner;
public class StudentHighScore {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Ask for user input.
		System.out.print("Enter the amount of students: ");
		int AMT = input.nextInt();
		int best = 0;
		
		// Create array and prompt user.
		int [] students = new int[AMT];
		System.out.print("Enter " +AMT+ " scores: ");
		
		for(int i = 0; i < AMT; i++) {
			students[i] = input.nextInt();
			
			if(students[i] > best) {
				best = students[i];
			}
		}
		
		for(int i = 0; i < AMT; i++) {
			
			// Use if statements to determine print line.
			if((best - students[i]) <= 10) {
				System.out.println("Student " +i+ " score is " + students[i]+ " and grade is A");
			}
			else if((best - students[i]) <= 20) {
				System.out.println("Student " +i+ " score is " + students[i]+ " and grade is B");
			}
			else if((best - students[i]) <= 30) {
				System.out.println("Student " +i+ " score is " + students[i]+ " and grade is C");
			}
			else if((best - students[i]) <= 40) {
				System.out.println("Student " +i+ " score is " + students[i]+ " and grade is D");
			}
			else {
				System.out.println("Student " +i+ " score is " + students[i]+ " and grade is F");
			}
		}
		

	}

}










