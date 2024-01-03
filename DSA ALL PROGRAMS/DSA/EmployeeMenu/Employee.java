package com.demo.beans;

public class Employee {
	private int empid;
	private String fullName;
	private String gender;
	
	public Employee(int empid, String fullName, String gender) {
		super();
		this.empid = empid;
		this.fullName = fullName;
		this.gender = gender;
	}

	public Employee() {
		super();
	}
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "[empid=" + empid + ", fullName=" + fullName + ", gender=" + gender + "]";
	}

	
}
