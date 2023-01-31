package com.PracticeManagement.Manage.model;

public class Prescriptiondtl {
	String idprescription;
	String idmedicine;
	int amount;

	public Prescriptiondtl() {
	}

	public Prescriptiondtl(String idprescription, String idmedicine, int amount) {
		this.idprescription = idprescription;
		this.idmedicine = idmedicine;
		this.amount = amount;
	}

	public String getIdprescription() {
		return idprescription;
	}

	public void setIdprescription(String idprescription) {
		this.idprescription = idprescription;
	}

	public String getIdmedicine() {
		return idmedicine;
	}

	public void setIdmedicine(String idmedicine) {
		this.idmedicine = idmedicine;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
