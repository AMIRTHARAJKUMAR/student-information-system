package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.project.entity.Student;
import com.example.project.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentrepository;

	public Student saveinfo(Student student) {
		return studentrepository.save(student);
	}

	public List<Student> show() {
		return studentrepository.findAll();
	}
	
	public Student updateinfo(Student student) {
		return studentrepository.saveAndFlush(student);
	}
	public void delete(Student student) {
		studentrepository.delete(student);
	}
	public List<Student> sort(String s)
	{
		return studentrepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}

	public List<Student> page(int pno, int psize)
	{
		Page<Student> page= studentrepository.findAll(PageRequest.of(pno,psize));
		return page.getContent();
	}

	public List<Student> pageAndSort(int pno, int psize, String s)
	{
		Page<Student> page= studentrepository.findAll(PageRequest.of(pno, psize, Sort.by(Sort.DEFAULT_DIRECTION,s)));
		return page.getContent();
	}
	public 	Student save(Student student) {
		return studentrepository.save(student);
	}
	
	
}