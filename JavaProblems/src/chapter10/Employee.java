package chapter10;

public class Employee extends Person{

	private String office;
	private double salary;
	private MyDate hireDate;
	
	public Employee() {
		this.office = "Office";
		this.salary = 10000;
		this.hireDate = new MyDate();
	}
	
	public Employee(String office, double salary, MyDate hireDate) {
		this.office = office;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public String toString() {
		return ("Employee: " + this.name);
	}
}
