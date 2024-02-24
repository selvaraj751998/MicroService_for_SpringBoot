package com.springboot.School.School.Respository;

import com.springboot.School.School.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
