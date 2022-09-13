package com.day.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.day.entity.Student;
import com.day.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	//handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("new")
	public String createStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "create_student";
	}
	
	@PostMapping("save")
	public String saveStudent(@ModelAttribute Student student) {
		studentService.saveStudent(student);
		return "redirect:students";
	}
	
	@GetMapping("/edit/{id}")
	public String editstudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute Student student, Model model) {
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirsName(student.getFirsName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		studentService.updateStudent(existingStudent);
		return "redirect:students";
	}
	
	@GetMapping("/{id}")
	public String deleteStuedent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:students";
	}
}
