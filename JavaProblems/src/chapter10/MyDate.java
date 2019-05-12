package chapter10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {

	private int year, month, day;
	
	public MyDate() {
		GregorianCalendar cal = new GregorianCalendar();
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		day = cal.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(long elapsedTime) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(elapsedTime);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		day = cal.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	// Getters 
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	// Other methods internally crafted.
	public void setDate(long elapsedTime) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(elapsedTime);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		day = cal.get(Calendar.DAY_OF_MONTH);
	}
	
}




