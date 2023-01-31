package com.PracticeManagement.Manage.model;

import java.util.Date;

public class Healthcareservicedtl {
	String idhealthcareservice;
	String idservice;
	Date useatdate;
	int quantities;

	public Healthcareservicedtl() {
	}

	public Healthcareservicedtl(String idhealthcareservice, String idservice, Date useatdate, int quantities) {
		this.idhealthcareservice = idhealthcareservice;
		this.idservice = idservice;
		this.useatdate = useatdate;
		this.quantities = quantities;
	}

	public String getIdhealthcareservice() {
		return idhealthcareservice;
	}

	public void setIdhealthcareservice(String idhealthcareservice) {
		this.idhealthcareservice = idhealthcareservice;
	}

	public String getIdservice() {
		return idservice;
	}

	public void setIdservice(String idservice) {
		this.idservice = idservice;
	}

	public Date getUseatdate() {
		return useatdate;
	}

	public void setUseatdate(Date useatdate) {
		this.useatdate = useatdate;
	}

	public int getQuantities() {
		return quantities;
	}

	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}
}
