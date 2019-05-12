package chapter10;
/*
 * This class will test the account class and ensure that all
 * the functions in the form of an ATM.
 */
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		
		Account[] accounts = new Account[10];
		
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
		
		// Create menu after variables.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int id = 0, choice = 0;
		boolean flag = true;
		double withdraw, deposit;
		
		while(flag) {
			
			System.out.print("Enter an id: ");
			id = input.nextInt();
			
			while(choice != 4 && id == 0 || id == 1 || id == 2 || id == 3 || id == 4 || id == 5 || id == 6
					|| id == 7 || id == 8 || id == 9) {
				
				menu();
				System.out.println("Enter a choice: ");
				
				choice = input.nextInt();
				
				if(choice == 1) {
					System.out.println("The balance is $" + accounts[id].getBalance());
				}
				else if(choice == 2) {
					System.out.println("Enter an amount to withdraw: ");
					withdraw = input.nextDouble();
					accounts[id].withdraw(withdraw);
				}
				else if(choice == 3) {
					System.out.println("Enter an amount to deposit: ");
					deposit = input.nextDouble();
					accounts[id].deposit(deposit);
				}
				else if(choice == 4) {
					break;
				}
				else {
					continue;
				}
			}
		}

	}
	
	public static void menu() {
		System.out.print("\nMain Menu\n1: Check Balance\n2: Withdraw\n3: Deposit\n4: Exit\n");
	}

}








