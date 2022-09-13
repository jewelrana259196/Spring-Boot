package com.day.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.day.entity.Student;



@Service
public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent (Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent (Student student);
	
	void deleteStudentById(Long id);
	
}
