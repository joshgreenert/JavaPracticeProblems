package chapter10;
/*
 * This class will host the Circle2D class that will create a 
 * two dimensional circle.  
 */
public class Circle2D {

	private double x, y;
	private double radius;
	
	public Circle2D() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// Getters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return (3.141592 * (Math.pow(radius, 2)));
	}
	public double getPerimeter() {
		return (3.141592 * (2 * radius));
	}
	
	public boolean contains(double x, double y) {
		if(Math.pow(x,  2) + Math.pow(y, 2) <= Math.pow(this.radius, 2)) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Circle2D circle) {
		double x1, y1, r;
		
		x1 = circle.getX();
		y1 = circle.getY();
		r = circle.getRadius();
		
		if(Math.pow(x1, 2) + Math.pow(y1, 2) <= Math.pow(r, 2)) {
			return true;
		}
		return false;
	}
	
	public boolean overlaps(Circle2D circle) {
		double x2, y2, r2;
		
		x2 = circle.getX();
		y2 = circle.getY();
		r2 = circle.getRadius();
		
		double dist = Math.pow((this.x - x2) * (this.x - x2) + (this.y - y2) * (this.y - y2), 0.5);
		
		if(dist < (this.radius + r2)) {
			return true;
		}
		return false;
	}
}
