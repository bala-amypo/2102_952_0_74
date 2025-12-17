package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Student;
@Pepository
public interface Studentrepository extends JpaRepository<Student,Long> {
    
}
