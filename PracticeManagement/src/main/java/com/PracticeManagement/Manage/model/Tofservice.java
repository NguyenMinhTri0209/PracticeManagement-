package com.PracticeManagement.Manage.model;

public class Tofservice {
	String idservice;
	String name;
	long cost;

	public Tofservice() {
	}

	public Tofservice(String idservice, String name, long cost) {
		this.idservice = idservice;
		this.name = name;
		this.cost = cost;
	}

	public String getIdservice() {
		return idservice;
	}

	public void setIdservice(String idservice) {
		this.idservice = idservice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}
}
