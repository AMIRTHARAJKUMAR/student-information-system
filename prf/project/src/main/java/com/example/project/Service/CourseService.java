package com.example.project.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.project.entity.Course;

import com.example.project.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository courserepository;

	public Course saveinfo(Course i) {
		return courserepository.save(i);
	}

	public List<Course> show() {
		return courserepository.findAll();
	}
	
	public Course updateinfo(Course course) {
		return courserepository.saveAndFlush(course);
	}
	public void delete(Course course) {
		courserepository.delete(course);
	}
	public List<Course> sort(String s)
	{
		return courserepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}

	public List<Course> page(int pno, int psize)
	{
		Page<Course> page= courserepository.findAll(PageRequest.of(pno,psize));
		return page.getContent();
	}

	public List<Course> pageAndSort(int pno, int psize, String s)
	{
		Page<Course> page= courserepository.findAll(PageRequest.of(pno, psize, Sort.by(Sort.DEFAULT_DIRECTION,s)));
		return page.getContent();
	}
}