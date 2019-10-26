package com.javabrains.model;

import java.util.List;

import javax.persistence.*;
@Entity
public class Student {

	@Id
	private int roll;
	private String name;
	private int marks;
	
	@ManyToMany(mappedBy="stds")
	private List<Laptop> laps;
	
	
	//getters & setters
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public List<Laptop> getLap() {
		return laps;
	}
	public void setLap(List<Laptop> laps) {
		this.laps = laps;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
