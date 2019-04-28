package chapter7;
/*
 * A school has 100 lockers and 100 students.  All lockers
 * are locked, but then each student changes the lockers from
 * either locked to unlocked or vice versa.  After all 100 
 * students have passed, which lockers are open?
 * 
 */
public class Locker100Problem {

	public static void main(String[] args) {
		
		// Create an array with 100 boolean values.
		boolean [] lockers = new boolean[102];
		
		// If is open==true; set all lockers to closed.
		for(int i = 1; i < lockers.length; i++) {
			lockers[i] = false;
		}
		
		// Pass through students method.
		students(lockers);

	}
	
	// Students method that displays results.
	public static void students(boolean[] array) {
		// for loop in a for loop.
		for(int i = 1; i < array.length; i++) {
			// Internal
			for(int k = i; k < array.length; k = k + i) {
				if(array[k]) {
					array[k] = false;
				}
				else {
					array[k] = true;
				}
			}
		}
		
		// Display the results.
		for(int i = 1; i < 101; i++) {
			if(array[i]) {
				System.out.print(i + " ");
			}
		}
	}

}











