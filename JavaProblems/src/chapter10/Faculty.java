package chapter10;

public class Faculty extends Employee{

	@SuppressWarnings("unused")
	private String officeHours;
	@SuppressWarnings("unused")
	private int rank;
	
	public Faculty() {
		this.officeHours = "9:00am - 12:00pm";
		this.rank = 2;
	}
	
	public Faculty(String officeHours, int rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String toString() {
		return ("Faculty: " + this.name);
	}
}
