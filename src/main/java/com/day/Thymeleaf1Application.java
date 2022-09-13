package com.day;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.day.entity.Student;
import com.day.repository.StudentRepository;

@SpringBootApplication
public class Thymeleaf1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Thymeleaf1Application.class, args);
	}
	
	@SuppressWarnings("unused")
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Ramesh", "Fadatare", "rana@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Jewel", "Rana", "jewel@gmail.com");
		 * studentRepository.save(student2);
		 */
	}

}
