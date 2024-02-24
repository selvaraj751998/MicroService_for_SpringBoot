package com.springboot.School.School.Services.implementation;

import com.springboot.School.School.Model.Student;
import com.springboot.School.School.Respository.StudentRepository;
import com.springboot.School.School.Services.Studentinterface;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Studentimpl implements Studentinterface {

    public StudentRepository studentRepository;
    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getuserById(Long id) {
        Optional<Student> optionalStudent =studentRepository.findById(id);
        return optionalStudent.get();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void  deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }


    public Student updateUser(Student student){
        Student existingStud = studentRepository.findById(student.getStudent_id()).get();
        existingStud.setStudent_id(student.getStudent_id());
        existingStud.setStudent_name(student.getStudent_name());
        existingStud.setDepart(student.getDepart());

        Student updatedstud = studentRepository.save(existingStud);
        return updatedstud;
    }

}
