package com.mycompany.app.PracticeJPA.Workers;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.app.PracticeJPA.Lecture_Student;
import com.mycompany.app.PracticeJPA.Interfaces.Lectures_StudentDao;

public class LectureStudentWorker {
	
	@Autowired
	Lectures_StudentDao lsDao;
	
public Lecture_Student addLecture_Student(Lecture_Student ls) {
		
		ls = lsDao.addLecture_Student(ls);
		return ls;
	}

}
