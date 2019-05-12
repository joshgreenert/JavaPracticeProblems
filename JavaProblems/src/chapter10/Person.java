package chapter10;

public class Person {

	protected String name;
	protected String address;
	protected String phone;
	protected String email;
	
	public Person() {
		this.name = "name";
		this.address = "address";
		this.phone = "phone";
		this.email = "email";
	}
	
	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	public String toString() {
		return ("Person: " + name);
	}
}
