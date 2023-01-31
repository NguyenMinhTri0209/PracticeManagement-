package com.PracticeManagement.Manage.model;

public class Tofprevent {
	String idtofroom;
	String name;
	int quantities;
	boolean status;
	long cost;

	public Tofprevent() {
	}

	public Tofprevent(String idtofroom, String name, int quantities, boolean status, long cost) {
		this.idtofroom = idtofroom;
		this.name = name;
		this.quantities = quantities;
		this.status = status;
		this.cost = cost;
	}

	public String getIdtofroom() {
		return idtofroom;
	}

	public void setIdtofroom(String idtofroom) {
		this.idtofroom = idtofroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantities() {
		return quantities;
	}

	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}
}
