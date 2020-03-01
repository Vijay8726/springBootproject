package com.virtusa.restfull.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeRoot {
	@Id
	private int empid;
	private String ename;
	private String email;
	private int contact;
	private String company;
	public int getEmpid() {
		return empid;
		
		
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

}
