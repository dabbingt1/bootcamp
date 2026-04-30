package com.javahongkong.bootcamp.exercise;

public class Person extends AccountHolder{
	private String firstName;
	private String lastName;
	// private int idNumber;
	private int idNumber;

	public Person(String firstName, String lastName, int idNumber) {
		super(idNumber);
		// complete the function
		if (firstName == null || lastName == null)
			throw new IllegalArgumentException("Name missing");
		this.firstName = firstName;
		this.lastName= lastName;
		this.idNumber = idNumber;
	}

	public String getFirstName() {
		// complete the function
		return this.firstName;
	}

	public String getLastName() {
		// complete the function
		return this.lastName;
	}

	public int idNumber() {
		return this.idNumber;
	}
}
