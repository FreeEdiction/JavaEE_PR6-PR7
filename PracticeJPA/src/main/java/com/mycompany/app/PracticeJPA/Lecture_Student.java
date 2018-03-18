package com.mycompany.app.PracticeJPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lectures_has_student")
public class Lecture_Student {
	
	@Id
	@GeneratedValue
	private int id;
	private int lectures_ID;
	private int student_student_ticket_num;
	
	public int getLectures_ID() {
		return lectures_ID;
	}
	public void setLectures_ID(int lectures_ID) {
		this.lectures_ID = lectures_ID;
	}
	public int getStudent_student_ticket_num() {
		return student_student_ticket_num;
	}
	public void setStudent_student_ticket_num(int student_student_ticket_num) {
		this.student_student_ticket_num = student_student_ticket_num;
	}

}
