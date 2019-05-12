package chapter10;

public class Student extends Person{

	@SuppressWarnings("unused")
	private String classStatus;
	
	public Student() {
		this.classStatus = "Freshman";
	}
	
	public Student(String classStatus) {
		this.classStatus = classStatus;
	}
	
	public String toString() {
		return ("Student: " + this.name);
	}
}
