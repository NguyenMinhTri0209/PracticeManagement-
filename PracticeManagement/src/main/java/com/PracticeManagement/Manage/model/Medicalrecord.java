package com.PracticeManagement.Manage.model;

import java.util.Date;

public class Medicalrecord {
	String idmedicalrecord;
	Date startdate;
	Date endstart;
	String reason;
	String idpatient;
	String iddoctor;

	public Medicalrecord() {
	}

	public Medicalrecord(String idmedicalrecord, Date startdate, Date endstart, String reason, String idpatient, String iddoctor) {
		this.idmedicalrecord = idmedicalrecord;
		this.startdate = startdate;
		this.endstart = endstart;
		this.reason = reason;
		this.idpatient = idpatient;
		this.iddoctor = iddoctor;
	}

	public String getIdmedicalrecord() {
		return idmedicalrecord;
	}

	public void setIdmedicalrecord(String idmedicalrecord) {
		this.idmedicalrecord = idmedicalrecord;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEndstart() {
		return endstart;
	}

	public void setEndstart(Date endstart) {
		this.endstart = endstart;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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
