package com.javabrains.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String lname;
	
	@ManyToMany
	private List<Student> stds;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public List<Student> getStds() {
		return stds;
	}
	public void setStds(List<Student> stds) {
		this.stds = stds;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	
	
}
