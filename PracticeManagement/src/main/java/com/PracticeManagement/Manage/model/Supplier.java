package com.PracticeManagement.Manage.model;

public class Supplier {
	String idsupplier;
  	String name;
  	String address;
  	String phone;

	public Supplier() {
	}

	public Supplier(String idsupplier, String name, String address, String phone) {
		this.idsupplier = idsupplier;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getIdsupplier() {
		return idsupplier;
	}

	public void setIdsupplier(String idsupplier) {
		this.idsupplier = idsupplier;
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
}
