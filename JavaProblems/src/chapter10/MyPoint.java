package chapter10;
/*
 * Design a class named MyPoint to represent a point with
 * x and y coordinates.  
 */
public class MyPoint {

	private double x, y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// Getters for x and y.
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(MyPoint point) {
		double dist = 0, x1 = 0, y1 = 0;
		double x2, y2;
		
		x2 = point.getX();
		y2 = point.getY();
		
		// Use formula to find distance and return.
		dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,  2));
		
		return dist;
	}
	
	
}
