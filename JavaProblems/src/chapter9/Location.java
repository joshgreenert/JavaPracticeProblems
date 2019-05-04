package chapter9;
/*
 * Location class that determines the location of the largest
 * element in a double array.
 */

public class Location {

	public int row, col;
	public double maxValue;
	
	public Location(int row, int col, double maxValue) {
		this.row = row;
		this.col = col;
		this.maxValue = maxValue;
		
	}
	
	public String toString() {
		return ("The location of the largest element is " +maxValue+ " at"
				+ " (" +row+ ", " +col+ ")");
	}
}
