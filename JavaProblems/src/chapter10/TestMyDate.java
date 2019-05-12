package chapter10;
/*
 * This class is created to test the MyDate class and ensures
 * that the output runs as expected.
 */

public class TestMyDate {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(34355555133101L);
		
		// Print the dates.
		System.out.println(date1.getMonth() + "/" + date1.getDay() +"/"+ date1.getYear());
		System.out.println(date2.getMonth() +"/"+ date2.getDay() +"/"+ date2.getYear());

	}

}
