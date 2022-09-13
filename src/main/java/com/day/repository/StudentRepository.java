package com.day.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>  {

}
