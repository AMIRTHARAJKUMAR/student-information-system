package com.example.project.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentParentTable")
public class StudentParent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentparentId;
    private String motherName;
    private String fatherName;
    private String email;
    private String phoneNumber;
    private String occupation;
    private String workplace;
    
    
	public StudentParent() {
		super();
		
	}


	public StudentParent(String motherName, String fatherName, String email, String phoneNumber, String occupation,
			String workplace) {
		super();
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.occupation = occupation;
		this.workplace = workplace;
	}


	public String getMotherName() {
		return motherName;
	}


	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public String getWorkplace() {
		return workplace;
	}


	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	
	
    
    

}
