package com.example.thymeleaf_student.repository;

import com.example.thymeleaf_student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
