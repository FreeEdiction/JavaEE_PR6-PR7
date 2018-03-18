package com.mycompany.app.PracticeJPA.Interfaces;

import com.mycompany.app.PracticeJPA.Lecture_Student;

public interface Lectures_StudentDao {
	
	Lecture_Student addLecture_Student(Lecture_Student ls);
	
	void saveStudent(Lecture_Student ls);

}
