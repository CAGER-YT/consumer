package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class CourseDao {

	@Autowired
	CourseRepository cr;
	
	public String saveall(List<Course> c) {
		cr.saveAll(c);
		return "Saved Successfully";
	}
	public List<Course> getall(){
		return cr.findAll();
	}
	public Course postData(Course c) {
		//TODO: process POST request
		
		return cr.save(c);
	}
	public String patchData(int id,Course c) {
		Course x = cr.findById(id).orElseThrow(() -> new NoSuchElementException("Course not found with id " + id));

	    if (c.coursename != null) {
	        x.setCoursename(c.getCoursename());
	    }
	    if (c.coursefee  != 0) {
	        x.setCoursefee(c.getCoursefee ());
	    }
	    if (c.coursedurationdays != 0) {
	        x.setCoursedurationdays(c.getCoursedurationdays());
	    }

	    cr.save(x);
	    return "Updated Successfully";
	}
	public String deleteData(int id) {
		cr.deleteById(id);
		return "Delete Data Successfully";
	}
	public Course getbyid(int num){
		return cr.findById(num).get();
	}
	public List<Course> getdetails(String name){
		return cr.getdetails(name);
	}
	public Course getMax() {
		return cr.getMax();
	}
	public List<Course> getprice(int num1,int num2) {
		return cr.getprice(num1,num2);
	}
}
