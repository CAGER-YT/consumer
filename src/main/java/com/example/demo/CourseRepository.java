package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CourseRepository extends JpaRepository<Course, Integer>{

	@Query(value="select * from course where coursename like ?",nativeQuery =true)
	public List<Course> getdetails(String name);
	@Query(value="select * from course where coursefee=(select max(coursefee) from course)",nativeQuery =true)
	public Course getMax();
	@Query(value="select * from course where coursefee>= ? and coursefee <= ?",nativeQuery =true)
	public List<Course> getprice(int num1,int num2);

}
