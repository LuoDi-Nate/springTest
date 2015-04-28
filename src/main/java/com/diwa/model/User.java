package com.diwa.model;

import java.sql.Timestamp;
import java.util.Date;

public class User {
	private String name;
	private int id;
	private int age;
	private String passwd;
	private boolean gender;
	private Date time1;
	private Timestamp time2;
	
	
	public Date getTime1() {
		return time1;
	}
	public void setTime1(Date time1) {
		this.time1 = time1;
	}
	public Timestamp getTime2() {
		return time2;
	}
	public void setTime2(Timestamp time2) {
		this.time2 = time2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}
