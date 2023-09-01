package com.example.project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Student;
import com.example.project.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/add")
	public Student adddata(@RequestBody Student studententity) {
		return service.saveinfo(studententity);
	}
	@GetMapping("/print")
	public List<Student> show(){
		return service.show();
	}
	@GetMapping("/studentSort/{field}")
	public List<Student> sort(@PathVariable String field)
	{
		return service.sort(field);
	}
	
	@GetMapping("/studentPage/{pno}/{psize}")
	public List<Student> sort(@PathVariable int pno, @PathVariable int psize)
	{
		return service.page(pno, psize);
	}
	
	@GetMapping("/studentPageAndSort/{pno}/{psize}/{field}")
	public List<Student> pageAndSort(@PathVariable int pno, @PathVariable int psize , @PathVariable String field)
	{
		return service.pageAndSort(pno, psize, field);
	}
	@PostMapping("add1")
	public Student save(@RequestBody Student student) {
	return service.saveinfo(student);
	}
	@GetMapping("print1")
	  public List<Student> getCoursebyStudent() {
	      return service.show();
	   }

}
