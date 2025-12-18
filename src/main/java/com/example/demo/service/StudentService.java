package com.example.demo.service;
import java.util.*;
import com.example.demo.entity.Student;

public interface StudentService{
    Student postStudent(Student st);
    List<Student> getAllStudents();
    Optional<Student> getById(Long id);
    Student UpdateStudent(Long id,Student st);
    String updateData(Long id ,Student st);
    String deleteData(Long id);
}