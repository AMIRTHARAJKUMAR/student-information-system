package com.example.project.entity;
//import java.util.List;

import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.persistence.OneToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.JoinColumn;

@Entity
@Table(name="StudentTable")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String studentName;
	private String studentEmail;
	private String studentAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private StudentParent student;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id")
	private List<Course> course;
	public StudentParent getStudent() {
		return student;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public void setStudent(StudentParent student) {
		this.student = student;
	}
	public long getId() {
		return id;
	}
	
	
	public Student() {
		super();
		
	}


	public Student(long id, String studentName, String studentEmail, String studentAddress) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentAddress = studentAddress;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	
    
	
}
