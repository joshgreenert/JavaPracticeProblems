package chapter6;
/*
 * Write a program for the game craps.  Roll two dice and check
 * the sum; if the sum is 2, 3, or 12, display 'Craps you lose'. 
 * If the sum is 7 or 11, display 'you win'.  If any other value
 * is rolled, a point is established.  Continue to roll until you
 * get 7 or the same point value; if 7, you lose.
 */

import java.util.Random;

public class Craps {

	public static void main(String[] args) {
		
		// Call the method.
		playCraps();

	}



// Craps method.
public static void playCraps() {
	
	// Initiate a random value.
	Random rand = new Random();
	int num1 = rand.nextInt(6) + 1;
	int num2 = rand.nextInt(6) + 1;
	int sum = num1 + num2;
	int temp = 0;
	
	// Check if lost, won, or roll again.
	if(sum == 2 || sum == 3 || sum == 12) {
		System.out.println("You rolled " +num1+ " + " +num2+ " = " +sum);
		System.out.println("You lose");
	}
	else if(sum == 7 || sum == 11) {
		System.out.println("You rolled " +num1+ " + " +num2+ " = " +sum);
		System.out.println("You win");
	}
	else {
		// Place the sum in a variable.
		temp = sum;
		
		// Print point statement.
		System.out.println("You rolled " +num1+ " + " +num2+ " = " +sum);
		System.out.println("Point is " +temp);
		
		// Roll again to determine results.
		num1 = rand.nextInt(6) + 1;
		num2 = rand.nextInt(6) + 1;
		sum = num1 + num2;
		
		// While statement to reroll until results are found.
		while(sum != 7) {
			num1 = rand.nextInt(6) + 1;
			num2 = rand.nextInt(6) + 1;
			sum = num1 + num2;
			
			if(sum == temp) {
				System.out.println("You rolled " +num1+ " + " +num2+ " = " +sum);
				System.out.println("You won");
				break;
			}
		}
		
		// Check if you're finally a winner or a loser. **P.s you're a loser.
		if(sum == 7) {
			System.out.println("You rolled " +num1+ " + " +num2+ " = " +sum);
			System.out.println("You lose");
		}
		
	}
}
}














