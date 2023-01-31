package com.PracticeManagement.Manage.model;

import java.util.Date;

public class Doctor {
	String iddoctor;
	String idfaculty;
	String name;
	String address;
	String phone;
	boolean sex;
	Date birthday;

	public Doctor() {
	}

	public Doctor(String iddoctor, String idfaculty, String name, String address, String phone, boolean sex, Date birthday) {
		this.iddoctor = iddoctor;
		this.idfaculty = idfaculty;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.sex = sex;
		this.birthday = birthday;
	}

	public String getIddoctor() {
		return iddoctor;
	}

	public void setIddoctor(String iddoctor) {
		this.iddoctor = iddoctor;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
