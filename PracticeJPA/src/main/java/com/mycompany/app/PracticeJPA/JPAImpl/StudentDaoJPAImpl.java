package com.mycompany.app.PracticeJPA.JPAImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.app.PracticeJPA.Student;
import com.mycompany.app.PracticeJPA.Interfaces.StudentDao;


@Repository
@Transactional
public class StudentDaoJPAImpl implements StudentDao {

	@PersistenceContext
	private EntityManager em;

	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		em.persist(student);
		return student;
	}

	public Student getStudent(int student_ticket_num) {
		// TODO Auto-generated method stub
		return em.find(Student.class, student_ticket_num);
	}


	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		em.merge(student);
	}
	
	public List<Student> findWithParam (String find){
		Query query =  em.createNamedQuery("findWithParam");
		query.setParameter("fname", find);
		@SuppressWarnings("unchecked")
		List<Student> customers = query.getResultList();
		return customers;
		
	}
	
	


}
