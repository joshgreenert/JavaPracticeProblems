package chapter5;

public class MileKiloTbl {

	public static void main(String[] args) {
		/*
		 * Write a program that prints a table of miles converted
		 * to kilometers and vice versa from 1 - 10 (miles) and
		 * 20 - 65 (kilometers).
		 */
		// Define constants to calculate.
		final double MILE = 1.609;
		final double KILO = 0.6215;
		int kiloStart = 20;
		
		// Print starting statement.
		System.out.print("Miles      Kilometers    |    Kilometers     Miles");
		System.out.println();
		
		// Use a for loop to print data.
		for(int i = 1; i < 11; i++) {
			System.out.println();
			System.out.printf("%d %16.3f       |  %8d %15.3f",i, (i * MILE), 
					kiloStart, (kiloStart * KILO));
			kiloStart += 5;
		}

	}

}
