package com.mycompany.app.PracticeJPA;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Lectures")
public class Lecture {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	private String name;
	private double credits;
	private int building;
	private int floor;
	private int number;
	
	@ManyToMany
	@OrderBy("student_ticket_num DESC")
	@JoinTable(name = "lectures_has_student", 
	joinColumns = @JoinColumn(name = "lectures_ID" , referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "student_student_ticket_num" , referencedColumnName = "student_ticket_num"))
	private List<Student>studentList = new ArrayList<Student>();

	
	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public int getBuilding() {
		return building;
	}

	public void setBuilding(int building) {
		this.building = building;
	}

	public int getFlour() {
		return floor;
	}

	public void setFlour(int floor) {
		this.floor = floor;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// Getters and settings
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
