package com.PracticeManagement.Manage.model;

public class Toftest {
	String idtoftest;
	String name;
	long cost;

	public Toftest() {
	}

	public Toftest(String idtoftest, String name, long cost) {
		this.idtoftest = idtoftest;
		this.name = name;
		this.cost = cost;
	}

	public String getIdtoftest() {
		return idtoftest;
	}

	public void setIdtoftest(String idtoftest) {
		this.idtoftest = idtoftest;
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
