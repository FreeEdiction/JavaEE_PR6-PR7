package com.mycompany.app.PracticeJPA;

import java.io.Serializable;

public class ClassRoomId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3164389119529739602L;
	private int building;
	private int floor;
	private int number;

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + building;
		result = prime * result + floor;
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassRoomId other = (ClassRoomId) obj;
		if (building != other.building)
			return false;
		if (floor != other.floor)
			return false;
		if (number != other.number)
			return false;
		return true;
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
	
}
