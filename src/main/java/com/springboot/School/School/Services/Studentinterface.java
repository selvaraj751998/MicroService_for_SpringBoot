package com.springboot.School.School.Services;

import com.springboot.School.School.Model.Student;

import java.util.List;

public interface Studentinterface {
    public Student create(Student student);
    public Student getuserById(Long id);
    public List<Student> getAllStudents();
    public void deleteStudent(Long id);

}
