package in.com.cg.controller;

import java.time.LocalDate;

public class Resume {
	
	private String firstName;
	private String lastName;
	private String Gender;
	private String highestQualification;
	private LocalDate dob;
	private String hobbies;
	private String email;
	private String website;
	private String Contact;
	
	public Resume(String firstName, String lastName, String gender, String highestQualification, LocalDate dob,
			String hobbies, String email, String website, String contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Gender = gender;
		this.highestQualification = highestQualification;
		this.dob = dob;
		this.hobbies = hobbies;
		this.email = email;
		this.website = website;
		Contact = contact;
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

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}
	
	
	
	

}
