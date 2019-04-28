package chapter9;

import java.util.GregorianCalendar;

/*
 * Use the Gregorian Calendar class to create a date object and 
 * set it with specific criterion.
 */
public class GregorianCalendarTest {


	public static void main(String[] args) {
		Long num = 1234567898765L;
		
		GregorianCalendar cal = new GregorianCalendar();
		System.out.print(cal.get(GregorianCalendar.YEAR) +" "+cal.get(GregorianCalendar.MONTH)+" "+cal.get(GregorianCalendar.DAY_OF_MONTH));
		
		cal.setTimeInMillis(num);
		System.out.print("\n"+ cal.get(GregorianCalendar.YEAR) +" "+cal.get(GregorianCalendar.MONTH)+" "+cal.get(GregorianCalendar.DAY_OF_MONTH));
			

	}

}
