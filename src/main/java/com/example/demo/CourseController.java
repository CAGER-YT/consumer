package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CourseController {
	
	@Autowired
	CourseService cs;
	
	@PostMapping("/saveall")
	public String saveall(@RequestBody List<Course> c) {
		return cs.saveall(c);
	}
	@GetMapping("/getall")
	public List<Course> getall(){
		return cs.getall();
	}
	@PostMapping("/save")
	public Course postData(@RequestBody Course c) {
		//TODO: process POST request
		return cs.postData(c);
	}
	@PatchMapping("/path/{id}")
	public String patchData(@PathVariable int id,@RequestBody Course c) {
		return cs.patchData(id,c);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		return cs.deleteData(id);
	}
	
	@GetMapping("/getbyid/{num}")
	public Course getbyid(@PathVariable int num){
		return cs.getbyid(num);
	}
	@GetMapping("/getbyname/{name}")
	public List<Course> getdetails(@PathVariable String name){
		return cs.getdetails(name);
	}
	@GetMapping("/getmax")
	public Course getMax() {
		return cs.getMax();
	}
	@GetMapping("/getprice/{num1}/{num2}")
	public List<Course> getprice(@PathVariable int num1,@PathVariable int num2) {
		return cs.getprice(num1,num2);
	}
}
