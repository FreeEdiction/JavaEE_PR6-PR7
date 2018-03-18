package com.mycompany.app.PracticeJPA.JPAImpl;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.app.PracticeJPA.ClassRoom;
import com.mycompany.app.PracticeJPA.ClassRoomId;
import com.mycompany.app.PracticeJPA.Interfaces.ClassRoomDao;

@Repository
@Transactional
public class ClassRoomDaoJPAImpl implements ClassRoomDao {
	@PersistenceContext
	private EntityManager em;

	public ClassRoom getClassRoom(ClassRoomId id) {
		return em.find(ClassRoom.class, id);
	}

	public ClassRoom addClassRoom(ClassRoom classroom) {
		em.persist(classroom);
		return classroom;
	}

	public void saveClassRoom(ClassRoom classroom) {
		// TODO Auto-generated method stub
		em.merge(classroom);
	}

}
