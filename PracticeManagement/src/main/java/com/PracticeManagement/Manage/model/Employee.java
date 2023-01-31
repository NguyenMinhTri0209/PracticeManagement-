package com.PracticeManagement.Manage.model;

import java.util.Date;

public class Employee {
	String idemployee;
	String name;
	Date birthday;
	String address;
	boolean sex;
	String office;
	String phone;

	public Employee() {
	}

	public Employee(String idemployee, String name, Date birthday, String address, boolean sex, String office, String phone) {
		this.idemployee = idemployee;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.sex = sex;
		this.office = office;
		this.phone = phone;
	}

	public String getIdemployee() {
		return idemployee;
	}

	public void setIdemployee(String idemployee) {
		this.idemployee = idemployee;
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

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
