package com.diwa.model;

import java.util.Date;

public class TModelB {
	private String name_string;
	private int work_code;
	private Date create_since_Date;
	private String wahaString;
	
	public String getName_string() {
		return name_string;
	}
	public void setName_string(String name_string) {
		this.name_string = name_string;
	}
	public int getWork_code() {
		return work_code;
	}
	public void setWork_code(int work_code) {
		this.work_code = work_code;
	}
	public String getWahaString() {
		return wahaString;
	}
	public void setWahaString(String wahaString) {
		this.wahaString = wahaString;
	}
	public Date getCreate_since_Date() {
		return create_since_Date;
	}
	public void setCreate_since_Date(Date create_since_Date) {
		this.create_since_Date = create_since_Date;
	}
	@Override
	public String toString() {
		return "TModelB [name_string=" + name_string + ", work_code="
				+ work_code + ", create_since_Date=" + create_since_Date
				+ ", wahaString=" + wahaString + "]";
	}
}
