package chapter10;
/*
 * This class tests all Person-related classes to ensure that the 
 * toString method is set up correctly and that each class can be
 * instantiated.
 */
public class TestPeople {

	public static void main(String[] args) {
		
		// Create instances of all action able persons.
		Person person = new Person();
		Student student = new Student();
		Employee employee = new Employee();
		Faculty faculty = new Faculty();
		Staff staff = new Staff();
		
		// Ensure that the to string methods works in each respective class.
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

	}

}
