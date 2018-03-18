package com.mycompany.app.PracticeJPA.JPAImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.app.PracticeJPA.Lecture_Student;
import com.mycompany.app.PracticeJPA.Interfaces.Lectures_StudentDao;

@Repository
@Transactional
public class Lecture_StudentJPAImpl implements Lectures_StudentDao {
	
	@PersistenceContext
	private EntityManager em;

	public Lecture_Student addLecture_Student(Lecture_Student ls) {
		em.persist(ls);
		return ls;
		}

	public void saveStudent(Lecture_Student ls) {
		em.merge(ls);
	}

}
