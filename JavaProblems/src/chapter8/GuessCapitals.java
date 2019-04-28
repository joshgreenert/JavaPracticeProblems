package chapter8;

import java.util.Scanner;

/*
 * Write a program that prompts a user to enter a capital
 * for every state.  The number of correct answers is
 * displayed at the end.
 */
public class GuessCapitals {

	private static String [][] capitals = new String [][] {
		{"Arkansas", "Little Rock"}, {"Arizona", "Pheonix"}, {"Colorado", "Denver"},
		{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"California", "Sacramento"},
		{"Connecticut", "Hartford"}, {"Delaware", "Dover"}, {"Flordia", "Tallahassee"},
		{"Georgia","Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
		{"Illinois", "Springfield"}, {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"},
		{"Kansas", "Topeka"}, {"Kentucky", "Frankfurt"}, {"Louisana", "Baton Rouge"},
		{"Maine", "Augusta"}, {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
		{"Michigan", "Lansing"}, {"Minnesota","St. Paul"}, {"Mississippi","Jackson"},
		{"Missouri", "Jefferson City"}, {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
		{"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, {"New Jersey", "Trenton"},
		{"New Mexico", "Santa Fe"}, {"New York", "Albany"}, {"North Carolina", "Raleigh"},
		{"North Dakota", "Bismarck"}, {"Ohio", "Columbus"}, {"Oklahoma", "Oklahoma City"},
		{"Oregon", "Salem"}, {"Pennsylvannia", "Harrisburg"}, {"Rhode Island", "Providence"},
		{"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, {"Tennessee", "Nashville"},
		{"Texas", "Austin"}, {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
		{"Virginia", "Richmond"}, {"Washington", "Olympia"}, {"West Virginia", "Charleston"},
		{"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"}
	};
	
	private static int correctSum = 0;
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Ask user for input and record it.
		for(int i = 0; i < 50; i++) {
			System.out.print("What is the capital of "+capitals[i][0]+ "?");
			String guess = input.nextLine();
			
			if(guess.contentEquals(capitals[i][1])) {
				System.out.println("Your answer is correct");
				correctSum++;
			}
			else {
				System.out.println("The correct answer should be " +capitals[i][1]);
			}
		}
		
		System.out.println("The correct count is " +correctSum);

	}

}
