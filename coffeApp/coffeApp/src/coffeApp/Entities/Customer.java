package coffeApp.Entities;

import java.util.GregorianCalendar;

public class Customer {
	int Id;
	String FirstName;
	String LastName;
	private GregorianCalendar dateOfBirth;
	String NationalityId;
	
	public Customer(int id, String firstName, String lastName, GregorianCalendar dateOfBirth, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firsName) {
		FirstName = firsName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(GregorianCalendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
}
