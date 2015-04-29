package com.diwa.model;

import java.util.Date;

public class TModelA {
	private String nameString;
	private int workCode;
	private Date createSinceDate;
	private String useless;
	
	public String getUseless() {
		return useless;
	}
	public void setUseless(String useless) {
		this.useless = useless;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getWorkCode() {
		return workCode;
	}
	public void setWorkCode(int workCode) {
		this.workCode = workCode;
	}
	public Date getCreateSinceDate() {
		return createSinceDate;
	}
	public void setCreateSinceDate(Date createSinceDate) {
		this.createSinceDate = createSinceDate;
	}
	@Override
	public String toString() {
		return "TModelA [nameString=" + nameString + ", workCode=" + workCode
				+ ", createSinceDate=" + createSinceDate + ", useless="
				+ useless + "]";
	}
}
