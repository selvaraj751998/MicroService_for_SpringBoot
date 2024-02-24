package com.springboot.School.School.Controller;

import com.springboot.School.School.Model.Student;
import com.springboot.School.School.Services.implementation.Studentimpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("student/api")
public class StudentController {

    public Studentimpl studentimpl;

    @PostMapping
   public ResponseEntity<Student> createUser(@RequestBody Student student)
    {
        Student updated_stud = studentimpl.create(student);
        System.out.println(studentimpl.create(student));
        return ResponseEntity.ok(updated_stud);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getUserById(@PathVariable("id") long id){
        Student student = studentimpl.getuserById(id);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllUser(){
        List<Student> students = studentimpl.getAllStudents();
        return new ResponseEntity<>(students,HttpStatus.OK);
    }

    @GetMapping("update/{id}")
    public ResponseEntity<Student> update(@PathVariable("id") Long studid,@RequestBody Student student){
            student.setStudent_id(studid);
        Student updatedstud = studentimpl.updateUser(student);
        return new ResponseEntity<>(student,HttpStatus.OK);

    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id)
    {
      studentimpl.deleteStudent(id);
      return new ResponseEntity<>("The User had been deleted",HttpStatus.OK);
    }
}
