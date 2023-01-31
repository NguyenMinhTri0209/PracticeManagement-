package com.PracticeManagement.Manage.model;

public class Receiptdtl {
	String idreceipt;
	float discount;
	boolean paymenttype;

	public Receiptdtl() {
	}

	public Receiptdtl(String idreceipt, float discount, boolean paymenttype) {
		this.idreceipt = idreceipt;
		this.discount = discount;
		this.paymenttype = paymenttype;
	}

	public String getIdreceipt() {
		return idreceipt;
	}

	public void setIdreceipt(String idreceipt) {
		this.idreceipt = idreceipt;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public boolean isPaymenttype() {
		return paymenttype;
	}

	public void setPaymenttype(boolean paymenttype) {
		this.paymenttype = paymenttype;
	}
}
