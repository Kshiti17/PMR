package com.PMR.main.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotNull;

public class Unit {
	private String unitID;
	@NotNull
	private Address unitaddress;
	@NotNull
	private String monthlypayment;
	@NotNull
	private String monthlyPaymentDate;
	@NotNull
	private String propertyID;
	@NotNull
	private String unitstatus;
	@NotNull
	private String currenttenent;
	@NotNull
	private String unitname;
	
	private String unitcreated;	

	public Unit() {
	}

	public Unit(String unitID, Address unitaddress, String monthlypayment, String propertyID,
			String unitstatus, String currenttenent, String unitname, String unitcreated,String monthlyPaymentDate) {
		super();
		this.unitID = unitID;
		this.unitaddress = unitaddress;
		this.monthlypayment = monthlypayment;
		this.propertyID = propertyID;
		this.unitstatus = unitstatus;
		this.currenttenent = currenttenent;
		this.unitname = unitname;
		this.unitcreated = unitcreated;
		this.monthlyPaymentDate = monthlyPaymentDate;
	}

	public String getUnitID() {
		return unitID;
	}

	public void setUnitID(String unitID) {
		this.unitID = unitID;
	}

	public Address getUnitaddress() {
		return unitaddress;
	}

	public void setUnitaddress(Address unitaddress) {
		this.unitaddress = unitaddress;
	}

	public String getMonthlypayment() {
		return monthlypayment;
	}

	public void setMonthlypayment(String monthlypayment) {
		this.monthlypayment = monthlypayment;
	}
	
	public String getMonthlyPaymentDate() {
		return monthlyPaymentDate;
	}

	public void setMonthlyPaymentDate(String monthlyPaymentDate) {
		this.monthlyPaymentDate = monthlyPaymentDate;
	}

	public String getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(String propertyID) {
		this.propertyID = propertyID;
	}

	public String getUnitstatus() {
		return unitstatus;
	}

	public void setUnitstatus(String unitstatus) {
		this.unitstatus = unitstatus;
	}

	public String getCurrenttenent() {
		return currenttenent;
	}

	public void setCurrenttenent(String currenttenent) {
		this.currenttenent = currenttenent;
	}

	public String getUnitname() {
		return unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	public String getAccountcreated() {
		return unitcreated;
	}

	public void setAccountcreated() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		this.unitcreated = dateFormat.format(date);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Unit [unitID=");
		builder.append(unitID);
		builder.append(", unitaddress=");
		builder.append(unitaddress);
		builder.append(", monthlypayment=");
		builder.append(monthlypayment);
		builder.append(", propertyID=");
		builder.append(propertyID);
		builder.append(", unitstatus=");
		builder.append(unitstatus);
		builder.append(", currenttenent=");
		builder.append(currenttenent);
		builder.append(", unitname=");
		builder.append(unitname);
		builder.append(", unitcreated=");
		builder.append(unitcreated);
		builder.append(", monthlyPaymentDate=");
		builder.append(monthlyPaymentDate);
		builder.append("]");
		return builder.toString();
	}
}
