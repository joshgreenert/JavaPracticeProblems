package chapter10;

public class Staff extends Employee{

	@SuppressWarnings("unused")
	private String title;
	
	public Staff() {
		this.title = "representative";
	}
	
	public Staff(String title) {
		this.title = title;
	}
	
	public String toString() {
		return ("Staff: " +this.name);
	}
}
