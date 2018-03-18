package com.mycompany.app.PracticeJPA.Workers;
import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.app.PracticeJPA.ClassRoom;
import com.mycompany.app.PracticeJPA.Interfaces.ClassRoomDao;

public class ClassRoomWorker {

	@Autowired
	ClassRoomDao classroomDao;
	
	public ClassRoom addClassRoom (ClassRoom classroom)
	{
		classroom  = classroomDao.addClassRoom(classroom);
		System.out.println("Building: " + classroom.getBuilding() + ", floor: "+ classroom.getFloor() + ", number: " + classroom.getNumber() + ", name: " + classroom.getNameOfClassRoom()  );
		return classroom;
		
	}
}
