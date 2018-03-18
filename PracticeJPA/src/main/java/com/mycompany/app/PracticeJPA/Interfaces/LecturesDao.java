package com.mycompany.app.PracticeJPA.Interfaces;

import com.mycompany.app.PracticeJPA.Lecture;

public interface LecturesDao {

	Lecture addLecture(Lecture lecture);

	Lecture getLecture(int id);

	void saveLecture(Lecture lecture);

}
