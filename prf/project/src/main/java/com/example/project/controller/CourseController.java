package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Course;
import com.example.project.Service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService courseservice;
	
	@PostMapping("/addcourse")
	public Course adddata(@RequestBody Course course) {
		return courseservice.saveinfo(course);
	}
	@GetMapping("/printcourse")
	public List<Course> show(){
		return courseservice.show();
	}
	@GetMapping("courseSort/{field}")
	public List<Course> sort(@PathVariable String field)
	{
		return courseservice.sort(field);
	}
	
	@GetMapping("coursePage/{pno}/{psize}")
	public List<Course> sort(@PathVariable int pno, @PathVariable int psize)
	{
		return courseservice.page(pno, psize);
	}
	
	@GetMapping("coursePageAndSort/{pno}/{psize}/{field}")
	public List<Course> pageAndSort(@PathVariable int pno, @PathVariable int psize , @PathVariable String field)
	{
		return courseservice.pageAndSort(pno, psize, field);
	}
}