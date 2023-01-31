package com.PracticeManagement.Manage.model;

import java.util.Date;

public class Healthrecord {
	
	String idhealthrecord;
	Date startdate;
	String iddoctor;
	String idpatient;
	String iddisease;
	double cost;

	public Healthrecord() {
	}

	public Healthrecord(String idhealthrecord, Date startdate, String iddoctor, String idpatient, String iddisease, double cost) {
		this.idhealthrecord = idhealthrecord;
		this.startdate = startdate;
		this.iddoctor = iddoctor;
		this.idpatient = idpatient;
		this.iddisease = iddisease;
		this.cost = cost;
	}

	public String getIdhealthrecord() {
		return idhealthrecord;
	}

	public void setIdhealthrecord(String idhealthrecord) {
		this.idhealthrecord = idhealthrecord;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getIddoctor() {
		return iddoctor;
	}

	public void setIddoctor(String iddoctor) {
		this.iddoctor = iddoctor;
	}

	public String getIdpatient() {
		return idpatient;
	}

	public void setIdpatient(String idpatient) {
		this.idpatient = idpatient;
	}

	public String getIddisease() {
		return iddisease;
	}

	public void setIddisease(String iddisease) {
		this.iddisease = iddisease;
	}

	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
}
