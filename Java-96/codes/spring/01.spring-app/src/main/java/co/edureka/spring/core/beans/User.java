package co.edureka.spring.core.beans;

public class User {
	private String firstName;
	private String lastName;

	public User() {
		System.out.println("inside no args constructor");
	}

	public User(String firstName, String lastName) {
		System.out.println("inside 2 args constructor");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		System.out.println("inside getFirstName() method");
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("inside setFirstName() method");
	}

	public String getLastName() {
		System.out.println("inside getLastName() method");
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("inside setLastName() method");
	}

	@Override
	public String toString() {
		return "User [First Name= " + firstName + " | Last Name= " + lastName + "]";
	}
}
