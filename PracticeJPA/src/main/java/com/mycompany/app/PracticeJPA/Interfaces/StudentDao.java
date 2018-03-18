package com.mycompany.app.PracticeJPA.Interfaces;

import java.util.List;

import com.mycompany.app.PracticeJPA.Student;

public interface StudentDao {

	Student addStudent(Student student);

	Student getStudent(int student_ticket_num);

	void saveStudent(Student student);
	
	List<Student> findWithParam (String find);

}
