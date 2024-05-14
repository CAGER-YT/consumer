package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CourseService {
	@Autowired
	CourseDao cd;
	
	public String saveall(List<Course> c) {
		return cd.saveall(c);
	}
	public List<Course> getall(){
		return cd.getall();
	}
	public Course postData(Course c) {
		//TODO: process POST request
		return cd.postData(c);
	}
	public String patchData(int id,Course c) {
		return cd.patchData(id,c);
	}
	public String deleteData(int id) {
		return cd.deleteData(id);
	}
	public Course getbyid(int num){
		return cd.getbyid(num);
	}
	public List<Course> getdetails(String name){
		return cd.getdetails(name);
	}
	public Course getMax() {
		return cd.getMax();
	}
	public List<Course> getprice(int num1,int num2) {
		return cd.getprice(num1,num2);
	}
}
