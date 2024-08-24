package com.dhanesh.studentsystem.service;

import com.dhanesh.studentsystem.model.Student;

import java.util.List;
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
