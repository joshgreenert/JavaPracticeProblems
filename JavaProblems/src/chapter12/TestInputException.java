package chapter12;
/*
 * Write a program that prompts the user to read two integers
 * and displays their sum.  The program should prompt the user again 
 * if not correct.
 */
public class TestInputException {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		
		while(true) {
			try {
				System.out.println("Please enter two integers: ");
				num1 = input.nextInt();
				num2 = input.nextInt();
				
				break;
			}
			catch(java.util.InputMismatchException ex) {
				System.out.println("You must enter integers!");
				break;
			}
		}
		
		System.out.println("The sum of these numbers is " +(num1 + num2));

	}

}
