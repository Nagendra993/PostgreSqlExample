package com.gi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {

	@Id
	private String ename;
	
	private String esal;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsal() {
		return esal;
	}

	public void setEsal(String esal) {
		this.esal = esal;
	}
	
	
}
