package com.mycompany.app.PracticeJPA;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@NamedQueries({ 
@NamedQuery(name = "findWithParam", query="select c from Student c where c.lastName = :fname")
})

public class Student {
	@Id
	private int student_ticket_num;
	private String firstName;
	private String lastName;
	private String speciality;
	private int course;
	private String email;
	private String phoneNumber;
	@Embedded
	private Address address;

	@ManyToMany(mappedBy = "studentList",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Lecture> lecturesList = new ArrayList<Lecture>();

	
	

	public List<Lecture> getLecturesList() {
		return lecturesList;
	}

	public void setLecturesList(List<Lecture> lecturesList) {
		this.lecturesList = lecturesList;
	}

	public int getStudent_ticket_num() {
		return student_ticket_num;
	}

	public void setStudent_ticket_num(int student_ticket_num) {
		this.student_ticket_num = student_ticket_num;
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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + course;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((lecturesList == null) ? 0 : lecturesList.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((speciality == null) ? 0 : speciality.hashCode());
		result = prime * result + student_ticket_num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (course != other.course)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (lecturesList == null) {
			if (other.lecturesList != null)
				return false;
		} else if (!lecturesList.equals(other.lecturesList))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (speciality == null) {
			if (other.speciality != null)
				return false;
		} else if (!speciality.equals(other.speciality))
			return false;
		if (student_ticket_num != other.student_ticket_num)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return ("Ticket number: " + this.getStudent_ticket_num() + ", firstname: "
				+ this.getFirstName() + ",  lastname: " + this.getLastName() + ", speciality: "
				+ this.getSpeciality() + ", course: " + this.getCourse() + ", email: " + this.getEmail()
				+ " , phone_num: " + this.getPhoneNumber() + ", address: " + this.getAddress());
	}

	

}
