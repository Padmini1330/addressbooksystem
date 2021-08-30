package com.bridgelabz.addressbooksystem;

public class EditDetails 
{

	private String firstName, lastName, address, city, state, email;
	private int zip, phoneNumber;

	public EditDetails(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber,
			String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zip;
	}

	public void setZipCode(int zip) {
		this.zip = zip;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return email;
	}

	public void setEmailId(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return getFirstName() + "\n" + getLastName() + "\n" + getAddress() + "\n" + getPhoneNumber() + "\n"
				+ getEmailId();
	}
}