package com.springboot.School.School.Model;

import jakarta.persistence.*;
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long student_id;
    @Column(nullable = false)
    public String student_name;
    @Column(nullable = false)
    public String depart;

    public Student(Long student_id, String student_name, String depart) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.depart = depart;
    }

    public Student() {

    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}
