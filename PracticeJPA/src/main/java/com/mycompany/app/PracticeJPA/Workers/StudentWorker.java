package com.mycompany.app.PracticeJPA.Workers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.googlecode.ehcache.annotations.Cacheable;
import com.mycompany.app.PracticeJPA.Student;
import com.mycompany.app.PracticeJPA.Interfaces.StudentDao;

//import org.springframework.jdbc.core.RowMapper;

public class StudentWorker {
	// protected JdbcTemplate jdbcTemplate;
	protected String SQL_SELECT_STUDENT_BY_ID = "select * from student where id = 250000458";
	@Autowired
	StudentDao studentDao;

	public Student addStudent(Student student) {

		student = studentDao.addStudent(student);
		System.out.println("Ticket number: " + student.getStudent_ticket_num() + ", firstname: "
				+ student.getFirstName() + ",  lastname: " + student.getLastName() + ", speciality: "
				+ student.getSpeciality() + ", course: " + student.getCourse() + ", email: " + student.getEmail()
				+ " , phone_num: " + student.getPhoneNumber() + ", address: " + student.getAddress());
		return student;
	}
	
	public Student getStudent(int st) {

		Student student = studentDao.getStudent(st);
//		System.out.println("Ticket number: " + student.getStudent_ticket_num() + ", firstname: "
//				+ student.getFirstName() + ",  lastname: " + student.getLastName() + ", speciality: "
//				+ student.getSpeciality() + ", course: " + student.getCourse() + ", email: " + student.getEmail()
//				+ " , phone_num: " + student.getPhoneNumber() + ", address: " + student.getAddress());
		return student;
	}
	
	JdbcTemplate jdbcTemplate ;
	
	@Cacheable(cacheName = "studentsCache")
	public Student getStudentById(int id) {
		//System.out.println("FAILLLLLLLLLL");
		return getStudent(id);
	}
	
	public List<Student> findWithParam(String find){
		
		return studentDao.findWithParam(find);
		
	}

	// @Cacheable(cacheName = "studentsCache")
	// public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	// Student student = new Student();
	// student.setStudent_ticket_num(rs.getInt(1));
	// student.setFirstName(rs.getString(2));
	// student.setLastName(rs.getString(3));
	// return student;
	//
	// }

}
