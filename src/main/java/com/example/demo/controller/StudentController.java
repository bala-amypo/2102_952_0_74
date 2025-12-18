package com.example.demo.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
@RestController
public class StudentController {
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stdser.postStudent(st);
    }
    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return stdser.getAllStudents();
    }
    @GetMapping("/getById/{id}")
    public Optional<Student> getId(@PathVariable Long id){
        return stdser.getById(id);
    }
    @PutMapping("/{id}")
    public Student UpdateStudent(@PathVariable Long id, @RequestBody Student st) {
        return stdser.UpdateStudent(id, st);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Student st){
        return stdser.updateData(id,st);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return stdser.deleteStudent(id);
    }
}
