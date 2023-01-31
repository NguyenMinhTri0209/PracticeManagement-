package com.PracticeManagement.Manage.model;

public class Medicine {
	String idmedicine;
  	String name;
  	long cost;
  	String unit;
  	String idsupplier;

	public Medicine() {
	}

	public Medicine(String idmedicine, String name, long cost, String unit, String idsupplier) {
		this.idmedicine = idmedicine;
		this.name = name;
		this.cost = cost;
		this.unit = unit;
		this.idsupplier = idsupplier;
	}

	public String getIdmedicine() {
		return idmedicine;
	}

	public void setIdmedicine(String idmedicine) {
		this.idmedicine = idmedicine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getIdsupplier() {
		return idsupplier;
	}

	public void setIdsupplier(String idsupplier) {
		this.idsupplier = idsupplier;
	}
}
