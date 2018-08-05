package com.websystique.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websystique.springboot.model.Message;
import com.websystique.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	Message findByStudentName(String studentName);
	
	Message findByRollNumber(String rollNumber);

}
