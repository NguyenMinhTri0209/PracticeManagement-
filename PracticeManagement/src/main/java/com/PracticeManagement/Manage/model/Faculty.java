package com.PracticeManagement.Manage.model;

public class Faculty {
	String idfaculty;
	String name;

	public Faculty() {
	}

	public Faculty(String idfaculty, String name) {
		this.idfaculty = idfaculty;
		this.name = name;
	}

	public String getIdfaculty() {
		return idfaculty;
	}

	public void setIdfaculty(String idfaculty) {
		this.idfaculty = idfaculty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
