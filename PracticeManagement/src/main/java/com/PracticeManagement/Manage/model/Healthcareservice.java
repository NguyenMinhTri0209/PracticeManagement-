package com.PracticeManagement.Manage.model;

public class Healthcareservice {
	String idhealthcareservice;
	String idpatient;

	public Healthcareservice() {
	}

	public Healthcareservice(String idhealthcareservice, String idpatient) {
		this.idhealthcareservice = idhealthcareservice;
		this.idpatient = idpatient;
	}

	public String getIdhealthcareservice() {
		return idhealthcareservice;
	}

	public void setIdhealthcareservice(String idhealthcareservice) {
		this.idhealthcareservice = idhealthcareservice;
	}

	public String getIdpatient() {
		return idpatient;
	}

	public void setIdpatient(String idpatient) {
		this.idpatient = idpatient;
	}
}
