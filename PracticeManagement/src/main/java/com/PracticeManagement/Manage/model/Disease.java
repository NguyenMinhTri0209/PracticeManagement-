package com.PracticeManagement.Manage.model;

public class Disease {
	String iddisease;
	String name;
	String symptom;

	public Disease() {
	}

	public Disease(String iddisease, String name, String symptom) {
		this.iddisease = iddisease;
		this.name = name;
		this.symptom = symptom;
	}

	public String getIddisease() {
		return iddisease;
	}

	public void setIddisease(String iddisease) {
		this.iddisease = iddisease;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
}
