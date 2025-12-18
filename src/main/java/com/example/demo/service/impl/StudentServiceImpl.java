package com.example.demo.service.impl;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
   @Autowired
   StudentRepository stdrepo;
   @Override
    public Student postStudent(Student st){
        return stdrepo.save(st);
    }
    @Override
    public List<Student> getAllStudents() {
        return stdrepo.findAll();
    }
    @Override
    public Optional<Student> getById(Long id){
         return stdrepo.findById(id);
    }
    @Override
    public Student UpdateStudent(Long id, Student st) {
        st.setId(id);
        return stdrepo.save(st);
    }
    @Override
    public String updateData(Long id,Student st){
        boolean status=stdrepo.existsById(id);
        if(status){
            st.setId(id);
            stdrepo.save(st);
            return "Student updated successfully";
        }
        else{
            return "Student with Id "+id+" NOT FOUND";
        }
    }
    @Override
    public String deleteData(long id){
      boolean status=stdrepo.existsById(id);
      if(status{
       stdrepo.deleteById(id);
       return "Student  
      }     
        }
}
