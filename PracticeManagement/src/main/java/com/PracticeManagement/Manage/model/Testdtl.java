package com.PracticeManagement.Manage.model;

import java.util.Date;

public class Testdtl {
	String idtestdtl;
	String idtoftest;
	String idpatient;
	Date startdate;
	String result;
	String reason;

	public Testdtl() {

	}

	public Testdtl(String idtestdtl, String idtoftest, String idpatient, Date startdate, String result, String reason) {
		this.idtestdtl = idtestdtl;
		this.idtoftest = idtoftest;
		this.idpatient = idpatient;
		this.startdate = startdate;
		this.result = result;
		this.reason = reason;
	}

	public String getIdtestdtl() {
		return idtestdtl;
	}

	public void setIdtestdtl(String idtestdtl) {
		this.idtestdtl = idtestdtl;
	}

	public String getIdtoftest() {
		return idtoftest;
	}

	public void setIdtoftest(String idtoftest) {
		this.idtoftest = idtoftest;
	}

	public String getIdpatient() {
		return idpatient;
	}

	public void setIdpatient(String idpatient) {
		this.idpatient = idpatient;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
