package chapter8;
/*
 * Create a tic-tac-toe game using a 3 x 3 matrix.  Two players user
 * X and O to make their moves.
 */
import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {
		
		// Set up empty array.
		int [][] matrix = new int[3][3];
		
		playGame(matrix);

	}
	
	// Define the playGame method.
	public static void playGame(int[][] matrix) {
		
		// Set array to 0.
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix[i][j] = 0;
			}
		}
		
		// Display the matrix at the beginning.
		displayMatrix(matrix);
		
		// While gameOver is not true, ask player1 to move
		// then check for gameOver and ask player2 to move
		while(!gameOver(matrix)) {
			
			matrix = player1(matrix);
			displayMatrix(matrix);
			
			if(gameOver(matrix)) {
				break;
			}
			
			matrix = player2(matrix);
			displayMatrix(matrix);
		}
		
		// Check winner and display the results.
		int winner = findWinner(matrix);
		if(winner == 0) { System.out.println("It's a tie!");
		}
		else if(winner == 1) { System.out.println("X player won");
		}
		else { System.out.println("O player won");
		}
	}
	
	// This will perform the displayMatrix method.
	public static void displayMatrix(int[][] matrix) {
		
		System.out.println("-------------");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("|");
				
				// Check what element is and display it.
				if(matrix[i][j] == 0) {
					System.out.print("   ");
				}
				else if(matrix[i][j] == 1) {
					System.out.print(" X ");
				}
				else {
					System.out.print(" O ");
				}
			}
			System.out.print("|");
			System.out.println();
			System.out.println("-------------");
		}
	}
	
	// Boolean gameOver method.
	public static boolean gameOver(int[][]matrix) {
		
		boolean result = false;
		
		// Check if won or tied.
		if(matrix[0][0] == 1 && matrix[0][1] == 1 && matrix[0][2] == 1 ||
				matrix[1][0] == 1 && matrix[1][1] == 1 && matrix[1][2] == 1 ||
				matrix[2][0] == 1 && matrix[2][1] == 1 && matrix[2][2] == 1 ||
				matrix[0][0] == 1 && matrix[1][0] == 1 && matrix[2][0] == 1 ||
				matrix[0][1] == 1 && matrix[1][1] == 1 && matrix[2][1] == 1 ||
				matrix[0][2] == 1 && matrix[1][2] == 1 && matrix[2][2] == 1 ||
				matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1 ||
				matrix[2][0] == 1 && matrix[1][1] == 1 && matrix[0][2] == 1) {
			result = true;
			return result;
		}
		else if(matrix[0][0] == 2 && matrix[0][1] == 2 && matrix[0][2] == 2 ||
				matrix[1][0] == 2 && matrix[1][1] == 2 && matrix[1][2] == 2 ||
				matrix[2][0] == 2 && matrix[2][1] == 2 && matrix[2][2] == 2 ||
				matrix[0][0] == 2 && matrix[1][0] == 2 && matrix[2][0] == 2 ||
				matrix[0][1] == 2 && matrix[1][1] == 2 && matrix[2][1] == 2 ||
				matrix[0][2] == 2 && matrix[1][2] == 2 && matrix[2][2] == 2 ||
				matrix[0][0] == 2 && matrix[1][1] == 2 && matrix[2][2] == 2 ||
				matrix[2][0] == 2 && matrix[1][1] == 2 && matrix[0][2] == 2) {
			result = true;
			return result;
		}
		else if(matrix[0][0] != 0 && matrix[0][1] != 0 && matrix[0][2] != 0 &&
				matrix[1][0] != 0 && matrix[1][1] != 0 && matrix[1][2] != 0 &&
				matrix[2][0] != 0 && matrix[2][1] != 0 && matrix[2][2] != 0) {
			result = true;
			return result;
		}
		else {
			return result;
		}
	}
	
	// Player1 method that inserts new values.
	public static int[][] player1(int[][] matrix){
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Ask user for input.
		System.out.print("Enter a row (0, 1, 2) for player X: ");
		int row = input.nextInt();
		System.out.print("Enter a column (0, 1, 2) for player X: ");
		int col = input.nextInt();
		
		// insert value.
		matrix[row][col] = 1;
		
		return matrix;
	}
	
	// Player2 matrix returning method.
	public static int[][] player2(int[][] matrix){

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Ask user for input.
		System.out.print("Enter a row (0, 1, 2) for player O: ");
		int row = input.nextInt();
		System.out.print("Enter a column (0, 1, 2) for player O: ");
		int col = input.nextInt();
		
		// insert value.
		matrix[row][col] = 2;
		
		return matrix;
	}
	
	// findWinner method to determine who wins.
	public static int findWinner(int[][] matrix) {
		
		int win = 0;
		
		if(matrix[0][0] == 1 && matrix[0][1] == 1 && matrix[0][2] == 1 ||
				matrix[1][0] == 1 && matrix[1][1] == 1 && matrix[1][2] == 1 ||
				matrix[2][0] == 1 && matrix[2][1] == 1 && matrix[2][2] == 1 ||
				matrix[0][0] == 1 && matrix[1][0] == 1 && matrix[2][0] == 1 ||
				matrix[0][1] == 1 && matrix[1][1] == 1 && matrix[2][1] == 1 ||
				matrix[0][2] == 1 && matrix[1][2] == 1 && matrix[2][2] == 1 ||
				matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1 ||
				matrix[2][0] == 1 && matrix[1][1] == 1 && matrix[0][2] == 1) {
			win = 1;
			return win;
		}
		else if(matrix[0][0] == 2 && matrix[0][1] == 2 && matrix[0][2] == 2 ||
				matrix[1][0] == 2 && matrix[1][1] == 2 && matrix[1][2] == 2 ||
				matrix[2][0] == 2 && matrix[2][1] == 2 && matrix[2][2] == 2 ||
				matrix[0][0] == 2 && matrix[1][0] == 2 && matrix[2][0] == 2 ||
				matrix[0][1] == 2 && matrix[1][1] == 2 && matrix[2][1] == 2 ||
				matrix[0][2] == 2 && matrix[1][2] == 2 && matrix[2][2] == 2 ||
				matrix[0][0] == 2 && matrix[1][1] == 2 && matrix[2][2] == 2 ||
				matrix[2][0] == 2 && matrix[1][1] == 2 && matrix[0][2] == 2) {
			win = 2;
			return win;
		}
		else {
			return win;
		}
	}

}














