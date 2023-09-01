package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.entity.*;

public interface StudentParentRepository extends JpaRepository<StudentParent, Long> {

}
