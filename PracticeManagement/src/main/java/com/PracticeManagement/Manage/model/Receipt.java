package com.PracticeManagement.Manage.model;

import java.util.Date;

public class Receipt {
	String idreceipt; 
	String idemployee;
	String idpatient;
	Date checkatdate;

	public Receipt() {
	}

	public Receipt(String idreceipt, String idemployee, String idpatient, Date checkatdate) {
		this.idreceipt = idreceipt;
		this.idemployee = idemployee;
		this.idpatient = idpatient;
		this.checkatdate = checkatdate;
	}

	public String getIdreceipt() {
		return idreceipt;
	}

	public void setIdreceipt(String idreceipt) {
		this.idreceipt = idreceipt;
	}

	public String getIdemployee() {
		return idemployee;
	}

	public void setIdemployee(String idemployee) {
		this.idemployee = idemployee;
	}

	public String getIdpatient() {
		return idpatient;
	}

	public void setIdpatient(String idpatient) {
		this.idpatient = idpatient;
	}

	public Date getCheckatdate() {
		return checkatdate;
	}

	public void setCheckatdate(Date checkatdate) {
		this.checkatdate = checkatdate;
	}
}
