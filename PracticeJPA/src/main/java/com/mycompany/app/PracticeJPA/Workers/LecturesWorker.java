package com.mycompany.app.PracticeJPA.Workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.mycompany.app.PracticeJPA.Lecture;
import com.mycompany.app.PracticeJPA.Interfaces.LecturesDao;

public class LecturesWorker {
	@Autowired
	private TransactionTemplate transactionTemplate;
	@Autowired
	LecturesDao lecturesDao;

	public Lecture addLecture(final Lecture lecture) {
		transactionTemplate.execute(new TransactionCallback<Void>() {
			public Void doInTransaction(TransactionStatus txStatus) {
				try {
					lecturesDao.addLecture(lecture);
					System.out.println(lecture + "   = [id = " + lecture.getId() + ", name = " + lecture.getName() + ", credits = "
							+ lecture.getCredits() + " building" + lecture.getBuilding() + " floor  " + lecture.getFlour()
							+ " number " + lecture.getNumber() + "]");
					System.out.println(txStatus);
				} catch (RuntimeException e) {
					txStatus.setRollbackOnly();
					throw e;
				}
				return null;
			}
		});
		return lecture;
	}

}
