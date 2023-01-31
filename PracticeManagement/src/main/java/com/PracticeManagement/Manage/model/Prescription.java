package com.PracticeManagement.Manage.model;

public class Prescription {
	String idprescription;
	String idpatient;
	String iddoctor;

	public Prescription() {
	}

	public Prescription(String idprescription, String idpatient, String iddoctor) {
		this.idprescription = idprescription;
		this.idpatient = idpatient;
		this.iddoctor = iddoctor;
	}

	public String getIdprescription() {
		return idprescription;
	}

	public void setIdprescription(String idprescription) {
		this.idprescription = idprescription;
	}

	public String getIdpatient() {
		return idpatient;
	}

	public void setIdpatient(String idpatient) {
		this.idpatient = idpatient;
	}

	public String getIddoctor() {
		return iddoctor;
	}

	public void setIddoctor(String iddoctor) {
		this.iddoctor = iddoctor;
	}
}
