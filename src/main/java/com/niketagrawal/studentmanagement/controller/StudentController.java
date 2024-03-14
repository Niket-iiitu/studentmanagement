package com.niketagrawal.studentmanagement.controller;

import com.niketagrawal.studentmanagement.model.Student;
import com.niketagrawal.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Student added successfully";
    }
}
