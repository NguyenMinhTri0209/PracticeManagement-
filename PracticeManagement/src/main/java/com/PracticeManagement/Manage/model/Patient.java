package com.PracticeManagement.Manage.model;

import java.util.Date;

public class Patient {
	String idpatient;
	String name;
	Date birthday;
	String address;
	boolean sex;
	String requests;
	String objects;
	String phone;

	public Patient() {
	}

	public Patient(String idpatient, String name, Date birthday, String address, boolean sex, String requests, String objects, String phone) {
		this.idpatient = idpatient;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.sex = sex;
		this.requests = requests;
		this.objects = objects;
		this.phone = phone;
	}

	public String getIdpatient() {
		return idpatient;
	}

	public void setIdpatient(String idpatient) {
		this.idpatient = idpatient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getRequests() {
		return requests;
	}

	public void setRequests(String requests) {
		this.requests = requests;
	}

	public String getObjects() {
		return objects;
	}

	public void setObjects(String objects) {
		this.objects = objects;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
