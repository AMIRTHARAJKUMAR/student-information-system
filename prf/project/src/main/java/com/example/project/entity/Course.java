package com.example.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CourseTable")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;  // String for the course name
    
    private String courseCode;  // String for a unique course code
    
    private String instructorName;  // String for the instructor's name
    
    private int creditHours;  // Integer for the credit hours of the course
    
    private String department; 
    public long getId() {
		return id;
}
    
    public Course() {
		super();
		
	}

	public Course(Long id, String courseName, String courseCode, String instructorName, int creditHours,
			String department) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.instructorName = instructorName;
		this.creditHours = creditHours;
		this.department = department;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}
