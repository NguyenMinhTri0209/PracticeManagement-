package com.PracticeManagement.Manage.model;

public class Prevent {
	String idprevent;
	String idtofroom;
	String idpatient;
	String numberofthebed;
	String numberoftheroom;
	String roomname;

	public Prevent() {
	}

	public Prevent(String idprevent, String idtofroom, String idpatient, String numberofthebed, String numberoftheroom, String roomname) {
		this.idprevent = idprevent;
		this.idtofroom = idtofroom;
		this.idpatient = idpatient;
		this.numberofthebed = numberofthebed;
		this.numberoftheroom = numberoftheroom;
		this.roomname = roomname;
	}

	public String getIdprevent() {
		return idprevent;
	}

	public void setIdprevent(String idprevent) {
		this.idprevent = idprevent;
	}

	public String getIdtofroom() {
		return idtofroom;
	}

	public void setIdtofroom(String idtofroom) {
		this.idtofroom = idtofroom;
	}

	public String getIdpatient() {
		return idpatient;
	}

	public void setIdpatient(String idpatient) {
		this.idpatient = idpatient;
	}

	public String getNumberofthebed() {
		return numberofthebed;
	}

	public void setNumberofthebed(String numberofthebed) {
		this.numberofthebed = numberofthebed;
	}

	public String getNumberoftheroom() {
		return numberoftheroom;
	}

	public void setNumberoftheroom(String numberoftheroom) {
		this.numberoftheroom = numberoftheroom;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
}
