package com.mycompany.app.PracticeJPA;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@IdClass(ClassRoomId.class)
public class ClassRoom {

	@Id
	private int building;
	@Id
	private int floor;
	@Id
	private int number;
	
	@Enumerated(EnumType.STRING)
	private ClassRoomName nameOfClassRoom;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumns({@JoinColumn(name = "building"),
		@JoinColumn(name = "floor"),
		@JoinColumn(name = "number")})
	private List<Lecture> lectures = new ArrayList<Lecture>();

	public ClassRoomName getNameOfClassRoom() {
		return nameOfClassRoom;
	}

	public int getBuilding() {
		return building;
	}

	public void setBuilding(int building) {
		this.building = building;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setNameOfClassRoom(ClassRoomName nameOfClassRoom) {
		this.nameOfClassRoom = nameOfClassRoom;
	}

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}
}

