package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column
	String coursename;
	int coursefee;
	int coursedurationdays;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(int coursefee) {
		this.coursefee = coursefee;
	}
	public int getCoursedurationdays() {
		return coursedurationdays;
	}
	public void setCoursedurationdays(int coursedurationdays) {
		this.coursedurationdays = coursedurationdays;
	}
	
	
}
