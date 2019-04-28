package chapter9;

public class TestRectangle {

	public static void main(String[] args) {
		
		
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		
		// print info for both rectangles.
		System.out.print("Rectangle 1 has a width of " +rec1.getWidth()+ ", a height of " +
		          rec1.getHeight()+ ", an area of " +rec1.getArea() + " and a perimeter of " + rec1.getPerimeter());
		
		System.out.print("\nRectangle 2 has a width of " +rec2.getWidth()+ ", a height of " +
		          rec2.getHeight()+ ", an area of " +rec2.getArea() + " and a perimeter of " + rec2.getPerimeter());
	}

}
