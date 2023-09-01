package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.project.entity.StudentParent;
import com.example.project.repository.StudentParentRepository;

@Service
public class StudentParentService {
	@Autowired
	StudentParentRepository studentparentrepository;

	public StudentParent saveinfo(StudentParent studentparent) {
		return studentparentrepository.save(studentparent);
	}

	public List<StudentParent> show() {
		return studentparentrepository.findAll();
	}
	
	public StudentParent updateinfo(StudentParent studentparent) {
		return studentparentrepository.saveAndFlush(studentparent);
	}
	public void delete(StudentParent studentparent) {
		studentparentrepository.delete(studentparent);
	}
	public List<StudentParent> sort(String s)
	{
		return studentparentrepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}

	public List<StudentParent> page(int pno, int psize)
	{
		Page<StudentParent> page= studentparentrepository.findAll(PageRequest.of(pno,psize));
		return page.getContent();
	}

	public List<StudentParent> pageAndSort(int pno, int psize, String s)
	{
		Page<StudentParent> page= studentparentrepository.findAll(PageRequest.of(pno, psize, Sort.by(Sort.DEFAULT_DIRECTION,s)));
		return page.getContent();
	}
}