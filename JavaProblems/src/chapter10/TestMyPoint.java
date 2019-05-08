package chapter10;

public class TestMyPoint {
/*
 * Test the MyPoint class with the information that was created when
 * I didn't hate life that much.  But here we are.
 */
	public static void main(String[] args) {
		
		MyPoint point1 = new MyPoint(0, 0);
		MyPoint point2 = new MyPoint(10, 30.5);
		double dist = distance(point1, point2);
		
		System.out.printf("The distance between Point 1 and Point 2 is %4.2f", dist);

	}

	public static double distance(MyPoint point1, MyPoint point2) {
		double dist = 0;
		double x1, x2, y1, y2;
		
		// Get all points.
		x1 = point1.getX();
		y1 = point1.getY();
		x2 = point2.getX();
		y2 = point2.getY();
		
		dist = Math.sqrt(Math.pow(x2 - x1,  2) + Math.pow(y2 - y1, 2));
		
		return dist;
	}

}
