package com.mycompany.app.PracticeJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.app.PracticeJPA.Workers.ClassRoomWorker;
import com.mycompany.app.PracticeJPA.Workers.LectureStudentWorker;
import com.mycompany.app.PracticeJPA.Workers.LecturesWorker;
import com.mycompany.app.PracticeJPA.Workers.StudentWorker;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		ClassRoom classroom = new ClassRoom();
		classroom.setBuilding(186);
		classroom.setFloor(5);
		classroom.setNumber(306);
		classroom.setNameOfClassRoom(ClassRoomName.LECTION);
		
		ClassRoomWorker classworker = (ClassRoomWorker)context.getBean("classworker");
		classworker.addClassRoom(classroom);
		

		
	
		
		
		Lecture lecture = new Lecture();
		lecture.setName("MOOP");
		lecture.setCredits(3.5);
		lecture.setBuilding(classroom.getBuilding());
		lecture.setFlour(classroom.getFloor());
		lecture.setNumber(classroom.getNumber());
		
		LecturesWorker worker = (LecturesWorker) context.getBean("worker");
		worker.addLecture(lecture);
		classroom.getLectures().add(lecture);
		
		
		for(int i=0;i<classroom.getLectures().size();i++){
		    System.out.println(classroom.getLectures().get(i).getBuilding() + " " + 
		    		classroom.getLectures().get(i).getFlour() + " " + classroom.getLectures().get(i).getNumber());
		} 
		

		
		Student student = new Student();
		student.setStudent_ticket_num(90302829);
		student.setFirstName("Kolya");
		student.setLastName("Vasylenko");
		student.setSpeciality("Applied Physic");
		student.setCourse(3);
		student.setEmail("inna78@gmail.com");
		student.setPhoneNumber("0936879541");
		Address adress = new Address("Ivana", "Kudri","Kiev","Kiev region","03000","Ukraine");
		student.setAddress(adress);
		
		
	StudentWorker stW = (StudentWorker) context.getBean("studentWorker");
		stW.addStudent(student);
		
		Student st2 = stW.getStudent(98952829);
		Student st3 = stW.getStudent(987522829);
		
		System.out.println(st2);
		System.out.println(lecture.getStudentList());
		lecture.getStudentList().add(st2);
		lecture.getStudentList().add(st3);
		
		student.getLecturesList().add(lecture);
		st2.getLecturesList().add(lecture);
		st3.getLecturesList().add(lecture);
		System.out.println("LECTURE LIST");
		for(int i=0;i<lecture.getStudentList().size();i++){
		    System.out.println(lecture.getStudentList().get(i).getStudent_ticket_num() + " "
		    		);
		} 
		System.out.println("LECTURE LIST!!!!!!!!!!!!!!!!!!!");
		for(int i=0;i<student.getLecturesList().size();i++){
		    System.out.println(student.getLecturesList().get(i).getId() + " "
		    		);
		} 
		
		
		Lecture_Student ls = new Lecture_Student();
		ls.setLectures_ID(lecture.getId());
	ls.setStudent_student_ticket_num(student.getStudent_ticket_num());
		LectureStudentWorker lsW = (LectureStudentWorker) context.getBean("lsWorker");
		lsW.addLecture_Student(ls);
		Student student1 = stW.getStudentById(250000458);
		System.out.println(student1);
		student1 = stW.getStudentById(250000458);
		System.out.println(student1);
		
	

		List<Student> customers = stW.findWithParam("Vasylenko");

	
		for(int i=0;i<customers.size();i++){
		    System.out.println(customers.get(i) + " "
		    		);
		}
	}
}
