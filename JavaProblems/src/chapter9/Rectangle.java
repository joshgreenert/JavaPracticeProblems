package chapter9;

/*
 * This will support the Rectangle class and will create the 
 * constructors for the object.  A test class will be made in another
 * file.
 */
public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle() {
		setWidth(1);
		setHeight(1);
	}
	
	public Rectangle(double width, double height) {
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public double getArea() {
		return getWidth() * getHeight();
	}
	
	public double getPerimeter() {
		return (getWidth() *2) + (getHeight() * 2);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}











