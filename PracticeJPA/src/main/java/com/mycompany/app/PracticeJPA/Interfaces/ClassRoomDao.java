package com.mycompany.app.PracticeJPA.Interfaces;

import com.mycompany.app.PracticeJPA.ClassRoom;
import com.mycompany.app.PracticeJPA.ClassRoomId;

public interface ClassRoomDao {
	
	ClassRoom getClassRoom (ClassRoomId id);
	ClassRoom addClassRoom (ClassRoom classroom);
	void saveClassRoom (ClassRoom classroom);

}
