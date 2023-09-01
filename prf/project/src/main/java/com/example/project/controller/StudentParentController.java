package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.StudentParent;
import com.example.project.Service.StudentParentService;

@RestController
public class StudentParentController {
	@Autowired
	StudentParentService studentparentservice;
	
	@PostMapping("/addparent")
	public StudentParent adddata(@RequestBody StudentParent studentParententity) {
		return studentparentservice.saveinfo(studentParententity);
	}
	@GetMapping("/printparent")
	public List<StudentParent> show(){
		return studentparentservice.show();
	}
	@GetMapping("/studentparentSort/{field}")
	public List<StudentParent> sort(@PathVariable String field)
	{
		return studentparentservice.sort(field);
	}
	
	@GetMapping("/studentparentPage/{pno}/{psize}")
	public List<StudentParent> sort(@PathVariable int pno, @PathVariable int psize)
	{
		return studentparentservice.page(pno, psize);
	}
	
	@GetMapping("/studentparentPageAndSort/{pno}/{psize}/{field}")
	public List<StudentParent> pageAndSort(@PathVariable int pno, @PathVariable int psize , @PathVariable String field)
	{
		return studentparentservice.pageAndSort(pno, psize, field);
	}
}
