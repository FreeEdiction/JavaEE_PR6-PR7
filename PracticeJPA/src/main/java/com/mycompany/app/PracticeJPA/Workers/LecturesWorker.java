package com.mycompany.app.PracticeJPA.Workers;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.app.PracticeJPA.Lecture;
import com.mycompany.app.PracticeJPA.Interfaces.LecturesDao;

public class LecturesWorker {
	@Autowired
	LecturesDao lecturesDao;

	public Lecture addLecture(Lecture lecture) {
		lecture = lecturesDao.addLecture(lecture);
		System.out.println("[id = "+lecture.getId() +", name = " + lecture.getName() + ", credits = " + lecture.getCredits()+" building" + lecture.getBuilding() + " floor  "+lecture.getFlour() + " number "+ lecture.getNumber()+"]");
		return lecture;
	}
}
